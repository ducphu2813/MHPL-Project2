package com.main.project2.TestConn;

import com.main.project2.DAL.khoaDAL;
import com.main.project2.DAL.nganhDAL;
import com.main.project2.DAL.thanhvienDAL;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.main.project2.DAL.HibernateUtil;
import com.main.project2.DAL.model.*;
import java.util.List;

public class TestConnect {
	
	
	public static void main(String[] args)
	{
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			session.beginTransaction();

			thanhvienDAL thanhvienDAL = new thanhvienDAL();

			//thêm thành viên
			thanhvien tv = new thanhvien();
			tv.setTen("Nguyễn Quang");
			tv.setKhoa(session.get(khoa.class, 23));
			tv.setNganh(session.get(nganh.class, 9));
			thanhvienDAL.add(tv);

			//sửa thành viên
			tv.setTen("Trần Trứng");
			thanhvienDAL.update(tv);

			//xóa thành viên
			thanhvienDAL.deleteById(tv.getId());

			//xuất danh sách
			List<thanhvien> thanhviens = thanhvienDAL.getAll();
			thanhviens.forEach(System.out::println);
//

//			List<nganh> nganhs = session.createQuery("FROM nganh", nganh.class).list();
//			nganhs.forEach(System.out::println);
//


			
//			Member member = session.get(Member.class, 4);
//			System.out.println(""+member.toString());
			//khi không tìm thấy sẽ quăng ra NullPointerException
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			HibernateUtil.shutdown();
		}
		
	}
	
	public List<khoa> getAll()
	{
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        Transaction transaction = session.beginTransaction();
	        List<khoa> deps = session.createQuery("FROM khoa", khoa.class).list();
	        return deps;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}
	
	public boolean add(khoa dep)
	{
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        Transaction transaction = session.beginTransaction();
	        session.persist(dep);
	        transaction.commit();
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
//		finally {
//			HibernateUtil.shutdown();
//		}
	}
	
	public boolean update(khoa dep)
	{
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			session.merge(dep);
			transaction.commit();
			return true;
		}
		catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
//		finally {
//			HibernateUtil.shutdown();
//		}
	}
	
	public boolean delete(int id)
	{
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        Transaction transaction = session.beginTransaction();
	        khoa khoa = session.get(khoa.class, id);
	        if (khoa != null) {
	            session.remove(khoa);
	            transaction.commit();
	            return true;
	        } else {
	            System.out.println("Department not found with ID: " + id);
	            return false;
	        }
	    } catch (NullPointerException nullPointerException) {
	        nullPointerException.printStackTrace();
	        return false;
	    }
//		finally {
//			HibernateUtil.shutdown();
//		}
	}
	
	public boolean save(khoa dep)
	{
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        Transaction transaction = session.beginTransaction();
	        session.saveOrUpdate(dep);
	        transaction.commit();
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }finally {
			HibernateUtil.shutdown();
		}
	}
}

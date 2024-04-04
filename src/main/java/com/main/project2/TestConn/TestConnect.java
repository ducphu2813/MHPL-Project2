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
			thanhvien member = new thanhvien();
			member.setTen("Nguyễn Quang");
			member.setKhoa(session.get(khoa.class, 23));
			member.setNganh(session.get(nganh.class, 9));
//
			thanhvienDAL.add(member);
//
//			Member member2 = new Member();
//			member2.setName("Quang Huy");
//			member2.setDepartment(session.get(Department.class, 1));
//			member2.setMajor(session.get(Major.class, 1));
//			System.out.println(member2.toString());
//
//			Member member3 = new Member();
//			member3.setName("Trần Phượng");
//			member3.setDepartment(session.get(Department.class, 2));
//			member3.setMajor(session.get(Major.class, 2));
//			System.out.println(member3.toString());
//
//			Member member4 = new Member();
//			member4.setName("Nguyễn Giang");
//			member4.setDepartment(session.get(Department.class, 2));
//			member4.setMajor(session.get(Major.class, 2));
//			System.out.println(member4.toString());
//
//			session.persist(member);
//			session.persist(member2);
//			session.persist(member3);
//			session.persist(member4);

//			nganhDAL nganhDAO = new nganhDAL();
//	        List<nganh> nganhs = nganhDAO.getAll();
//			nganhs.forEach(System.out::println);
//
//			khoaDAL khoaDAO = new khoaDAL();
//			List<khoa> khoas = khoaDAO.getAll();
//			khoas.forEach(System.out::println);

//			Major major = new Major();
//			major.setName("KTPM");
//			session.persist(major);

//			List<nganh> nganhs = session.createQuery("FROM nganh", nganh.class).list();
//			nganhs.forEach(System.out::println);
//
			List<thanhvien> thanhviens = thanhvienDAL.getAll();
			thanhviens.forEach(System.out::println);

//			List<Violation> violations = session.createQuery("FROM Violation", Violation.class).list();
//			violations.forEach(System.out::println);
			
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

package com.main.project2.DAL;

import com.main.project2.DAL.model.thanhvien;
import org.hibernate.Session;

import java.util.List;

public class thanhvienDAL {

    thanhvien_sequenceDAL sequenceDAL;

    public thanhvienDAL() {
        this.sequenceDAL = new thanhvien_sequenceDAL();
    }

    public Session openNewSession()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session;
    }

    public thanhvien findById(Long id){
        Session session = openNewSession();
        try{
            return session.get(thanhvien.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

    public boolean add(thanhvien thanhvienTemp) {
        Session session = openNewSession();
        try {
            session.beginTransaction();
            thanhvienTemp.setId(generateId(thanhvienTemp));
            session.persist(thanhvienTemp);
            sequenceDAL.updateIndex();
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return false;
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

    public boolean addList(List<thanhvien> danhsach){
        Session session = openNewSession();
        try{
            session.beginTransaction();
            for(thanhvien tv : danhsach){
                tv.setId(generateId(tv));
                session.persist(tv);
                sequenceDAL.updateIndex();
            }
            session.getTransaction().commit();
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return false;
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

    public boolean update(thanhvien tv)
    {
        Session session = openNewSession();
        try{
            session.beginTransaction();
            session.merge(tv);
            session.getTransaction().commit();
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return false;
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

    public List<thanhvien> getAll(){
        Session session = openNewSession();
        try {
            List<thanhvien> thanhviens = session.createQuery("FROM thanhvien", thanhvien.class).list();
            return thanhviens;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

    public boolean deleteById(Long id){
        Session session = openNewSession();
        try{
            session.beginTransaction();
            thanhvien thanhvienTemp = session.get(thanhvien.class, id);
            session.remove(thanhvienTemp);
            session.getTransaction().commit();
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
            return false;
        }
        finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

    public void deleteList(List<thanhvien> danhsach)
    {
        Session session = openNewSession();
        try{
            session.beginTransaction();
            for(thanhvien mem : danhsach){
                session.remove(mem);
            }
            session.getTransaction().commit();
        }
        catch(Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

    private String parseDozen(int num)
    {
        if(num < 10){
            return "0" + num;
        }
        else{
            return String.valueOf(num);
        }
    }

    public Long generateId(thanhvien thanhvienTemp){

        Long index = sequenceDAL.getCurrentIndex();
        String maKhoa = parseDozen(thanhvienTemp.getKhoa().getId());
        String maNganh = parseDozen(thanhvienTemp.getNganh().getId());

        Long id = Long.parseLong("31" + maKhoa + maNganh) * 10000;
        return id + index;
    }
}

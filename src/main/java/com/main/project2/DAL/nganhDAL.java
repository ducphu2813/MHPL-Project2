package com.main.project2.DAL;

import com.main.project2.DAL.model.nganh;
import com.main.project2.DAL.model.thanhvien;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class nganhDAL {
    public Session openNewSession()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session;
    }

    public boolean add(nganh n) {
        Session session = openNewSession();
        try {
            session.beginTransaction();
            session.persist(n);
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

    public List<nganh> getAll(){
        Session session = openNewSession();
        try{
            List<nganh> danhsachNganh = session.createQuery("FROM nganh ", nganh.class).list();
            return danhsachNganh;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

    public nganh findById(Integer id){
        Session session = openNewSession();
        try{
            return session.get(nganh.class, id);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

    public nganh findByName(String name){
        Session session = openNewSession();
        try{
            Query<nganh> query = session.createQuery("FROM nganh WHERE ten = :name", nganh.class);
            query.setParameter("name", name);
            return query.uniqueResult();
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }
}

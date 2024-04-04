package com.main.project2.DAL;

import com.main.project2.DAL.model.xuly;
import org.hibernate.Session;

import java.util.List;

public class xulyDAL {

    public Session openNewSession()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session;
    }

    public xuly findById(Integer id){
        Session session = openNewSession();
        try{
            return session.get(xuly.class, id);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

    public boolean add(xuly xl)
    {
        Session session = openNewSession();
        try{
            session.beginTransaction();
            session.persist(xl);
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

    public boolean updateStatus(xuly xl){
        Session session = openNewSession();
        try{
            session.beginTransaction();
            session.merge(xl);
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

    public List<xuly> getAll(){
        Session session = openNewSession();
        try{
            List<xuly> dsxl = session.createQuery("from xuly ",xuly.class).list();
            return dsxl;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }
}

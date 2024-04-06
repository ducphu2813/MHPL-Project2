package com.main.project2.DAL;

import com.main.project2.DAL.model.loai_thietbi;
import org.hibernate.Session;
import java.util.List;

public class loai_thietbiDAL {

    public Session openNewSession()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session;
    }

    public boolean add(loai_thietbi tb){
        Session session = openNewSession();
        try{
            session.beginTransaction();
            session.persist(tb);
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

    public loai_thietbi findById(Integer id){
        Session session = openNewSession();
        try{
            return session.get(loai_thietbi.class, id);
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

    public List<loai_thietbi> getAll(){
        Session session = openNewSession();
        try{
            List<loai_thietbi> dstb = session.createQuery("FROM loai_thietbi ", loai_thietbi.class).list();
            return dstb;
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

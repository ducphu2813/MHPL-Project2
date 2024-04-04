package com.main.project2.DAL;

import com.main.project2.DAL.model.thietbi;
import org.hibernate.Session;

import java.util.List;

public class thietbiDAL {


    public Session openNewSession()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session;
    }

    public thietbi findById(Integer id){
        Session session = openNewSession();
        try{
            return session.get(thietbi.class, id);
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

    public List<thietbi> getAll(){
        Session session = openNewSession();
        try{
            List<thietbi> dstb = session.createQuery("FROM thietbi ", thietbi.class).list();
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

    public boolean add(thietbi tb){
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

    public boolean addList(List<thietbi> dstb){
        Session session = openNewSession();
        try{
            session.beginTransaction();
            for(thietbi tb : dstb){
                session.persist(tb);
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

    public boolean update(thietbi tb) {
        Session session = openNewSession();
        try{
            session.beginTransaction();
            session.merge(tb);
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

    public boolean deleteById(Integer id){
        Session session = openNewSession();
        try{
            session.beginTransaction();
            thietbi tb = session.get(thietbi.class, id);
            session.remove(tb);
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

    public boolean deleteList(List<thietbi> dstb){
        Session session = openNewSession();
        try{
            session.beginTransaction();
            for(thietbi tb : dstb){
                session.remove(tb);
            }
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
}

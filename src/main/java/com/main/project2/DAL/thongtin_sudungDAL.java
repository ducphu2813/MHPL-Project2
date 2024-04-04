package com.main.project2.DAL;

import com.main.project2.DAL.model.thongtin_sudung;
import org.hibernate.Session;

import java.util.List;

public class thongtin_sudungDAL {

    public Session openNewSession()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session;
    }

    public boolean add(thongtin_sudung tt){
        Session session = openNewSession();
        try{
            session.beginTransaction();
            session.persist(tt);
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

    public boolean updateNgayTra(thongtin_sudung tt){
        Session session = openNewSession();
        try{
            session.beginTransaction();
            session.merge(tt);
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

    public List<thongtin_sudung> getAll(){
        Session session = openNewSession();
        try{
            List<thongtin_sudung> dstt = session.createQuery("from thongtin_sudung ", thongtin_sudung.class).list();
            return dstt;
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

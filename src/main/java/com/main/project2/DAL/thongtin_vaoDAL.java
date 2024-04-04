package com.main.project2.DAL;

import com.main.project2.DAL.model.thongtin_vao;
import org.hibernate.Session;

import java.util.List;

public class thongtin_vaoDAL {

    public Session openNewSession()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session;
    }

    public boolean add(thongtin_vao ttVao){
        Session session = openNewSession();
        try{
            session.beginTransaction();
            session.persist(ttVao);
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

    public List<thongtin_vao> getAll(){
        Session session = openNewSession();
        try{
            List<thongtin_vao> dstt = session.createQuery("from thongtin_vao ", thongtin_vao.class).list();
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

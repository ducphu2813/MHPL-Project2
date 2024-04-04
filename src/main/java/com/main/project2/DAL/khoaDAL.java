package com.main.project2.DAL;

import com.main.project2.DAL.model.khoa;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class khoaDAL {
    public Session openNewSession()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session;
    }

    public List<khoa> getAll(){
        Session session = openNewSession();
        try{
            List<khoa> danhsachKhoa = session.createQuery("FROM khoa", khoa.class).list();
            return danhsachKhoa;
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

    public khoa findById(Integer id){
        Session session = openNewSession();
        try{
            return session.get(khoa.class, id);
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

    public khoa findByName(String name){
        Session session = openNewSession();
        try{
            Query<khoa> query = session.createQuery("FROM khoa WHERE ten = :name", khoa.class);
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

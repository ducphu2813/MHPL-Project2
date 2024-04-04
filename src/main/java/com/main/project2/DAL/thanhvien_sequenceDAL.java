package com.main.project2.DAL;

import com.main.project2.DAL.model.thanhvien_sequence;
import org.hibernate.Session;

public class thanhvien_sequenceDAL {

    public Session openNewSession()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session;
    }

    public Long getCurrentIndex()
    {
        Session session = openNewSession();
        try {
            thanhvien_sequence sequence = session.get(thanhvien_sequence.class, "index");
            return sequence.getNum();
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
        finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

    public void updateIndex(){
        Session session = openNewSession();
        try{
            session.beginTransaction();
            thanhvien_sequence sequence = session.get(thanhvien_sequence.class, "index");
            Long newIndex = sequence.getNum() + 1;
            sequence.setNum(newIndex);
            session.merge(sequence);
            session.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally {
            if (session.isOpen()) {
                session.close();
            }
        }
    }
}




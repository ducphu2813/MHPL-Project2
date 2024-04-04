package com.main.project2.BLL;

import com.main.project2.DAL.khoaDAL;
import com.main.project2.DAL.model.khoa;

import java.util.List;

public class khoaBLL {

    private khoaDAL khoaDAO = new khoaDAL();

    public List<khoa> getAll(){
        return khoaDAO.getAll();
    }

    public khoa findById(Integer id){
        return khoaDAO.findById(id);
    }

    public khoa findByName(String name){
        return khoaDAO.findByName(name);
    }
}

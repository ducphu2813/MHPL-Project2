package com.main.project2.BLL;

import com.main.project2.DAL.model.nganh;
import com.main.project2.DAL.nganhDAL;

import java.util.List;

public class nganhBLL {

    private nganhDAL nganhDAO = new nganhDAL();

    public List<nganh> getAll(){
        return nganhDAO.getAll();
    }

    public nganh findById(Integer id){
        return nganhDAO.findById(id);
    }

    public nganh findByName(String name){
        return nganhDAO.findByName(name);
    }
}

package com.main.project2.BLL;

import com.main.project2.DAL.loai_thietbiDAL;
import com.main.project2.DAL.model.loai_thietbi;

import java.util.List;

public class loai_thietbiBLL {

    loai_thietbiDAL loai_thietbiDAO = new loai_thietbiDAL();

    public boolean add(loai_thietbi tb){
        return loai_thietbiDAO.add(tb);
    }

    public List<loai_thietbi> getAll(){
        return loai_thietbiDAO.getAll();
    }

    public loai_thietbi findById(Integer id){
        return loai_thietbiDAO.findById(id);
    }

    public loai_thietbi findByName(String name){
        List<loai_thietbi> ds = getAll();
        for(loai_thietbi tb : ds){
            if(tb.getTen().equalsIgnoreCase(name)){
                return tb;
            }
        }
        return null;
    }
}

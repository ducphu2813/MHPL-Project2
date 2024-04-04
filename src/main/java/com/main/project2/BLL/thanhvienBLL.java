package com.main.project2.BLL;

import com.main.project2.DAL.model.thanhvien;
import com.main.project2.DAL.thanhvienDAL;

import java.util.ArrayList;
import java.util.List;

public class thanhvienBLL {

    private thanhvienDAL thanhvienDAO = new thanhvienDAL();

    public List<thanhvien> getAll(){
        return thanhvienDAO.getAll();
    }

    public boolean add(thanhvien tv){
        return thanhvienDAO.add(tv);
    }

    public boolean addList(List<thanhvien> danhsach){
        return thanhvienDAO.addList(danhsach);
    }

    public boolean update(thanhvien tv){
        return thanhvienDAO.update(tv);
    }

    public boolean deleteById(Long id){
        return thanhvienDAO.deleteById(id);
    }

    public void deleteList(List<thanhvien> danhsach){
        thanhvienDAO.deleteList(danhsach);
    }

    public thanhvien findById(Long id){
        return thanhvienDAO.findById(id);
    }

    public List<thanhvien> timBangIdKhoa(Integer id){
        List<thanhvien> ds = getAll();
        List<thanhvien> result = new ArrayList<>();
        for(thanhvien tv : ds){
            if(tv.getKhoa().getId().equals(id)){
                result.add(tv);
            }
        }
        return result;
    }

    public List<thanhvien> timBangTenKhoa(String name){
        List<thanhvien> ds = getAll();
        List<thanhvien> result = new ArrayList<>();
        for(thanhvien tv : ds){
            if(tv.getKhoa().getTen().equalsIgnoreCase(name)){
                result.add(tv);
            }
        }
        return result;
    }

    public List<thanhvien> timBangIdNganh(Integer id){
        List<thanhvien> ds = getAll();
        List<thanhvien> result = new ArrayList<>();
        for(thanhvien tv : ds){
            if(tv.getNganh().getId().equals(id)){
                result.add(tv);
            }
        }
        return result;
    }

    public List<thanhvien> timBangTenNganh(String name){
        List<thanhvien> ds = getAll();
        List<thanhvien> result = new ArrayList<>();
        for(thanhvien tv : ds){
            if(tv.getNganh().getTen().equalsIgnoreCase(name)){
                result.add(tv);
            }
        }
        return result;
    }

    public void xoaTheoNganh(String tenNganh){
        List<thanhvien> ds = getAll();
        List<thanhvien> dsXoa = new ArrayList<>();
        for(thanhvien tv : ds){
            if(tv.getNganh().getTen().equalsIgnoreCase(tenNganh)){
                dsXoa.add(tv);
            }
        }
        deleteList(dsXoa);
    }

    public void xoaTheoKhoa(String tenKhoa){
        List<thanhvien> ds = getAll();
        List<thanhvien> dsXoa = new ArrayList<>();
        for(thanhvien tv : ds){
            if(tv.getKhoa().getTen().equalsIgnoreCase(tenKhoa)){
                dsXoa.add(tv);
            }
        }
        deleteList(dsXoa);
    }
}

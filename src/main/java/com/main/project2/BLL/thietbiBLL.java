package com.main.project2.BLL;

import com.main.project2.DAL.model.loai_thietbi;
import com.main.project2.DAL.model.thietbi;
import com.main.project2.DAL.thietbiDAL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class thietbiBLL {

    private thietbiDAL thietbiDAO = new thietbiDAL();

    private thongtin_sudungBLL tt_sdBLL = new thongtin_sudungBLL();

    public List<thietbi> getAll(){
        return thietbiDAO.getAll();
    }

    public boolean add(thietbi tv){
        return thietbiDAO.add(tv);
    }

    public boolean addList(List<thietbi> danhsach){
        return thietbiDAO.addList(danhsach);
    }

    public boolean update(thietbi tv){
        return thietbiDAO.update(tv);
    }

    public boolean deleteById(Integer id){
        return thietbiDAO.deleteById(id);
    }

    public void deleteList(List<thietbi> danhsach){
        thietbiDAO.deleteList(danhsach);
    }

    public thietbi findById(Integer id){
        return thietbiDAO.findById(id);
    }

    //trả về danh sách thiết bị đang được mượn
    public List<thietbi> dsDangMuon(){
        List<thietbi> ds = getAll();
        Set<thietbi> setTb = new HashSet<>();
        for(thietbi tb : ds){
            if(tt_sdBLL.kiemtraThietBi(tb.getId())){
                setTb.add(tb);
            }
        }
        List<thietbi> result = new ArrayList<>(setTb);
        return result;
    }

    //trả về danh sách thiết bị đang rảnh
    public List<thietbi> dsRanh(){
        List<thietbi> ds = getAll();
        Set<thietbi> setTb = new HashSet<>();
        for(thietbi tb : ds){
            if(!tt_sdBLL.kiemtraThietBi(tb.getId())){
                setTb.add(tb);
            }
        }
        List<thietbi> result = new ArrayList<>(setTb);
        return result;
    }

    //trả về thiết bị nếu thiết bị đó đang được mượn
    //trả về null nếu ko tìm thấy id thiết bị được mượn
    public thietbi tbDangDuocMuon(Integer id){
        List<thietbi> ds = getAll();
        for(thietbi tb : ds){
            if(tt_sdBLL.kiemtraThietBi(tb.getId())){
                return tb;
            }
        }
        return null;
    }

    public void xoaTheoLoaiTb(loai_thietbi loai_tb){
        List<thietbi> ds = getAll();
        List<thietbi> dsXoa = new ArrayList<>();
        for(thietbi tb : ds){
            if(tb.getLoai_thietbi().getId().equals(loai_tb.getId())){
                dsXoa.add(tb);
            }
        }
        deleteList(dsXoa);
    }
}

package com.main.project2.BLL;

import com.main.project2.DAL.model.thanhvien;
import com.main.project2.DAL.model.xuly;
import com.main.project2.DAL.xulyDAL;

import java.util.ArrayList;
import java.util.List;

public class xulyBLL {

    private xulyDAL xulyDAO = new xulyDAL();

    public boolean add(xuly xl){
        return xulyDAO.add(xl);
    }

    public xuly findById(Integer id){
        return xulyDAO.findById(id);
    }

    public boolean updateStatus(xuly xl){
        xl.setTrangthai(true);
        return xulyDAO.updateStatus(xl);
    }

    public List<xuly> getAll(){
        return xulyDAO.getAll();
    }

    //kiểm tra xem thành viên có bị ban(có xử lý chưa được xử lý)
    // trả về true nếu tìm thấy xử lý có trạng thái = false
    public boolean kiemtraBan(Long idTv){
        List<xuly> dsxl = getAll();
        for(xuly xl : dsxl){
            if(xl.getThanhvien().getId().equals(idTv) && !xl.getTrangThai()){
                return true;
            }
        }
        return false;
    }

    public List<xuly> danhsachDaXuLy(){
        List<xuly> dsxl = getAll();
        List<xuly> result = getAll();
        for(xuly xl : dsxl){
            if(xl.getTrangThai()){
                result.add(xl);
            }
        }
        return result;
    }

    public List<xuly> danhsachChuaXuLy(){
        List<xuly> dsxl = getAll();
        List<xuly> result = new ArrayList<>();
        for(xuly xl : dsxl){
            if(!xl.getTrangThai()){
                result.add(xl);
            }
        }
        return result;
    }

    //trả về danh sách tất cả vi phạm theo thành viên
    public List<xuly> danhsachTheoIdThanhvien(Long idTv){
        List<xuly> dsxl = getAll();
        List<xuly> result = new ArrayList<>();
        for(xuly xl : dsxl){
            if(xl.getThanhvien().getId() == idTv){
                result.add(xl);
            }
        }
        return result;
    }

    //trả về danh sách vi phạm chưa được xử lý(bị ban) theo thành viên
    public List<xuly> dsXuLyBiBanTheoIdThanhvien(Long idTv){
        List<xuly> dsxl = getAll();
        List<xuly> result = new ArrayList<>();
        for(xuly xl : dsxl){
            if(!xl.getTrangThai() && xl.getThanhvien().getId() == idTv){
                result.add(xl);
            }
        }
        return result;
    }

    //trả về danh sách vi phạm đã được xử lý theo thành viên
    public List<xuly> dsDaDuocXuLyTheoIdThanhvien(Long idTv){
        List<xuly> dsxl = getAll();
        List<xuly> result = new ArrayList<>();
        for(xuly xl : dsxl){
            if(xl.getTrangThai() && xl.getThanhvien().getId() == idTv){
                result.add(xl);
            }
        }
        return result;
    }

}

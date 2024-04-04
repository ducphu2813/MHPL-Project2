package com.main.project2.BLL;

import com.main.project2.DAL.model.thongtin_sudung;
import com.main.project2.DAL.thongtin_sudungDAL;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class thongtin_sudungBLL {

    private thongtin_sudungDAL tt_sdDAO = new thongtin_sudungDAL();

    public boolean add(thongtin_sudung tt){
        return tt_sdDAO.add(tt);
    }

    private List<thongtin_sudung> dsAll = new ArrayList<>();
    private List<thongtin_sudung> dsDaTra = new ArrayList<>();
    private List<thongtin_sudung> dsChuaTra = new ArrayList<>();

    public thongtin_sudungBLL() {
        dsAll = getAll();
        dsDaTra = danhsachDaTra();
        dsChuaTra = danhsachChuaTra();
    }

    private void checkNullList(){
        if(dsAll.isEmpty()){
            dsAll = getAll();
        }
    }

    private void checkNullDsDaTra(){
        if(dsDaTra.isEmpty()){
            dsDaTra = danhsachDaTra();
        }
    }

    private void checkNullDsChuaTra(){
        if(dsChuaTra.isEmpty()){
            dsDaTra = danhsachChuaTra();
        }
    }

    public boolean updateNgayTra(thongtin_sudung tt){
        LocalDateTime newDate = LocalDateTime.now();
        tt.setNgaytra(newDate);

        return tt_sdDAO.updateNgayTra(tt);
    }

    //hàm cập nhật dữ liệu
    public void refreshData(){
        dsAll = getAll();
        dsDaTra = danhsachDaTra();
        dsChuaTra = danhsachChuaTra();
    }

    public List<thongtin_sudung> getAll(){
        return tt_sdDAO.getAll();
    }

    public List<thongtin_sudung> danhsachChuaTra(){
        checkNullList();
        List<thongtin_sudung> result = new ArrayList<>();
        for(thongtin_sudung tt : dsAll){
            if(tt.getNgaytra() == null){
                result.add(tt);
            }
        }
        return result;
    }

    public List<thongtin_sudung> danhsachDaTra(){
        checkNullList();
        List<thongtin_sudung> result = new ArrayList<>();
        for(thongtin_sudung tt : dsAll){
            if(tt.getNgaytra() != null){
                result.add(tt);
            }
        }
        return result;
    }

    //hàm này kiểm tra xem thiết bị có đang được mượn hay không
    //nếu đang được mượn thì trả về true
    public boolean kiemtraThietBi(Integer idTB){
        checkNullDsChuaTra();
        for(thongtin_sudung tt : dsChuaTra){
            if(tt.getThietbi().getId().equals(idTB)){
                return true;
            }
        }
        return false;
    }

    public thongtin_sudung timSuDungChuaTra(Integer idTB){
        checkNullDsChuaTra();
        for(thongtin_sudung tt : dsChuaTra){
            if(tt.getThietbi().getId().equals(idTB)){
                return tt;
            }
        }
        return null;
    }

    public List<thongtin_sudung> danhsachMuonTheoThietBi(Integer idTb){
        checkNullList();
        List<thongtin_sudung> result = new ArrayList<>();
        for(thongtin_sudung tt : dsAll){
            if(tt.getThietbi().getId().equals(idTb)){
                result.add(tt);
            }
        }
        return result;
    }

    public List<thongtin_sudung> danhsachMuonTheoThanhvien(Long idTv){
        checkNullDsDaTra();
        List<thongtin_sudung> result = new ArrayList<>();
        for(thongtin_sudung tt : dsDaTra){
            if(tt.getThanhvien().getId().equals(idTv)){
                result.add(tt);
            }
        }
        return result;
    }

    //hàm sử dụng cho màn hình lịch sử cho mượn,
    // nếu người dùng không nhập id người mượn/thiết bị thì để null
    public <T> List<thongtin_sudung> locTheoDieuKien(LocalDateTime ngayBatdauMuon, LocalDateTime ngayKetthucMuon, LocalDateTime ngayBatdauTra, LocalDateTime ngayKetthucTra, T id){
        checkNullDsDaTra();
        List<thongtin_sudung> ds = new ArrayList<>();
        List<thongtin_sudung> result = new ArrayList<>();
        for(thongtin_sudung tt : dsDaTra){
            if(tt.getNgaymuon().isAfter(ngayBatdauMuon)
                && tt.getNgaymuon().isBefore(ngayKetthucMuon)
                && tt.getNgaytra().isAfter(ngayBatdauTra)
                && tt.getNgaymuon().isBefore(ngayKetthucTra))
            {
                ds.add(tt);
            }
        }

        if(id instanceof Integer newId){
            //của thiết bị
            for(thongtin_sudung tt : ds){
                if(tt.getThietbi().getId().equals(newId)){
                    result.add(tt);
                }
            }
        }
        else if(id instanceof Long newId) {
            //của thành viên
            for(thongtin_sudung tt : ds){
                if(tt.getThanhvien().getId().equals(newId)){
                    result.add(tt);
                }
            }
        }
        else if(id == null){
            //khi người dùng không nhập id
            return ds;
        }
        return result;
    }
}

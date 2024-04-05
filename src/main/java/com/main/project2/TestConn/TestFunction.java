package com.main.project2.TestConn;

import com.main.project2.BLL.*;
import com.main.project2.DAL.model.*;

import java.util.List;

public class TestFunction {
    public static void main(String[] args) {
//        thucHienChoMuon(3123090004L, 20);
//        kiemTraObjectTonTai(1);
//        banThanhVien(3122120002L);
//        kiemTraBan(3122120002L);
//        System.out.println("kiểm tra id 333333333333");
//        kiemTraVao(333333333333L);
//        System.out.println("kiểm tra id "+3122120002L);
//        kiemTraVao(3122120002L);
//        System.out.println("kiểm tra id "+3123090004L);
//        kiemTraVao(3123090004L);
        deleteThanhvien();
    }

    public static void thucHienChoMuon(Long idTv, int idTb){
        thongtin_sudung tt = new thongtin_sudung();
        thongtin_sudungBLL ttsdBUS = new thongtin_sudungBLL();

        thanhvienBLL tvBUS = new thanhvienBLL();
        thanhvien tv = tvBUS.findById(idTv);

        thietbiBLL tbBUS = new thietbiBLL();

        thietbi tb = tbBUS.tbDangDuocMuon(idTb);

        if(tb == null){
            System.out.println("thiết bị rảnh, có thể mượn");
            tb = tbBUS.findById(idTb);
            tt.setThanhvien(tv);
            tt.setThietbi(tb);
            ttsdBUS.add(tt);
        }
        else{
            System.out.println("thiết bị đang được mượn hoặc ko tồn tại");
        }

    }

    public static void kiemTraTbTonTai(int idTb){
        thietbiBLL tbBUS = new thietbiBLL();
        thietbi tb = tbBUS.tbDangDuocMuon(idTb);
        if(tb == null){
            System.out.println("null rồi");
        }
        else{
            System.out.println("tìm thấy rồi");
            System.out.println(tb.getTen());
        }
    }

    public static void thucHienTra(int id){
        thietbiBLL tbBUS = new thietbiBLL();
        thongtin_sudungBLL tt_sdBUS = new thongtin_sudungBLL();
        if(!tt_sdBUS.kiemtraThietBi(id)){
            System.out.println("thiết bị không có được mượn");
        }
        else{
            thietbi tb = tbBUS.findById(id);
            thongtin_sudung tt = tt_sdBUS.timSuDungChuaTra(id);
            tt_sdBUS.updateNgayTra(tt);
            System.out.println("trả thiết bị thành công");
            System.out.println(tb.getTen());
        }
    }

    public static void dsSachTbRanh(){
        thietbiBLL tbBUS = new thietbiBLL();
        List<thietbi> ds = tbBUS.dsRanh();

        for(thietbi tb : ds){
            System.out.println(tb.getTen());
        }
    }

    public static void dsTbDangMuon(){
        thietbiBLL tbBUS = new thietbiBLL();
        List<thietbi> ds = tbBUS.dsDangMuon();

        for(thietbi tb : ds){
            System.out.println(tb.getTen());
        }
    }

    public static void kiemTraBan(Long id){
        xulyBLL xyluBUS = new xulyBLL();

        if(xyluBUS.kiemtraBan(id)){
            System.out.println("mày bị global ban rồi");
        }
        else{
            System.out.println("bạn không bị ban");
        }
    }

    public static void banThanhVien(Long id){
        xulyBLL xyluBUS = new xulyBLL();
        thanhvienBLL tvBUS = new thanhvienBLL();

        thanhvien tv = tvBUS.findById(id);
        xuly xl = new xuly();
        xl.setThanhvien(tv);
        xl.setLydo("Hỗn láo");
        xl.setHinhthuc_xl("Ban 3 tháng, phạt 300k");
        xl.setSongay_ban(90);
        xl.setTienphat(300000.0);

        xyluBUS.add(xl);
    }

    public static void xuLyViPham(Integer id){
        xulyBLL xyluBUS = new xulyBLL();
        xuly xl = xyluBUS.findById(id);
        xyluBUS.updateStatus(xl);
    }

    public static void kiemTraVao(Long id){
        thanhvienBLL tvBUS = new thanhvienBLL();
        xulyBLL xulyBUS = new xulyBLL();
        thongtin_vaoBLL tt_vaoBUS = new thongtin_vaoBLL();

        thanhvien tv = tvBUS.findById(id);
        if(tv == null){
            System.out.println("mã ko tồn tại");
        }
        else if(xulyBUS.kiemtraBan(id)){
            System.out.println("bị ban rồi cút đi");
        }
        else{
            System.out.println("welcome bro");
            System.out.println(tv.getTen());
            thongtin_vao tt_vao = new thongtin_vao();
            tt_vao.setThanhvien(tv);
            tt_vaoBUS.add(tt_vao);
        }
    }

    public static void thongKeVao(){

    }

    public static void deleteThanhvien(){
        thanhvienBLL tvBUS = new thanhvienBLL();
        tvBUS.deleteById(3123090004L);
    }
}

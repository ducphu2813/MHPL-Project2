package com.main.project2.TestConn;

import com.main.project2.BLL.khoaBLL;
import com.main.project2.BLL.nganhBLL;
import com.main.project2.BLL.thanhvienBLL;
import com.main.project2.BLL.thietbiBLL;
import com.main.project2.DAL.khoaDAL;
import com.main.project2.DAL.model.khoa;
import com.main.project2.DAL.model.nganh;
import com.main.project2.DAL.model.thanhvien;
import com.main.project2.DAL.model.thietbi;
import com.main.project2.DAL.nganhDAL;

import java.util.ArrayList;
import java.util.List;

public class LoadData {

    public static void main(String[] args) {

        //load dữ liệu cho khoa và ngành
        khoaDAL khoaDAO = new khoaDAL();
        khoa khoaQTKD = new khoa();
        khoaQTKD.setTen("QTKD");
        khoaQTKD.setId(20);
        khoaDAO.add(khoaQTKD);

        khoa khoaTLH = new khoa();
        khoaTLH.setTen("TLH");
        khoaTLH.setId(22);
        khoaDAO.add(khoaTLH);

        khoa khoaCNTT = new khoa();
        khoaCNTT.setTen("CNTT");
        khoaCNTT.setId(23);
        khoaDAO.add(khoaCNTT);

        khoa khoaGDTH = new khoa();
        khoaGDTH.setTen("GDTH");
        khoaGDTH.setId(41);
        khoaDAO.add(khoaGDTH);


        nganhDAL nganhDAO = new nganhDAL();
        nganh nganhGDTH = new nganh();
        nganhGDTH.setTen("GDTH");
        nganhGDTH.setId(9);
        nganhDAO.add(nganhGDTH);


        nganh nganhQLGD = new nganh();
        nganhQLGD.setTen("QLGD");
        nganhQLGD.setId(12);
        nganhDAO.add(nganhQLGD);

        nganh nganhQTKD = new nganh();
        nganhQTKD.setTen("QTKD");
        nganhQTKD.setId(17);
        nganhDAO.add(nganhQTKD);

        nganh nganhHTTT = new nganh();
        nganhHTTT.setTen("HTTT");
        nganhHTTT.setId(18);
        nganhDAO.add(nganhHTTT);




        //load dữ liệu cho bảng thành viên
//        thanhvien tv = new thanhvien();
//        tv.setTen("Trần Long");
//        tv.setKhoa(khoaTLH);
//        tv.setNganh(nganhHTTT);
//        tv.setSodienthoai("0123456789");
//
//        thanhvien tv2 = new thanhvien();
//        tv2.setTen("Nguyễn Lỏ");
//        tv2.setKhoa(khoaCNTT);
//        tv2.setNganh(nganhHTTT);
//        tv2.setSodienthoai("9988776655");
//
//        thanhvien tv3 = new thanhvien();
//        tv3.setTen("Lê Phương");
//        tv3.setKhoa(khoaQTKD);
//        tv3.setNganh(nganhQTKD);
//        tv3.setSodienthoai("0768468215");
//
//        thanhvien tv4 = new thanhvien();
//        tv4.setTen("Huyền Khách Sạn");
//        tv4.setKhoa(khoaGDTH);
//        tv4.setNganh(nganhGDTH);
//        tv4.setSodienthoai("0362879256");
//
//        thanhvien tv5 = new thanhvien();
//        tv5.setTen("Nguyễn Sang Trần");
//        tv5.setKhoa(khoaCNTT);
//        tv5.setNganh(nganhHTTT);
//        tv5.setSodienthoai("0629988364");
//
//        List<thanhvien> tvList = new ArrayList<>();
//        tvList.add(tv);
//        tvList.add(tv2);
//        tvList.add(tv3);
//        tvList.add(tv4);
//        tvList.add(tv5);
//
//        thanhvienBLL tvDAO = new thanhvienBLL();
//        tvDAO.addList(tvList);

        //load dữ liệu cho thiết bị
//        thietbiBLL tbDAO = new thietbiBLL();
//
//        thietbi tb1 = new thietbi();
//        tb1.setTen("Máy tính Dell");
//        tb1.setMota("Dell 123");
//
//        thietbi tb2 = new thietbi();
//        tb2.setTen("Chuột không dây HumanWare");
//        tb2.setMota("HumanWare 6969");
//
//        thietbi tb3 = new thietbi();
//        tb3.setTen("Bàn là Oxygen");
//        tb3.setMota("Sử dụng khí o3");
//
//        thietbi tb4 = new thietbi();
//        tb4.setTen("Chổi lau nhà Dell");
//        tb4.setMota("Dell đã sản xuất chổi gaming");
//
//        thietbi tb5 = new thietbi();
//        tb5.setTen("Máy hút bụi Samsung");
//        tb5.setMota("Samsung 123");
//
//        List<thietbi> thietbiList = new ArrayList<>();
//        thietbiList.add(tb1);
//        thietbiList.add(tb2);
//        thietbiList.add(tb3);
//        thietbiList.add(tb4);
//        thietbiList.add(tb5);
//
//        tbDAO.addList(thietbiList);


    }
}

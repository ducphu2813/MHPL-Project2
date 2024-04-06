package com.main.project2.TestConn;

import com.main.project2.BLL.*;
import com.main.project2.DAL.khoaDAL;
import com.main.project2.DAL.loai_thietbiDAL;
import com.main.project2.DAL.model.*;
import com.main.project2.DAL.nganhDAL;

import java.util.ArrayList;
import java.util.List;

public class LoadData {

    public static void main(String[] args) {

        //load dữ liệu cho khoa và ngành
//        khoaDAL khoaDAO = new khoaDAL();
//        khoa khoaQTKD = new khoa();
//        khoaQTKD.setTen("QTKD");
//        khoaQTKD.setId(20);
//        khoaDAO.add(khoaQTKD);
//
//        khoa khoaTLH = new khoa();
//        khoaTLH.setTen("TLH");
//        khoaTLH.setId(22);
//        khoaDAO.add(khoaTLH);
//
//        khoa khoaCNTT = new khoa();
//        khoaCNTT.setTen("CNTT");
//        khoaCNTT.setId(23);
//        khoaDAO.add(khoaCNTT);
//
//        khoa khoaGDTH = new khoa();
//        khoaGDTH.setTen("GDTH");
//        khoaGDTH.setId(41);
//        khoaDAO.add(khoaGDTH);
//
//
//        nganhDAL nganhDAO = new nganhDAL();
//        nganh nganhGDTH = new nganh();
//        nganhGDTH.setTen("GDTH");
//        nganhGDTH.setId(9);
//        nganhDAO.add(nganhGDTH);
//
//
//        nganh nganhQLGD = new nganh();
//        nganhQLGD.setTen("QLGD");
//        nganhQLGD.setId(12);
//        nganhDAO.add(nganhQLGD);
//
//        nganh nganhQTKD = new nganh();
//        nganhQTKD.setTen("QTKD");
//        nganhQTKD.setId(17);
//        nganhDAO.add(nganhQTKD);
//
//        nganh nganhHTTT = new nganh();
//        nganhHTTT.setTen("HTTT");
//        nganhHTTT.setId(18);
//        nganhDAO.add(nganhHTTT);




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


        //load dữ liệu cho loại thiết bị
//        loai_thietbiDAL loaiDAO = new loai_thietbiDAL();
//
//        loai_thietbi tb1 = new loai_thietbi();
//        tb1.setId(1);
//        tb1.setTen("Micro");
//        loaiDAO.add(tb1);
//
//        loai_thietbi tb2 = new loai_thietbi();
//        tb2.setId(2);
//        tb2.setTen("Máy chiếu");
//        loaiDAO.add(tb2);
//
//        loai_thietbi tb3 = new loai_thietbi();
//        tb3.setId(3);
//        tb3.setTen("Máy ảnh");
//        loaiDAO.add(tb3);
//
//        loai_thietbi tb4 = new loai_thietbi();
//        tb4.setId(4);
//        tb4.setTen("Cassette");
//        loaiDAO.add(tb4);
//
//        loai_thietbi tb5 = new loai_thietbi();
//        tb5.setId(5);
//        tb5.setTen("Tivi");
//        loaiDAO.add(tb5);
//
//        loai_thietbi tb6 = new loai_thietbi();
//        tb6.setId(6);
//        tb6.setTen("Quạt đứng");
//        loaiDAO.add(tb6);

        //load dữ liệu cho thiết bị
//        thietbiBLL tbDAO = new thietbiBLL();
//        loai_thietbiBLL loaiBUS = new loai_thietbiBLL();
//
//        loai_thietbi micro = loaiBUS.findByName("Micro");
//        loai_thietbi maychieu = loaiBUS.findByName("Máy chiếu");
//        loai_thietbi mayanh = loaiBUS.findByName("Máy ảnh");
//        loai_thietbi cassette = loaiBUS.findByName("Cassette");
//        loai_thietbi tivi = loaiBUS.findByName("Tivi");
//        loai_thietbi quatdung = loaiBUS.findByName("Quạt đứng");
//
//        thietbi tb1 = new thietbi();
//        tb1.setTen("Micro không dây Victus");
//        tb1.setMota("Dùng bluetooth");
//        tb1.setLoai_thietbi(micro);
//
//        thietbi tb2 = new thietbi();
//        tb2.setTen("Máy chiếu HumanWare");
//        tb2.setMota("HumanWare 6969");
//        tb2.setLoai_thietbi(maychieu);
//
//        thietbi tb3 = new thietbi();
//        tb3.setTen("Máy ảnh Toyota");
//        tb3.setMota("Sử dụng khí o3");
//        tb3.setLoai_thietbi(mayanh);
//
//        thietbi tb4 = new thietbi();
//        tb4.setTen("Cassette Dell");
//        tb4.setMota("máy cassette 8 năm tuổi");
//        tb4.setLoai_thietbi(cassette);
//
//        thietbi tb5 = new thietbi();
//        tb5.setTen("Tivi Samsung");
//        tb5.setMota("Samsung 123");
//        tb5.setLoai_thietbi(tivi);
//
//        List<thietbi> thietbiList = new ArrayList<>();
//        thietbiList.add(tb1);
//        thietbiList.add(tb2);
//        thietbiList.add(tb3);
//        thietbiList.add(tb4);
//        thietbiList.add(tb5);
//
//        tbDAO.addList(thietbiList);


        //load dữ liệu cho thông tin sử dụng


        //load dữ liệu cho thông tin vào


        //load dữ liệu cho xử lý

    }
}

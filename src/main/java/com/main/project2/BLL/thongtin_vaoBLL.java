package com.main.project2.BLL;

import com.main.project2.DAL.model.thongtin_vao;
import com.main.project2.DAL.thongtin_vaoDAL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class thongtin_vaoBLL {
    private thongtin_vaoDAL tt_vaoDAO = new thongtin_vaoDAL();

    public List<thongtin_vao> getAll(){
        return tt_vaoDAO.getAll();
    }

    public boolean add(thongtin_vao tt_vao){
        return tt_vaoDAO.add(tt_vao);
    }

    public List<thongtin_vao> dsTheoNam(int nam){
        List<thongtin_vao> ds = getAll();
        List<thongtin_vao> result = new ArrayList<>();
        for(thongtin_vao tt : ds){
            if(tt.getThoigian_vao().getYear() == nam){
                result.add(tt);
            }
        }
        return result;
    }

    public HashMap<Integer, Integer> thongkeTheoNam(int nam){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= 12; i++){
            map.put(i, 0);
        }
        List<thongtin_vao> ds = dsTheoNam(nam);
        for(thongtin_vao tt : ds){
            int month = tt.getThoigian_vao().getMonthValue();
            int currentValue = map.get(month);
            currentValue += 1;
            map.put(month, currentValue);
        }
        return map;
    }

    public HashMap<Integer, Integer> thongkeTheoNamVaKhoa(int nam, String khoa){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= 12; i++){
            map.put(i, 0);
        }
        List<thongtin_vao> ds = dsTheoNam(nam);
        for(thongtin_vao tt : ds){
            if(tt.getThanhvien().getKhoa().getTen().equalsIgnoreCase(khoa)){
                int month = tt.getThoigian_vao().getMonthValue();
                int currentValue = map.get(month);
                currentValue += 1;
                map.put(month, currentValue);
            }
        }
        return map;
    }

    public HashMap<Integer, Integer> thongkeTheoNamVaNganh(int nam, String nganh){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= 12; i++){
            map.put(i, 0);
        }
        List<thongtin_vao> ds = dsTheoNam(nam);
        for(thongtin_vao tt : ds){
            if(tt.getThanhvien().getNganh().getTen().equalsIgnoreCase(nganh)){
                int month = tt.getThoigian_vao().getMonthValue();
                int currentValue = map.get(month);
                currentValue += 1;
                map.put(month, currentValue);
            }
        }
        return map;
    }

}

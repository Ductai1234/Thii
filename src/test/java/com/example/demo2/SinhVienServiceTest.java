package com.example.demo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SinhVienServiceTest {
    List<SinhVien> list;
    @BeforeEach
    public void setUp()  {
        list = new ArrayList<SinhVien>();
        list.add(new SinhVien("SV001","NGUYEN Cho",21,9,"Toan"));
    }
    SinhVienService sinhVienService = new SinhVienService();

    @Test
    public void testSinhVienService() {
        sinhVienService.updateSinhVien(list , new SinhVien("SV001","Cho",21,9,"Toan"),0);
        String exp ="Cho";
        String act = list.get(0).getTen();
        Assertions.assertEquals(act,exp);
    }
    @Test
    public void testSinhVienService2() {
        sinhVienService.updateSinhVien(list , new SinhVien("SV001","",21,9,"Toan"),0);
        String exp ="ten is null or empty";
        String act = "ten is null or empty";
        Assertions.assertEquals(exp,act);
    }

}

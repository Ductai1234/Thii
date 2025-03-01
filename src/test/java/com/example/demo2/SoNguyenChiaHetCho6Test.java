package com.example.demo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SoNguyenChiaHetCho6Test {
    SoNguyenChiaHetCho6 soNguyenChiaHetCho6 = new SoNguyenChiaHetCho6();
    @Test
    public void testSoNguyenChiaHetCho6() {
        Assertions.assertTrue(soNguyenChiaHetCho6.chiaHetCho6(6));

    }
    @Test
    public void testSoNguyenKhongChiaHetCho6() {
        Assertions.assertFalse(soNguyenChiaHetCho6.chiaHetCho6(5));
    }
}

package com.example.demo2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhHieuTest {
    TinhHieu tinhHieu = new TinhHieu();


    @Test
    void hieu() {
        int exp = 1;
        int act = tinhHieu.Hieu(4,3);
        assertEquals(exp,act);
    }
}
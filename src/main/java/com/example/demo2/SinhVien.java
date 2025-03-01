package com.example.demo2;

public class SinhVien {
    private String maNV;
    private  String ten;
    private int tuoi;
    private float diemTrungBinh;
    private String chuyenNganh;

    public SinhVien(String maNV, String ten, int tuoi, float diemTrungBinh, String chuyenNganh) {
        this.maNV = maNV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemTrungBinh = diemTrungBinh;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        if(maNV == null|| maNV.isEmpty()){
            throw  new IllegalArgumentException("maNV is null or empty");
        }
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten == null|| ten.isEmpty()){
            throw  new IllegalArgumentException("ten is null or empty");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (String.valueOf(tuoi) == null ){
            throw  new IllegalArgumentException("tuoi is null or empty");
        }
        this.tuoi = tuoi;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        if (String.valueOf(diemTrungBinh) == null ){
            throw  new IllegalArgumentException("diemTrungBinh is null or empty");
        }
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        if (chuyenNganh == null|| chuyenNganh.isEmpty()){
            throw  new IllegalArgumentException("chuyenNganh is null or empty");
        }
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maNV='" + maNV + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diemTrungBinh=" + diemTrungBinh +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}

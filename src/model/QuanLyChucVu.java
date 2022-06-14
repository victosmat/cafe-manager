package model;

public class QuanLyChucVu {
    private String chucVu;
    private float mucLuong;

    public QuanLyChucVu(String chucVu, float mucLuong) {
        this.chucVu = chucVu;
        this.mucLuong = mucLuong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public float getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(float mucLuong) {
        this.mucLuong = mucLuong;
    }

    @Override
    public String toString() {
        return "QuanLyChucVu [chucVu=" + chucVu + ", mucLuong=" + mucLuong + "]";
    }
}

package model;

import java.util.Date;

public class CungCap {
    private int soLuong;
    private Date ngayCungCap;
    private String nguyenLieuID, nhaCungCapID;

    public CungCap(int soLuong, Date ngayCungCap, String nguyenLieuID, String nhaCungCapID) {
        this.soLuong = soLuong;
        this.ngayCungCap = ngayCungCap;
        this.nguyenLieuID = nguyenLieuID;
        this.nhaCungCapID = nhaCungCapID;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayCungCap() {
        return ngayCungCap;
    }

    public void setNgayCungCap(Date ngayCungCap) {
        this.ngayCungCap = ngayCungCap;
    }

    public String getNguyenLieuID() {
        return nguyenLieuID;
    }

    public void setNguyenLieuID(String nguyenLieuID) {
        this.nguyenLieuID = nguyenLieuID;
    }

    public String getNhaCungCapID() {
        return nhaCungCapID;
    }

    public void setNhaCungCapID(String nhaCungCapID) {
        this.nhaCungCapID = nhaCungCapID;
    }

    @Override
    public String toString() {
        return "CungCap [ngayCungCap=" + ngayCungCap + ", nguyenLieuID=" + nguyenLieuID + ", nhaCungCapID="
                + nhaCungCapID + ", soLuong=" + soLuong + "]";
    }
}

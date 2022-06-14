package model;

import java.util.Date;

public class PhanPhat {
    private String id, nguyenLieuID, quanID;
    private int soLuong;
    private Date ngayCungCap;

    public PhanPhat(String id, String nguyenLieuID, String quanID, int soLuong, Date ngayCungCap) {
        this.id = id;
        this.nguyenLieuID = nguyenLieuID;
        this.quanID = quanID;
        this.soLuong = soLuong;
        this.ngayCungCap = ngayCungCap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNguyenLieuID() {
        return nguyenLieuID;
    }

    public void setNguyenLieuID(String nguyenLieuID) {
        this.nguyenLieuID = nguyenLieuID;
    }

    public String getQuanID() {
        return quanID;
    }

    public void setQuanID(String quanID) {
        this.quanID = quanID;
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

    @Override
    public String toString() {
        return "PhanPhat [id=" + id + ", ngayCungCap=" + ngayCungCap + ", nguyenLieuID=" + nguyenLieuID + ", quanID="
                + quanID + ", soLuong=" + soLuong + "]";
    }
}

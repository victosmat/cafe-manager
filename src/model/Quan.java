package model;

import java.io.Serializable;

public class Quan implements Serializable {
    private String id, ten, diaChi;

    public Quan(String id, String ten, String diaChi) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Quan [diaChi=" + diaChi + ", id=" + id + ", ten=" + ten + "]";
    }

}

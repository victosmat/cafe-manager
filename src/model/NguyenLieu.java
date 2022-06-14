package model;

public class NguyenLieu {
    private String id, ten, giaBan, giaNhap;

    public NguyenLieu(String id, String ten, String giaBan, String giaNhap) {
        this.id = id;
        this.ten = ten;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
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

    public long getGiaBan() {
        return Long.parseLong(giaBan);
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public long getGiaNhap() {
        return Long.parseLong(giaNhap);
    }

    public void setGiaNhap(String giaNhap) {
        this.giaNhap = giaNhap;
    }

    @Override
    public String toString() {
        return "NguyenLieu [giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", id=" + id + ", ten=" + ten + "]";
    }
}

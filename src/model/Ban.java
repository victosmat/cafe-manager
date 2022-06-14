package model;

public class Ban {
    private String id, ten, trangThai, quanID;
    private int soLuongKhachToiDa;

    public Ban(String id, String ten, String trangThai, String quanID, int soLuongKhachToiDa) {
        this.id = id;
        this.ten = ten;
        this.trangThai = trangThai;
        this.quanID = quanID;
        this.soLuongKhachToiDa = soLuongKhachToiDa;
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

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getQuanID() {
        return quanID;
    }

    public void setQuanID(String quanID) {
        this.quanID = quanID;
    }

    public int getSoLuongKhachToiDa() {
        return soLuongKhachToiDa;
    }

    public void setSoLuongKhachToiDa(int soLuongKhachToiDa) {
        this.soLuongKhachToiDa = soLuongKhachToiDa;
    }

    @Override
    public String toString() {
        return "Ban [id=" + id + ", quanID=" + quanID + ", soLuongKhachToiDa=" + soLuongKhachToiDa + ", ten=" + ten
                + ", trangThai=" + trangThai + "]";
    }
}

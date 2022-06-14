package model;

public class HoaDon {
    private String id, nhanVienID, tongTien, banID;

    public HoaDon(String id, String nhanVienID, String tongTien, String banID) {
        this.id = id;
        this.nhanVienID = nhanVienID;
        this.tongTien = tongTien;
        this.banID = banID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNhanVienID() {
        return nhanVienID;
    }

    public void setNhanVienID(String nhanVienID) {
        this.nhanVienID = nhanVienID;
    }

    public long getTongTien() {
        return Long.parseLong(tongTien);
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public String getBanID() {
        return banID;
    }

    public void setBanID(String banID) {
        this.banID = banID;
    }

}

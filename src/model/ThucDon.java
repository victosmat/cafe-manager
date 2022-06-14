package model;

public class ThucDon {
    private String id, ten, loaiThucDon, giaThucDon;

    public ThucDon(String id, String ten, String loaiThucDon, String giaThucDon) {
        this.id = id;
        this.ten = ten;
        this.loaiThucDon = loaiThucDon;
        this.giaThucDon = giaThucDon;
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

    public String getLoaiThucDon() {
        return loaiThucDon;
    }

    public void setLoaiThucDon(String loaiThucDon) {
        this.loaiThucDon = loaiThucDon;
    }

    public long getGiaThucDon() {
        return Long.parseLong(giaThucDon);
    }

    public void setGiaThucDon(String giaThucDon) {
        this.giaThucDon = giaThucDon;
    }

    @Override
    public String toString() {
        return "ThucDon [giaThucDon=" + giaThucDon + ", id=" + id + ", loaiThucDon=" + loaiThucDon + ", ten=" + ten
                + "]";
    }
}

package model;

public class NhanVien {
    private String id, tenDangNhap, matKhau, ten, chucVu, quanID;
    private float mucLuong;

    public NhanVien(String id, String tenDangNhap, String matKhau, String ten, String chucVu, String quanID,
            float mucLuong) {
        this.id = id;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.ten = ten;
        this.chucVu = chucVu;
        this.quanID = quanID;
        this.mucLuong = mucLuong;
    }

    public float getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(float mucLuong) {
        this.mucLuong = mucLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getQuanID() {
        return quanID;
    }

    public void setQuanID(String quanID) {
        this.quanID = quanID;
    }

    @Override
    public String toString() {
        return "NhanVien [chucVu=" + chucVu + ", id=" + id + ", matKhau=" + matKhau + ", quanID=" + quanID + ", ten="
                + ten + ", tenDangNhap=" + tenDangNhap + "]";
    }
}

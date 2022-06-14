package model;

public class NhaCungCap_soDienThoai {
    private String id, soDienThoai;

    public NhaCungCap_soDienThoai(String id, String soDienThoai) {
        this.id = id;
        this.soDienThoai = soDienThoai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "NhaCungCap_soDienThoai [id=" + id + ", soDienThoai=" + soDienThoai + "]";
    }

}

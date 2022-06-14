package model;

public class DatMonAn {
    private String id, thucDonID, comboID, banID;
    private long tongTien;
    private int soLuong;

    public DatMonAn(String id, String thucDonID, String comboID, String banID, long tongTien, int soLuong) {
        this.id = id;
        this.thucDonID = thucDonID;
        this.comboID = comboID;
        this.banID = banID;
        this.tongTien = tongTien;
        this.soLuong = soLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThucDonID() {
        return thucDonID;
    }

    public void setThucDonID(String thucDonID) {
        this.thucDonID = thucDonID;
    }

    public String getComboID() {
        return comboID;
    }

    public void setComboID(String comboID) {
        this.comboID = comboID;
    }

    public String getBanID() {
        return banID;
    }

    public void setBanID(String banID) {
        this.banID = banID;
    }

    public long getTongTien() {
        return tongTien;
    }

    public void setTongTien(long tongTien) {
        this.tongTien = tongTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "MonAnTrongThucDon [banID=" + banID + ", comboID=" + comboID + ", id=" + id + ", soLuong=" + soLuong
                + ", thucDonID=" + thucDonID + ", tongTien=" + tongTien + "]";
    }
}

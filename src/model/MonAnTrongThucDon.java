package model;

public class MonAnTrongThucDon {
    private String thucDonID, phanPhatID, nhanVienID;

    public MonAnTrongThucDon(String thucDonID, String phanPhatID, String nhanVienID) {
        this.thucDonID = thucDonID;
        this.phanPhatID = phanPhatID;
        this.nhanVienID = nhanVienID;
    }

    public String getThucDonID() {
        return thucDonID;
    }

    public void setThucDonID(String thucDonID) {
        this.thucDonID = thucDonID;
    }

    public String getPhanPhatID() {
        return phanPhatID;
    }

    public void setPhanPhatID(String phanPhatID) {
        this.phanPhatID = phanPhatID;
    }

    public String getNhanVienID() {
        return nhanVienID;
    }

    public void setNhanVienID(String nhanVienID) {
        this.nhanVienID = nhanVienID;
    }

    @Override
    public String toString() {
        return "MonAnTrongThucDon [nhanVienID=" + nhanVienID + ", phanPhatID=" + phanPhatID + ", thucDonID=" + thucDonID
                + "]";
    }

}

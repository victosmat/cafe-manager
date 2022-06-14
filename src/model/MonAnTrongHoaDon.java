package model;

public class MonAnTrongHoaDon {
    private String hoaDonID, thucDonID;

    public MonAnTrongHoaDon(String hoaDonID, String thucDonID) {
        this.hoaDonID = hoaDonID;
        this.thucDonID = thucDonID;
    }

    public String getHoaDonID() {
        return hoaDonID;
    }

    public void setHoaDonID(String hoaDonID) {
        this.hoaDonID = hoaDonID;
    }

    public String getThucDonID() {
        return thucDonID;
    }

    public void setThucDonID(String thucDonID) {
        this.thucDonID = thucDonID;
    }
}

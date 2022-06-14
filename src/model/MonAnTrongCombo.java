package model;

public class MonAnTrongCombo {
    private String comboID, thucDonID;

    public MonAnTrongCombo(String comboID, String thucDonID) {
        this.comboID = comboID;
        this.thucDonID = thucDonID;
    }

    public String getComboID() {
        return comboID;
    }

    public void setComboID(String comboID) {
        this.comboID = comboID;
    }

    public String getThucDonID() {
        return thucDonID;
    }

    public void setThucDonID(String thucDonID) {
        this.thucDonID = thucDonID;
    }

    @Override
    public String toString() {
        return "MonAnTrongCombo [comboID=" + comboID + ", thucDonID=" + thucDonID + "]";
    }
}

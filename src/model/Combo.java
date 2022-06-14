package model;

public class Combo {
    private String id, tenCombo, giaCombo;

    public Combo(String id, String tenCombo, String giaCombo) {
        this.id = id;
        this.tenCombo = tenCombo;
        this.giaCombo = giaCombo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenCombo() {
        return tenCombo;
    }

    public void setTenCombo(String tenCombo) {
        this.tenCombo = tenCombo;
    }

    public long getGiaCombo() {
        return Long.parseLong(giaCombo);
    }

    public void setGiaCombo(String giaCombo) {
        this.giaCombo = giaCombo;
    }

    @Override
    public String toString() {
        return "Combo [giaCombo=" + giaCombo + ", id=" + id + ", tenCombo=" + tenCombo + "]";
    }

}
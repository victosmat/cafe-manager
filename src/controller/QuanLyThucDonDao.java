package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import ConnectSqlServer.ConnectSqlServer;
import model.ThucDon;

public class QuanLyThucDonDao {
    public boolean themThucDon(ThucDon t) {
        String sql = "insert into ThucDon (id, ten, loaiThucDon, giaThucDon) values (?,?,?,?)";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getId());
            pst.setString(2, t.getTen());
            pst.setString(3, t.getLoaiThucDon());
            pst.setString(4, String.valueOf(t.getGiaThucDon()));
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<ThucDon> getListThucDon() {
        ArrayList<ThucDon> list = new ArrayList<>();
        String sql = "select * from ThucDon";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ThucDon t = new ThucDon(rs.getString("id"), rs.getString("ten"), rs.getString("loaiThucDon"),
                        rs.getString("giaThucDon"));
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public String getIdThucDon(String ten) {
        String id = "";
        String sql = "select id from ThucDon where ten ='" + ten + "'";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                id = rs.getString("id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public String getTenThucDon(String thucDonID) {
        String ten = "";
        String sql = "select ten from ThucDon where id ='" + thucDonID + "'";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ten = rs.getString("ten");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ten;
    }

    public String getLoaiThucDon(String thucDonID) {
        String loai = "";
        String sql = "select loaiThucDon from ThucDon where id ='" + thucDonID + "'";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                loai = rs.getString("loaiThucDon");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return loai;
    }

    public String getGiaThucDon(String thucDonID) {
        String gia = "";
        String sql = "select giaThucDon from ThucDon where id ='" + thucDonID + "'";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                gia = rs.getString("giaThucDon");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gia;
    }
}

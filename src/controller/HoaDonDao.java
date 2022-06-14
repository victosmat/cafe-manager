/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import ConnectSqlServer.ConnectSqlServer;
import model.HoaDon;

/**
 *
 * @author Le Tuan Minh
 */
public class HoaDonDao {
    public ArrayList<HoaDon> getListHoaDon() {
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                HoaDon t = new HoaDon(rs.getString("id"), rs.getString("nhanVienID"),
                        rs.getString("tongTien"),
                        rs.getString("banID"));
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean themHoaDon(HoaDon n) {
        String sql = "insert into HoaDon (id, nhanVienID, tongTien, banID)" + " values (?,?,?,?)";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, n.getId());
            pst.setString(2, n.getNhanVienID());
            pst.setString(3, String.valueOf(n.getTongTien()));
            pst.setString(4, n.getBanID());
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean capNhatBanID(String ten) {
        String sqlID = "select id from Ban where ten = '" + ten + "'";
        String id = "";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sqlID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                id = rs.getString("id");
            }
        } catch (Exception e) {
            e.printStackTrace();// TODO: handle exception
        }
        String sql = "update Ban set id = 'B01' where ten = '" + id + "'";
        try {
            Connection con1 = ConnectSqlServer.getConnection();
            PreparedStatement pst1 = con1.prepareStatement(sql);
            pst1.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}

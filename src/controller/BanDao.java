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
import model.Ban;

/**
 *
 * @author Le Tuan Minh
 */
public class BanDao {

    public ArrayList<Ban> getListBan() {
        ArrayList<Ban> list = new ArrayList<>();
        String sql = "select * from Ban";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Ban t = new Ban(rs.getString("id"), rs.getString("ten"),
                        rs.getString("trangThai"),
                        rs.getString("quanID"),
                        rs.getInt("soLuongKhachToiDa"));
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public String tenBan(String id) {
        String sql = "select ten from Ban where id = '" + id + "'";
        String tenBan = "";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tenBan = rs.getString("ten");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tenBan;
    }

    public boolean capNhatBanDangSuDung(String id) {
        String sql = "update Ban set trangThai = 'dang su dung' where ten = '" + id + "'";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean capNhatBanChuaSuDung(String id) {
        String sql = "update Ban set trangThai = 'chua su dung' where ten = '" + id + "'";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}

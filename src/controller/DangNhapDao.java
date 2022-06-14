/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import ConnectSqlServer.ConnectSqlServer;
import model.NhanVien;

/**
 *
 * @author Le Tuan Minh
 */
public class DangNhapDao {
    public NhanVien checkLoginNhanVien(String tenDangNhap, String matKhau) throws Exception {
        String sql = "select tenDangNhap, matKhau from NhanVien " + " where tenDangNhap = ? and matKhau = ?";
        try (
                Connection con = ConnectSqlServer.getConnection();
                PreparedStatement pst = con.prepareStatement(sql);) {
            pst.setString(1, tenDangNhap);
            pst.setString(2, matKhau);
            try (ResultSet rs = pst.executeQuery();) {
                if (rs.next()) {
                    return new NhanVien("", tenDangNhap, " ", " ", " ", " ", 0);
                }
            }
        }
        return null;
    }

    public String tenNhanVien(String tenDangNhap, String matKhau) {
        String sql = "select ten from NhanVien where tenDangNhap = '" + tenDangNhap + "' and matKhau = '"
                + matKhau + "'";
        String tenNhanVien = "";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tenNhanVien = rs.getString("ten");
            }
        } catch (Exception e) {
            e.printStackTrace();// TODO: handle exception
        }
        return tenNhanVien;
    }

    public String nhanVienID(String tenDangNhap, String matKhau) {
        String sql = "select id from NhanVien where tenDangNhap = '" + tenDangNhap + "' and matKhau = '"
                + matKhau + "'";
        String nhanVienID = "";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                nhanVienID = rs.getString("id");
            }
        } catch (Exception e) {
            e.printStackTrace();// TODO: handle exception
        }
        return nhanVienID;
    }
}

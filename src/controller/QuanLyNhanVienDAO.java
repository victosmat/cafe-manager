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
import model.NhanVien;

/**
 *
 * @author Le Tuan Minh
 */
public class QuanLyNhanVienDAO {
    public boolean themNhanVien(NhanVien n) {
        String sql = "insert into NhanVien (id, tenDangNhap, matKhau, ten, chucVu, quanID)" + " values (?,?,?,?,?,?)";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, n.getId());
            pst.setString(2, n.getTenDangNhap());
            pst.setString(3, n.getMatKhau());
            pst.setString(4, n.getTen());
            pst.setString(5, n.getChucVu());
            pst.setString(6, n.getQuanID());
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String tenNhanVien(String id) {
        String sql = "select ten from NhanVien where id = '" + id + "'";
        String ten = "";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ten = rs.getString("ten");
            }
        } catch (Exception e) {
            e.printStackTrace();// TODO: handle exception
        }
        return ten;
    }

    public ArrayList<NhanVien> getListNhanVien() {
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "select * from NhanVien";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                NhanVien t = new NhanVien(rs.getString("id"), rs.getString("tenDangNhap"), rs.getString("matKhau"),
                        rs.getString("ten"), rs.getString("chucVu"), rs.getString("quanID"),
                        getMucLuong(rs.getString("chucVu")));
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static float getMucLuong(String n) {
        float val = 5000000;
        String sql = "select mucLuong from QuanLyChucVu where chucVu = '" + n + "'";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            val = rs.getFloat("mucLuong");
        } catch (Exception e) {
            e.printStackTrace();// TODO: handle exception
        }
        return val;
    }
}

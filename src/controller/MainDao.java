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
import model.Combo;
import model.DatMonAn;
import model.ThucDon;

/**
 *
 * @author Le Tuan Minh
 */
public class MainDao {
    public boolean themDatMonAn(DatMonAn n) {
        String sql = "insert into DatMonAn(id,thucDonID,comboID,banID,tongTien,soLuong) values (?,?,?,?,?,?)";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, n.getId());
            pst.setString(2, n.getThucDonID());
            pst.setString(3, n.getComboID());
            pst.setString(4, n.getBanID());
            pst.setLong(5, n.getTongTien());
            pst.setInt(6, n.getSoLuong());
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<ThucDon> getListMonAn() {
        ArrayList<ThucDon> list = new ArrayList<>();
        String sql = "select * from ThucDon where loaiThucDon = 'thuc an'";
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

    public ArrayList<ThucDon> getListDoUong() {
        ArrayList<ThucDon> list = new ArrayList<>();
        String sql = "select * from ThucDon where loaiThucDon = 'do uong'";
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

    public ArrayList<Combo> getListCombo() {
        ArrayList<Combo> listCombo = new ArrayList<>();
        String sql = "select * from Combo";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Combo t = new Combo(rs.getString("id"), rs.getString("tenCombo"), rs.getString("giaCombo"));
                listCombo.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCombo;
    }
}

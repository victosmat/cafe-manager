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
import model.MonAnTrongCombo;

/**
 *
 * @author Le Tuan Minh
 */
public class MonAnTrongComboDao {

    public boolean themMonAnTrongCombo(MonAnTrongCombo n) {
        String sql = "insert into MonAnTrongCombo(comboID, thucDonID) values (?,?)";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, n.getComboID());
            pst.setString(2, n.getThucDonID());
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<MonAnTrongCombo> getListMonAn() {
        ArrayList<MonAnTrongCombo> list = new ArrayList<>();
        String sql = "select * from ThucDon where loaiThucDon = 'thuc an'";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                MonAnTrongCombo t = new MonAnTrongCombo(rs.getString("comboID"), rs.getString("thucDonID"));
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<String> getIdThucDon(String comboID) {
        ArrayList<String> listIdThucDon = new ArrayList<>();
        String sql = "select thucDonID from MonAnTrongCombo where comboID ='" + comboID + "'";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                listIdThucDon.add(rs.getString("thucDonID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listIdThucDon;
    }
}

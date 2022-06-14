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

/**
 *
 * @author Le Tuan Minh
 */
public class ComboDao {
    public boolean themCombo(Combo n) {
        String sql = "insert into Combo(id, tenCombo, giaCombo) values (?,?,?)";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, n.getId());
            pst.setString(2, n.getTenCombo());
            pst.setString(3, String.valueOf(n.getGiaCombo()));
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Combo> getListCombo() {
        ArrayList<Combo> list = new ArrayList<>();
        String sql = "select * from Combo";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Combo t = new Combo(rs.getString("id"), rs.getString("tenCombo"), rs.getString("giaCombo"));
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

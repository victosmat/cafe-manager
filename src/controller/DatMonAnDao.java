/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import ConnectSqlServer.ConnectSqlServer;
import model.DatMonAn;

/**
 *
 * @author Le Tuan Minh
 */
public class DatMonAnDao {
    public boolean themNhanVien(DatMonAn n) {
        String sql = "insert into HoaDon (id, thucDonID, comboID, banID, tongTien, soLuong)" + " values (?,?,?,?,?,?)";
        try {
            Connection con = ConnectSqlServer.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, n.getId());
            pst.setString(2, n.getThucDonID());
            pst.setString(3, n.getComboID());
            pst.setString(4, n.getBanID());
            pst.setLong(3, n.getTongTien());
            pst.setInt(4, n.getSoLuong());
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import controller.ComboDao;
import controller.MainDao;
import controller.MonAnTrongComboDao;
import controller.QuanLyThucDonDao;
import model.Combo;
import model.MonAnTrongCombo;
import model.ThucDon;

/**
 *
 * @author Le Tuan Minh
 */
public class QuanLyLenMenuDangComboFrm extends javax.swing.JFrame {
    DefaultTableModel modelTenGia;
    DefaultTableModel modelMonAnTrongCombo;
    private ArrayList<Combo> listCombo;
    private ArrayList<Combo> listMonAnTrongCombo;
    private ArrayList<ThucDon> listThucDon;
    private int IdCombo = 7;

    /**
     * Creates new form QuanLyLenMenuDangComboFrm
     */
    public QuanLyLenMenuDangComboFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        listThucDon = new MainDao().getListMonAn();
        String[] cols = { "tên", "gía" };
        this.modelTenGia = new DefaultTableModel(cols, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        listThucDon.forEach(t -> modelTenGia.addRow(new Object[] {
                t.getTen(), t.getGiaThucDon()
        }));
        this.tblTenGia.setModel(this.modelTenGia);

        String[] colMonAnTrongCombo = { "Tên", "giá" };
        this.modelMonAnTrongCombo = new DefaultTableModel(colMonAnTrongCombo, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 2;
            }
        };
        this.tblMonAnTrongCombo.setModel(this.modelMonAnTrongCombo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnThoat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTenGia = new javax.swing.JTable();
        btnThucDon = new javax.swing.JButton();
        btnDoUong = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenCombo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMonAnTrongCombo = new javax.swing.JTable();
        btnThemCombo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnThoat.setText("thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThoat)
                                .addGap(0, 0, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnThoat)));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("menu thực đơn"));

        tblTenGia.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null }
                },
                new String[] {
                        "tên", "giá"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblTenGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTenGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTenGia);

        btnThucDon.setText("thực đơn");
        btnThucDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThucDonActionPerformed(evt);
            }
        });

        btnDoUong.setText("đồ uống");
        btnDoUong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoUongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(btnThucDon)
                                .addGap(38, 38, 38)
                                .addComponent(btnDoUong)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThucDon)
                                        .addComponent(btnDoUong))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("tên Combo");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("món ăn trong combo"));

        tblMonAnTrongCombo.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null }
                },
                new String[] {
                        "tên", "loại thực đơn"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMonAnTrongCombo);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        btnThemCombo.setText("thêm Combo");
        btnThemCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemComboActionPerformed(evt);
            }
        });

        jLabel2.setText("giá combo");

        btnXoa.setText("xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtTenCombo,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 145,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnXoa)
                                                .addGap(29, 29, 29)
                                                .addComponent(btnThemCombo)
                                                .addGap(23, 23, 23)))));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtTenCombo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18,
                                        Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThemCombo)
                                        .addComponent(btnXoa))
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaActionPerformed
        int row = this.tblMonAnTrongCombo.getSelectedRow();
        this.tblMonAnTrongCombo.remove(row);// TODO add your handling code here:
    }// GEN-LAST:event_btnXoaActionPerformed

    private void btnThucDonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThucDonActionPerformed
        this.setLocationRelativeTo(null);
        listThucDon = new MainDao().getListMonAn();
        this.modelTenGia.setRowCount(0);
        listThucDon.forEach(t -> modelTenGia.addRow(new Object[] {
                t.getTen(), t.getGiaThucDon()
        }));// TODO add your handling code here:
    }// GEN-LAST:event_btnThucDonActionPerformed

    private void btnDoUongActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDoUongActionPerformed
        this.setLocationRelativeTo(null);
        listThucDon = new MainDao().getListDoUong();
        this.modelTenGia.setRowCount(0);
        listThucDon.forEach(t -> modelTenGia.addRow(new Object[] {
                t.getTen(), t.getGiaThucDon()
        }));// TODO add your handling code here:
    }// GEN-LAST:event_btnDoUongActionPerformed

    private void tblTenGiaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblTenGiaMouseClicked
        int row = this.tblTenGia.getSelectedRow();
        String ten = (String) this.tblTenGia.getValueAt(row, 0);
        Long gia = (Long) this.tblTenGia.getValueAt(row, 1);
        boolean check = true;
        for (int i = 0; i < this.tblMonAnTrongCombo.getRowCount(); i++) {
            if (ten.equals(this.tblMonAnTrongCombo.getValueAt(i, 0))) {
                JOptionPane.showMessageDialog(rootPane, "món ăn đã được sử dụng");
                check = false;
            }
        }
        if (check) {
            this.modelMonAnTrongCombo.addRow(new Object[] {
                    ten, gia
            });
        }
        // TODO add your handling code here:
    }// GEN-LAST:event_tblTenGiaMouseClicked

    private void btnThemComboActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtThemComboActionPerformed
        String id = "CB0" + IdCombo;
        boolean check = false;
        if (new ComboDao().themCombo(new Combo(id, txtTenCombo.getText(),
                txtGia.getText()))) {
            for (int i = 0; i < this.tblMonAnTrongCombo.getRowCount(); i++) {
                String thucDonID = new QuanLyThucDonDao()
                        .getIdThucDon((String) this.tblMonAnTrongCombo.getValueAt(i, 0));
                System.out.println(thucDonID);
                if (new MonAnTrongComboDao().themMonAnTrongCombo(new MonAnTrongCombo(id,
                        thucDonID))) {
                    check = true;
                }
            }
        }
        if (check) {
            JOptionPane.showMessageDialog(rootPane, "thêm combo thành công");
            IdCombo++;
            this.dispose();
            new QuanLyComboFrm().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "thêm combo không thành công");
        } // TODO add your handling code here:
    }// GEN-LAST:event_txtThemComboActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
        new QuanLyComboFrm().setVisible(true);// TODO add your handling code here:
    }// GEN-LAST:event_btnThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyLenMenuDangComboFrm.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyLenMenuDangComboFrm.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyLenMenuDangComboFrm.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyLenMenuDangComboFrm.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyLenMenuDangComboFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoUong;
    private javax.swing.JButton btnThemCombo;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThucDon;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMonAnTrongCombo;
    private javax.swing.JTable tblTenGia;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtTenCombo;
    // End of variables declaration//GEN-END:variables
}

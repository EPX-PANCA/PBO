package PengisianPulsa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leo
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Transaksi extends javax.swing.JFrame {
    Connection Con;
    ResultSet RsTabel;
    Statement stm;
    private Object[][] dataTabel = null;
    private String[] headerTran = {"ID","TANGGAL TRANSAKSI","KODE","KETERANGAN", "NO HANDPHONE", "HARGA"};

    /**
     * Creates new form Transaksi
     */
    public Transaksi() {
        initComponents();
        openDb();
        dataTransaksi();
        bacaKode();
        tgl();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTrx = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNoHp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxKode = new javax.swing.JComboBox();
        jButtonProses = new javax.swing.JButton();
        judul = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel1 = new java.awt.Panel();
        jTanggal = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableTrx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableTrx.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tanggal", "KODE", "KETERANGAN", "NO HANDPHONE", "HARGA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTrx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTrxMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableTrx);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("NO HANDPHONE");

        jTextFieldNoHp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("KODE ");

        jButtonProses.setText("Proses");
        jButtonProses.setEnabled(false);
        jButtonProses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonProsesMouseClicked(evt);
            }
        });
        jButtonProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProsesActionPerformed(evt);
            }
        });

        judul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        judul.setText("DAFTAR TRANSAKSI");

        jTanggal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tanggal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tanggal.setText("TANGGAL :");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(tanggal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tanggal)
                    .addComponent(jTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hapus Semua Transaksi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Tambah");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldNoHp))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxKode, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonProses, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(173, 173, 173)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(judul)
                        .addGap(301, 301, 301))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jButtonProses)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openDb() {
        try {
            Koneksi konek = new Koneksi("localhost", "root", "", "pulsa");
            Con = konek.getConnection();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
    
    private void bacaKode() {
        try {
            stm = (Statement) Con.createStatement();
            RsTabel = stm.executeQuery("select kode from daftar_harga");
            ResultSetMetaData meta = (ResultSetMetaData) RsTabel.getMetaData();
            int count = 0;
            while (RsTabel.next()) {
                jComboBoxKode.insertItemAt(RsTabel.getString("kode"), count);
                count++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    private void tgl() {
        Date now = new Date();
        SimpleDateFormat frm = new SimpleDateFormat("d-M-Y");
        String tgl = frm.format(now);
        jTanggal.setText(tgl);
    }
    
    private void jButtonProsesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProsesMouseClicked
       
    }//GEN-LAST:event_jButtonProsesMouseClicked

    public void dataTransaksi() {
        try {
            stm = (Statement) Con.createStatement();
            RsTabel = stm.executeQuery("select t.id_trx, t.tgl_trx, t.kode, t.no_hp,d.ket, d.harga from transaksi t, daftar_harga d where t.kode=d.kode");
            ResultSetMetaData meta = (ResultSetMetaData) RsTabel.getMetaData();
            int col = meta.getColumnCount();
            int baris = 0;
            while (RsTabel.next()) {
                baris = RsTabel.getRow();
            }

            dataTabel = new Object[baris][col];
            int x = 0;
            RsTabel.beforeFirst();
            while (RsTabel.next()) {
                dataTabel[x][0] = RsTabel.getString("t.id_trx");
                dataTabel[x][1] = RsTabel.getString("t.tgl_trx");
                dataTabel[x][2] = RsTabel.getString("t.kode");
                dataTabel[x][3] = RsTabel.getString("d.ket");
                dataTabel[x][4] = RsTabel.getString("t.no_hp");
                dataTabel[x][5] = RsTabel.getString("d.harga");
                x++;
            }
            jTableTrx.setModel(new DefaultTableModel(dataTabel, headerTran));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void hapus(){
    jTextFieldNoHp.setText(null);
    }
    
    private void jButtonProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProsesActionPerformed
        String NoHp = jTextFieldNoHp.getText();
        String Kd = (String) jComboBoxKode.getSelectedItem();
        String tanggalan = jTanggal.getText();
        String id = "0";
        if ("".equals(NoHp) || Kd==null) {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                stm.executeUpdate("INSERT INTO transaksi VALUES('" + id + "','" + NoHp + "','" + Kd + "','" + tanggalan + "')");
                stm.executeUpdate("update deposit set nominal=nominal-(select harga from daftar_harga where kode='" + Kd + "')");
                dataTransaksi();
                hapus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            jButtonProses.setEnabled(false);
            dataTransaksi();
        }
        
    }//GEN-LAST:event_jButtonProsesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String NoHp = jTextFieldNoHp.getText().trim();
        String Kd = (String) jComboBoxKode.getSelectedItem();
        String tanggalan = jTanggal.getText();
        String id ="0";
        if ("".equals(NoHp) || Kd==null) {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                stm.executeUpdate("update transaksi set kode='" + Kd + "',tgl_trx='" + tanggalan + "', no_hp='" +NoHp+"' where id_trx " );
                dataTransaksi();
                hapus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableTrxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTrxMouseClicked
        int b = jTableTrx.getSelectedRow() ;
        jTextFieldNoHp.setText(jTableTrx.getValueAt(b,4).toString())   ;
        jComboBoxKode.setSelectedItem(jTableTrx.getValueAt(b, 2));
    }//GEN-LAST:event_jTableTrxMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    jButtonProses.setEnabled(true);
    jTextFieldNoHp.setText("");
    jTextFieldNoHp.requestFocus();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String id =null;
            try {
                stm.executeUpdate("delete from transaksi where id_trx");
                dataTransaksi();
                hapus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     try {jTableTrx.print(JTable.PrintMode.FIT_WIDTH, new MessageFormat("Tabel Daftar Transaksi"),null);
} catch (PrinterException ex) {
Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE,null, ex);
}
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonProses;
    private javax.swing.JComboBox jComboBoxKode;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTrx;
    private javax.swing.JLabel jTanggal;
    private javax.swing.JTextField jTextFieldNoHp;
    private javax.swing.JLabel judul;
    private java.awt.Panel panel1;
    private javax.swing.JLabel tanggal;
    // End of variables declaration//GEN-END:variables
}

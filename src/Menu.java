/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Menu extends javax.swing.JFrame {

    main_sc sc = new main_sc();
    private String pesan;
    NumberFormat formatRp = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
    DefaultTableModel tabmode;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        aturTanggal();
    }

    public void aturTanggal() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
        lab_hariIni.setText(formattedDate);
        String hariIni = formattedDate.replace("-", "");
        try {
            sc.aktifitasTransaksiHariIni(hariIni);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void reset() {
        tf_kodeBarang.setText("");
        tf_namaBarang.setText("");
        tf_stok.setText("");
        tf_hargaSatuan.setText("");
        tf_jumBar.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lab_hargaTotal = new javax.swing.JLabel();
        tf_kodeBarang = new javax.swing.JTextField();
        tf_namaBarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_stok = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_hargaSatuan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_jumBar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabBarang = new javax.swing.JTable();
        lab_jumlahItem = new javax.swing.JLabel();
        btn_dataBarang = new javax.swing.JButton();
        btn_cetakStruk = new javax.swing.JButton();
        btn_aktifitasTransaksi = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        lab_hariIni = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();
        lab_kembalian = new javax.swing.JLabel();
        lab_diskon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_diskon = new javax.swing.JTextField();
        lab_total = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_nom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 260, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Kode Barang");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Nama Barang");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        lab_hargaTotal.setFont(new java.awt.Font("Segoe UI", 1, 70)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 212, Short.MAX_VALUE)
                .addComponent(lab_hargaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lab_hargaTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 840, -1));

        tf_kodeBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_kodeBarangKeyPressed(evt);
            }
        });
        getContentPane().add(tf_kodeBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, -1));
        getContentPane().add(tf_namaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 220, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Stok");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));
        getContentPane().add(tf_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 50, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Harga Satuan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));
        getContentPane().add(tf_hargaSatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 160, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Jumlah yang Dibeli");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, 20));

        tf_jumBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_jumBarKeyPressed(evt);
            }
        });
        getContentPane().add(tf_jumBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 70, -1));

        tabBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Kode Barang", "Nama Barang", "Harga Satuan", "Jumlah Barang", "Total Harga"
            }
        ));
        jScrollPane1.setViewportView(tabBarang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 780, 230));

        lab_jumlahItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lab_jumlahItem.setText("Barang yang Dibeli: 0");
        getContentPane().add(lab_jumlahItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 140, 30));

        btn_dataBarang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_dataBarang.setText("Data Barang");
        btn_dataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dataBarangActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dataBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        btn_cetakStruk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_cetakStruk.setText("Cetak Struk");
        btn_cetakStruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakStrukActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cetakStruk, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 660, -1, -1));

        btn_aktifitasTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_aktifitasTransaksi.setText("Aktifitas Transaksi");
        btn_aktifitasTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aktifitasTransaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_aktifitasTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, -1, -1));

        btn_cancel.setBackground(new java.awt.Color(204, 0, 0));
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_cancel.setText("Cancel Transaksi");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 130, -1));

        lab_hariIni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lab_hariIni.setText("##-##-####");
        getContentPane().add(lab_hariIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        btn_reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, -1));

        lab_kembalian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(lab_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 170, 25));

        lab_diskon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(lab_diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 170, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Diskon");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, -1, 25));

        tf_diskon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_diskonKeyPressed(evt);
            }
        });
        getContentPane().add(tf_diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 25, 25));

        lab_total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(lab_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 170, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Total                     :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 140, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Pembayaran            :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, -1, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Kembalian              :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, 140, 25));

        tf_nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_nomKeyPressed(evt);
            }
        });
        getContentPane().add(tf_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 170, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("%        :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, -1, 25));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_kodeBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_kodeBarangKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tf_kodeBarang.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Maaf, Kode Barang Belum Diinput!");
                tf_kodeBarang.requestFocus();
            } else {
                pesan = sc.cekKodeBarang(tf_kodeBarang.getText());
                tf_namaBarang.setText(sc.getNamaBarang());
                tf_stok.setText(sc.getStokBarang());
                double hargaSatuan = Double.parseDouble(sc.getHargaSatuan());
                tf_hargaSatuan.setText(formatRp.format(hargaSatuan));
                tf_jumBar.requestFocus();
            }
        }
    }//GEN-LAST:event_tf_kodeBarangKeyPressed

    private void tf_jumBarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_jumBarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (tf_jumBar.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Maaf, Jumlah Barang yang Dibeli Belum Diinput!");
                tf_jumBar.requestFocus();
            } else {
                double stok = Double.parseDouble(tf_stok.getText());
                double jumBar = Double.parseDouble(tf_jumBar.getText());
                if (stok < jumBar) {
                    JOptionPane.showMessageDialog(null, "Maaf, Stoknya tinggal " + sc.getStokBarang()
                            + "\nAnda Bisa Membeli " + sc.getStokBarang());
                } else {
                    double hargaSatuan = Double.parseDouble(tf_hargaSatuan.getText()
                            .replace("Rp", "").replace(".", "").replace(",00", ""));
                    sc.settingStok(tf_kodeBarang.getText(), tf_jumBar.getText());

                    tabmode = (DefaultTableModel) tabBarang.getModel();

                    Object obj[] = new Object[6];
                    obj[1] = tf_kodeBarang.getText();
                    obj[2] = tf_namaBarang.getText();
                    obj[3] = tf_hargaSatuan.getText();
                    obj[4] = tf_jumBar.getText();
                    obj[5] = formatRp.format(jumBar * hargaSatuan);

                    tabmode.addRow(obj);

                    int jumItem = tabmode.getRowCount();
                    for (int i = 0; i < jumItem; i++) {
                        String no = String.valueOf(i + 1);
                        tabmode.setValueAt(no + ".", i, 0);
                    }
                    lab_jumlahItem.setText(String.valueOf("Barang yang Dibeli: " + jumItem));

                    tabBarang.setModel(tabmode);
                    tabBarang.setRowHeight(30);

                    tf_kodeBarang.requestFocus();

                    double hargaAll = 0;
                    for (int i = 0; i < tabBarang.getRowCount(); i++) {
                        hargaAll += Double.parseDouble((String) tabBarang.getValueAt(i, 5).toString()
                                .replace("Rp", "").replace(".", "").replace(",00", ""));
                    }
                    lab_hargaTotal.setText(formatRp.format(hargaAll));
                    setterGetter.setHargaTotal(formatRp.format(hargaAll));
                    lab_total.setText(formatRp.format(hargaAll));
                    reset();
                }
            }
        }
    }//GEN-LAST:event_tf_jumBarKeyPressed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        String kodeBarang = "";
        String jumlahRetur = "";
        for (int i = 0; i < tabmode.getRowCount(); i++) {
            kodeBarang += tabmode.getValueAt(i, 1).toString();
            jumlahRetur += tabmode.getValueAt(i, 4).toString();
            sc.returBarang(kodeBarang, jumlahRetur);
            kodeBarang = "";
            jumlahRetur = "";
        }

        int rowCount = tabmode.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            tabmode.removeRow(i);
        }

        int jumItem = tabmode.getRowCount();
        for (int i = 0; i < jumItem; i++) {
            String no = String.valueOf(i + 1);
            tabmode.setValueAt(no + ".", i, 0);
        }
        lab_jumlahItem.setText(String.valueOf("Barang yang Dibeli: " + jumItem));
        lab_hargaTotal.setText("");
        tf_diskon.setText("");
        lab_diskon.setText("");
        lab_total.setText("");
        tf_nom.setText("");
        lab_kembalian.setText("");
        reset();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_dataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dataBarangActionPerformed
        DataBarang db = new DataBarang();
        db.setVisible(true);
    }//GEN-LAST:event_btn_dataBarangActionPerformed

    private void btn_aktifitasTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aktifitasTransaksiActionPerformed
        AktifitasTransaksi at = new AktifitasTransaksi();
        at.setVisible(true);
    }//GEN-LAST:event_btn_aktifitasTransaksiActionPerformed

    private void btn_cetakStrukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakStrukActionPerformed
        try {
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter formatJamMenitDetik = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formatJam = currentTime.format(formatJamMenitDetik);
            setterGetter.setWaktuPembelian(formatJam);

            for (int i = 0; i < tabmode.getRowCount(); i++) {
                String kodeBarang = tabmode.getValueAt(i, 1).toString();
                String namaBarang = tabmode.getValueAt(i, 2).toString();
                String hargaSatuan = tabmode.getValueAt(i, 3).toString().replace("Rp", "").replace(".", "").replace(",00", "");
                String jumlahBarang = tabmode.getValueAt(i, 4).toString();
                int hargaTotal = Integer.parseInt(tabmode.getValueAt(i, 5).toString().replace("Rp", "").replace(".", "").replace(",00", ""));
                if (tf_diskon.getText().trim().equals("")) {
                    setterGetter.setDiskon("0");
                    setterGetter.setHasilKurangDiskon("0");
                    sc.catatAktifitas(kodeBarang, namaBarang, jumlahBarang, hargaSatuan, hargaTotal, "0", hargaTotal, "Barang Dibeli");
                    setterGetter.setTotalKeseluruhan(lab_total.getText().replace("Rp", "").replace(",00", ""));
                } else {
                    double diskon = (Double.parseDouble(tf_diskon.getText()) / 100) * hargaTotal;
                    double dk = hargaTotal - diskon;
                    int dis = (int) dk;
                    sc.catatAktifitas(kodeBarang, namaBarang, jumlahBarang, hargaSatuan, hargaTotal, tf_diskon.getText(), dis, "Barang Dibeli dan Mendapatkan Diskon Sebesar "
                            + tf_diskon.getText() + "%");
                    setterGetter.setDiskon(tf_diskon.getText());
                    setterGetter.setHasilKurangDiskon(lab_diskon.getText().replace("Rp", "").replace(",00", ""));
                }
            }
            
            JButton btnReset = btn_reset;
            btnReset.doClick();
            CetakStruk cs = new CetakStruk();
            cs.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_cetakStrukActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        int rowCount = tabmode.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            tabmode.removeRow(i);
        }

        int jumItem = tabmode.getRowCount();
        for (int i = 0; i < jumItem; i++) {
            String no = String.valueOf(i + 1);
            tabmode.setValueAt(no + ".", i, 0);
        }
        lab_jumlahItem.setText(String.valueOf("Barang yang Dibeli: " + jumItem));
        lab_hargaTotal.setText("");
        tf_diskon.setText("");
        lab_diskon.setText("");
        lab_total.setText("");
        tf_nom.setText("");
        lab_kembalian.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void tf_diskonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_diskonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            double diskon = Double.parseDouble(tf_diskon.getText()) / 100
                    * Double.parseDouble(lab_hargaTotal.getText().replace("Rp", "").replace(".", "").replace(",00", ""));
            lab_diskon.setText(formatRp.format(diskon));

            double total = Double.parseDouble(lab_hargaTotal.getText().replace("Rp", "").replace(".", "").replace(",00", ""))
                    - diskon;
            lab_total.setText(formatRp.format(total));
            lab_hargaTotal.setText(formatRp.format(total));
            setterGetter.setTotalKeseluruhan(formatRp.format(total).replace("Rp", "").replace(",00", ""));
        }
    }//GEN-LAST:event_tf_diskonKeyPressed

    private void tf_nomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nomKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            double nom = Double.parseDouble(tf_nom.getText().replace("Rp", "").replace(".", "").replace(",00", ""));
            setterGetter.setNominal(tf_nom.getText());
            double tot = Double.parseDouble(lab_total.getText().replace("Rp", "").replace(".", "").replace(",00", ""));
            if (nom < tot) {
                JOptionPane.showMessageDialog(null, "Maaf, Nominal Uang yang Diinput kurang");
            } else {
                double kembali = nom - tot;
                lab_kembalian.setText(formatRp.format(kembali));
                setterGetter.setKembalian(lab_kembalian.getText().replace("Rp", "").replace(",00", ""));
            }
        }
    }//GEN-LAST:event_tf_nomKeyPressed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aktifitasTransaksi;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_cetakStruk;
    private javax.swing.JButton btn_dataBarang;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab_diskon;
    private javax.swing.JLabel lab_hargaTotal;
    private javax.swing.JLabel lab_hariIni;
    private javax.swing.JLabel lab_jumlahItem;
    private javax.swing.JLabel lab_kembalian;
    private javax.swing.JLabel lab_total;
    private javax.swing.JTable tabBarang;
    private javax.swing.JTextField tf_diskon;
    private javax.swing.JTextField tf_hargaSatuan;
    private javax.swing.JTextField tf_jumBar;
    private javax.swing.JTextField tf_kodeBarang;
    private javax.swing.JTextField tf_namaBarang;
    private javax.swing.JTextField tf_nom;
    private javax.swing.JTextField tf_stok;
    // End of variables declaration//GEN-END:variables
}
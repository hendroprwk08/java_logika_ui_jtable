
package uilatbatik;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BatikForm extends javax.swing.JFrame {

    //model untuk table
    DefaultTableModel model = new DefaultTableModel();
    
    public BatikForm() {
        initComponents();
        
        //set kolom
        Object[] columns = {
            "#Kirim",
            "Nama Pembeli",
            "Tgl",
            "#Batik",
            "Motif",
            "Jml Kodi",
            "Persen",
            "Total",
            "By Kirim",
            "By Adm",
            "Total By"
        };
        
        model.setColumnIdentifiers(columns);
        jt.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        no_kirim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nm_pembeli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        motif_btk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        harga_perkode = new javax.swing.JTextField();
        satu_lima = new javax.swing.JTextField();
        enam_mabelas = new javax.swing.JTextField();
        mabelas_up = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jml_kodi = new javax.swing.JTextField();
        total_hrg = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        biaya_kirim = new javax.swing.JTextField();
        adm_ya = new javax.swing.JRadioButton();
        adm_tidak = new javax.swing.JRadioButton();
        persentase = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        biaya_adm = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        total_biaya = new javax.swing.JTextField();
        Hitung = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        kode_btk = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No. Kirim");

        jLabel2.setText("Nama Pembeli");

        jLabel3.setText("Tanggal Kirim");

        jLabel4.setText("Kode Batik");

        jLabel5.setText("Motif Batik");

        jLabel6.setText("Harga Per-Kode");

        jLabel7.setText("Tarif 1 (1-5 Kodi)");

        jLabel8.setText("Tarif 2 (6-15 Kodi)");

        jLabel9.setText("Tarif 3 (>15 Kodi)");

        jLabel10.setText("Jumlah Kodi");

        jLabel11.setText("Total Harga");

        jml_kodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jml_kodiActionPerformed(evt);
            }
        });
        jml_kodi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jml_kodiKeyReleased(evt);
            }
        });

        jLabel12.setText("Biaya Kirim");

        jLabel13.setText("Prosentase Adm");

        buttonGroup1.add(adm_ya);
        adm_ya.setSelected(true);
        adm_ya.setText("Ya");
        adm_ya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_yaActionPerformed(evt);
            }
        });

        buttonGroup1.add(adm_tidak);
        adm_tidak.setText("Tidak");
        adm_tidak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_tidakActionPerformed(evt);
            }
        });

        persentase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "5", "10", "15" }));
        persentase.setSelectedIndex(1);
        persentase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persentaseActionPerformed(evt);
            }
        });

        jLabel14.setText("Biaya Administrasi");

        jLabel15.setText("Total Biaya");

        Hitung.setText("Hitung");
        Hitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HitungMouseClicked(evt);
            }
        });
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });

        jButton2.setText("Tambah Dan Isi Lagi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        kode_btk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "BTK-01", "BTK-02", "BTK-03", "BTK-04" }));
        kode_btk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_btkActionPerformed(evt);
            }
        });

        jLabel16.setText("%");

        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(motif_btk)
                                    .addComponent(harga_perkode)
                                    .addComponent(satu_lima)
                                    .addComponent(enam_mabelas)
                                    .addComponent(mabelas_up)
                                    .addComponent(kode_btk, 0, 173, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nm_pembeli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(no_kirim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Hitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(adm_ya)
                                        .addGap(18, 18, 18)
                                        .addComponent(persentase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16))
                                    .addComponent(total_hrg)
                                    .addComponent(biaya_kirim)
                                    .addComponent(adm_tidak)
                                    .addComponent(biaya_adm)
                                    .addComponent(total_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jml_kodi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(no_kirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nm_pembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(kode_btk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(motif_btk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(harga_perkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(satu_lima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jml_kodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(total_hrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(biaya_kirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(adm_ya)
                            .addComponent(persentase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adm_tidak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(biaya_adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(total_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(enam_mabelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(mabelas_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HitungMouseClicked
        
    }//GEN-LAST:event_HitungMouseClicked

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        if(kode_btk.getSelectedItem().equals(" ")){
            JOptionPane.showMessageDialog(null, "Anda Belum Memilih Kode Batik");
            return;
        }
        
        if(jml_kodi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Anda Belum Memasukkah Jumlah Kodi");
            return;
        }
        
        int pesen = Integer.parseInt(persentase.getSelectedItem().toString());
        int t_harga = Integer.parseInt(total_hrg.getText().toString());
        int admin = pesen * t_harga / 100;
        int totals = t_harga + admin + Integer.parseInt(biaya_kirim.getText().toString());
        
        biaya_adm.setText(Integer.toString(admin));
        total_biaya.setText(Integer.toString(totals));
    }//GEN-LAST:event_HitungActionPerformed

    private void kode_btkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_btkActionPerformed
        // TODO add your handling code here:
        String motif = null;
        String harga = null;
        String t1 = null;
        String t2 = null;
        String t3 = null;
        String v = kode_btk.getSelectedItem().toString();
        
        if(v.equals("BTK-01")){
            motif = "Kawung";
            harga = "400000";
            t1 = "15000";
            t2 = "7500";
            t3 = "5000";
        }else if(v.equals("BTK-02")){
            motif = "Parang";
            harga = "450000";
            t1 = "20000";
            t2 = "10000";
            t3 = "7500";
        }else if(v.equals("BTK-03")){
            motif = "Truntum";
            harga = "500000";
            t1 = "23000";
            t2 = "12000";
            t3 = "8000";
        }else if(v.equals("BTK-04")){
            motif = "Sido Mukti";
            harga = "550000";
            t1 = "17500";
            t2 = "8000";
            t3 = "6000";
        }
        motif_btk.setText(motif);
        harga_perkode.setText(harga);
        satu_lima.setText(t1);
        enam_mabelas.setText(t2);
        mabelas_up.setText(t3);
        
        String jumlahkodi = jml_kodi.getText().toString();
        int totals;
        int jmlkode = 0;
        if(jumlahkodi.equals(""))jmlkode = 0;else jmlkode = Integer.parseInt(jumlahkodi);
        totals = Integer.parseInt(harga_perkode.getText().toString()) * jmlkode;
        String hgt = Integer.toString(totals);
        
        total_hrg.setText(hgt);
        
        int trf01 = Integer.parseInt(satu_lima.getText().toString());
        int trf02 = Integer.parseInt(enam_mabelas.getText().toString());
        int trf03 = Integer.parseInt(mabelas_up.getText().toString());
        
        int bykirim = 0;
        if(jmlkode>=1&&jmlkode<=5)bykirim = jmlkode * trf01;
        if(jmlkode>=6&&jmlkode<=15)bykirim = jmlkode * trf02;
        if(jmlkode>15)bykirim = jmlkode * trf03;
        
        biaya_kirim.setText(Integer.toString(bykirim));
    }//GEN-LAST:event_kode_btkActionPerformed

    private void adm_tidakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_tidakActionPerformed
        persentase.setSelectedIndex(0);
    }//GEN-LAST:event_adm_tidakActionPerformed

    private void jml_kodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jml_kodiActionPerformed
        
    }//GEN-LAST:event_jml_kodiActionPerformed

    private void jml_kodiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jml_kodiKeyReleased
        String jumlahkodi = jml_kodi.getText().toString();
        int totals;
        int jmlkode = 0;
        if(jumlahkodi.equals("")){jmlkode = 0;
        biaya_adm.setText("");
        total_biaya.setText("");
        }else jmlkode = Integer.parseInt(jumlahkodi);
        totals = Integer.parseInt(harga_perkode.getText().toString()) * jmlkode;
        String hgt = Integer.toString(totals);
        
        total_hrg.setText(hgt);
        
        int trf01 = Integer.parseInt(satu_lima.getText().toString());
        int trf02 = Integer.parseInt(enam_mabelas.getText().toString());
        int trf03 = Integer.parseInt(mabelas_up.getText().toString());
        
        int bykirim = 0;
        if(jmlkode>=1&&jmlkode<=5)bykirim = jmlkode * trf01;
        if(jmlkode>=6&&jmlkode<=15)bykirim = jmlkode * trf02;
        if(jmlkode>15)bykirim = jmlkode * trf03;
        
        biaya_kirim.setText(Integer.toString(bykirim));
    }//GEN-LAST:event_jml_kodiKeyReleased

    private void persentaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persentaseActionPerformed
        if(persentase.getSelectedIndex()==0)adm_tidak.setSelected(true);
        else adm_ya.setSelected(true);
    }//GEN-LAST:event_persentaseActionPerformed

    private void adm_yaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_yaActionPerformed
        persentase.setSelectedIndex(1);
    }//GEN-LAST:event_adm_yaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //masukkan kedalam tabel
        Object[] row = new Object[11];
        
        //definisi
        row[0] = no_kirim.getText().toString();
        row[1] = nm_pembeli.getText().toString();
        row[2] = jFormattedTextField1.getText().toString();
        row[3] = kode_btk.getSelectedItem().toString();
        row[4] = motif_btk.getText().toString();
        row[5] = jml_kodi.getText().toString();
        row[6] = persentase.getSelectedItem().toString();
        row[7] = total_hrg.getText().toString();
        row[8] = biaya_kirim.getText().toString();
        row[9] = biaya_adm.getText().toString();
        row[10] = total_biaya.getText().toString();
        
        //masukkan
        model.addRow(row);        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BatikForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BatikForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BatikForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BatikForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BatikForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hitung;
    private javax.swing.JRadioButton adm_tidak;
    private javax.swing.JRadioButton adm_ya;
    private javax.swing.JTextField biaya_adm;
    private javax.swing.JTextField biaya_kirim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField enam_mabelas;
    private javax.swing.JTextField harga_perkode;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jml_kodi;
    private javax.swing.JTable jt;
    private javax.swing.JComboBox kode_btk;
    private javax.swing.JTextField mabelas_up;
    private javax.swing.JTextField motif_btk;
    private javax.swing.JTextField nm_pembeli;
    private javax.swing.JTextField no_kirim;
    private javax.swing.JComboBox persentase;
    private javax.swing.JTextField satu_lima;
    private javax.swing.JTextField total_biaya;
    private javax.swing.JTextField total_hrg;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package mainProgramInternal;

import utility.JaringanKeDatabase;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utility.ArrayComboBox;

/**
 *
 * @author Iza
 */
public class SubFrameInputForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form paymentForm
     */
    // {{{{"-- PILIH --", "Toyota", "Honda", "Suzuki", "Mercedez-Benz", "Daihatsu", "BMW"}}}}
    String[][][][] storage = (String[][][][]) ArrayComboBox.dataArray();
    String[] merekCbxArr = storage[0][0][0];
    public SubFrameInputForm() {
        
        initComponents();
        onOffCbxKredit(false,false,false,"0","0","0");
    }
    private void onOffCbxKredit(boolean cicilan, boolean dp,
            boolean cicilanPrb,String isiCicilan, String isiDp,String isiBulan){
        isiBulanCicilanTxt.setEnabled(cicilan);
        isiDpTxt.setEnabled(dp);
        isiCicilanPerBulanTxt.setEnabled(cicilanPrb);
        isiTotalAkhirTxt.setText("");
        isiPpnTxt.setText("");
        isiCicilanPerBulanTxt.setText(isiCicilan);
        isiDpTxt.setText(isiDp);
        isiBulanCicilanTxt.setText(isiBulan);
    }
    void hapusData (){
        isiDpTxt.setText("");
        merekMobilComboBox.setSelectedIndex(0);
        kotaPembeliComboBox.setSelectedIndex(0);
        namaPembeliTxt.setText("");
        isiPpnTxt.setText("");
        isiHargaTxt.setText("");
        tahunMobilTxt.setText("");
        isiTotalAkhirTxt.setText("");
        cbxPersetujuan.setSelected(false);
        if (cbxKredit.isSelected() == true){
            onOffCbxKredit(true,true,true,"","","");
        }
    }
    void hapusCbx () {
        merekMobilComboBox.setSelectedIndex(0);
        tipeMobilComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {null}));
        modelMobilComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {null}));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonKeMenu = new javax.swing.JButton();
        kotaPembeliComboBox = new javax.swing.JComboBox<>();
        merekMobilComboBox = new javax.swing.JComboBox<>();
        tipeMobilComboBox = new javax.swing.JComboBox<>();
        modelMobilComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        isiBulanCicilanTxt = new javax.swing.JTextField();
        isiPpnTxt = new javax.swing.JTextField();
        isiCicilanPerBulanTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbxPersetujuan = new javax.swing.JCheckBox();
        buttonProsesPerhitungan = new javax.swing.JButton();
        buttonSimpanKeDatabase = new javax.swing.JButton();
        buttonHapusTextField = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namaPembeliTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        isiHargaTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jlabel12 = new javax.swing.JLabel();
        isiDpTxt = new javax.swing.JTextField();
        tahunMobilTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        isiTotalAkhirTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbxKredit = new javax.swing.JCheckBox();

        setTitle("Form Penjualan");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonKeMenu.setText("Ke Menu Utama");
        buttonKeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeMenuActionPerformed(evt);
            }
        });

        kotaPembeliComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- PILIH --", "JAKARTA", "SURABAYA", "BANDUNG", "MEDAN", "SEMARANG", "PALEMBANG", "MAKASSAR", "BATAM", "BANDAR LAMPUNG", "PEKANBARU", "PADANG", "MALANG" }));

        merekMobilComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(merekCbxArr));
        merekMobilComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merekMobilComboBoxActionPerformed(evt);
            }
        });

        tipeMobilComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipeMobilComboBoxActionPerformed(evt);
            }
        });

        jLabel11.setText("Tipe");

        jLabel14.setText("Model");

        jLabel16.setText("Kota Pemesan");

        jLabel17.setText("Tahun");

        jLabel12.setText("Cicilan/bln");

        isiBulanCicilanTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        isiPpnTxt.setEditable(false);
        isiPpnTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        isiCicilanPerBulanTxt.setEditable(false);
        isiCicilanPerBulanTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel13.setText("Bulan");

        cbxPersetujuan.setText("Setuju");
        cbxPersetujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPersetujuanActionPerformed(evt);
            }
        });

        buttonProsesPerhitungan.setText("PROSES");
        buttonProsesPerhitungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProsesPerhitunganActionPerformed(evt);
            }
        });

        buttonSimpanKeDatabase.setText("SIMPAN");
        buttonSimpanKeDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanKeDatabaseActionPerformed(evt);
            }
        });

        buttonHapusTextField.setText("HAPUS");
        buttonHapusTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama Pemesan");

        jLabel2.setText("Merek");

        namaPembeliTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/other/mobil1.jpg"))); // NOI18N

        isiHargaTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setText("Harga");

        jlabel12.setText("DP");

        isiDpTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tahunMobilTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setText("PPN (10%)");

        isiTotalAkhirTxt.setEditable(false);
        isiTotalAkhirTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setText("Total Akhir");

        jLabel15.setText("Lama Cicilan");

        cbxKredit.setText("Kredit");
        cbxKredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxKreditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaPembeliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(merekMobilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kotaPembeliComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(buttonKeMenu)
                            .addGap(140, 140, 140)
                            .addComponent(buttonProsesPerhitungan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonSimpanKeDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonHapusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(isiTotalAkhirTxt)
                                .addComponent(isiDpTxt)
                                .addComponent(isiHargaTxt)
                                .addComponent(isiBulanCicilanTxt)
                                .addComponent(isiPpnTxt)
                                .addComponent(isiCicilanPerBulanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(cbxPersetujuan)
                                .addComponent(cbxKredit)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tahunMobilTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(modelMobilComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tipeMobilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26))))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(namaPembeliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tipeMobilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(merekMobilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelMobilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tahunMobilTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kotaPembeliComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(isiHargaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxKredit))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(isiDpTxt)
                            .addComponent(jlabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isiBulanCicilanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(isiPpnTxt)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(isiCicilanPerBulanTxt)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isiTotalAkhirTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxPersetujuan)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonProsesPerhitungan)
                        .addComponent(buttonSimpanKeDatabase)
                        .addComponent(buttonHapusTextField))
                    .addComponent(buttonKeMenu))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxPersetujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPersetujuanActionPerformed
        if (isiTotalAkhirTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tekan tombol proses terlebih dahulu");
            cbxPersetujuan.setSelected(false);
        } else if (namaPembeliTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama pemesan harus diisi");
            cbxPersetujuan.setSelected(false);
        } else if (merekMobilComboBox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Pilih Merek mobil");
            cbxPersetujuan.setSelected(false);
        } else if (tipeMobilComboBox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Pilih Tipe mobil");
            cbxPersetujuan.setSelected(false);
        } else if (modelMobilComboBox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Pilih Model mobil");
            cbxPersetujuan.setSelected(false);
        } else if (kotaPembeliComboBox.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Pilih Kota terlebih dahulu");
            cbxPersetujuan.setSelected(false);
        } else if (tahunMobilTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Tahun mobil harus diisi");
            cbxPersetujuan.setSelected(false);
        } else if (cbxPersetujuan.isSelected() == true) {
            JOptionPane.showMessageDialog(null, "Pemesan menyetujui");
            cbxPersetujuan.setSelected(true);
        } else {
            JOptionPane.showMessageDialog(null, "Pesanan belum disetujui");
            cbxPersetujuan.setSelected(false);
        }
    }//GEN-LAST:event_cbxPersetujuanActionPerformed

    private void buttonHapusTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusTextFieldActionPerformed
        hapusData();
        hapusCbx();
    }//GEN-LAST:event_buttonHapusTextFieldActionPerformed

    private void buttonProsesPerhitunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProsesPerhitunganActionPerformed
        if (isiHargaTxt.getText().isEmpty() || isiHargaTxt.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "Harga harus diisi");
        } else if (cbxKredit.isSelected() == false) {
            while (true){
                try{
                    long hargaPenjualan = Long.parseLong(isiHargaTxt.getText()),
                        totalAkhir,ppn;
                    ppn = hargaPenjualan * 10 / 100;
                    totalAkhir = hargaPenjualan + ppn;
                    isiPpnTxt.setText("" + ppn);
                    isiTotalAkhirTxt.setText("" + totalAkhir);
                    break;
                } catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Isian harus diisi oleh angka");
                    cbxPersetujuan.setSelected(false);
                break;
                }
            }
        } else if (isiDpTxt.getText().isEmpty() || isiDpTxt.getText().equals("0")){
            JOptionPane.showMessageDialog(null, "DP harus diisi");
        } else if (isiBulanCicilanTxt.getText().isEmpty() || isiBulanCicilanTxt.getText().equals("0")){
            JOptionPane.showMessageDialog(null, "Isi jumlah cicilan yang diinginkan");
        } else {
            while (true){
                try{
                    long hargaPenjualan = Long.parseLong(isiHargaTxt.getText()),
                        downPrice = Long.parseLong(isiDpTxt.getText()),
                        bulanCicilan = Long.parseLong(isiBulanCicilanTxt.getText()),
                        cicilanPerBulan,totalAkhir,ppnPembelian;
                    ppnPembelian = hargaPenjualan * 10 / 100;
                    cicilanPerBulan = ((hargaPenjualan - downPrice) + ppnPembelian)/ bulanCicilan;
                    totalAkhir = (cicilanPerBulan * bulanCicilan) + downPrice;
                    isiPpnTxt.setText("" + ppnPembelian);
                    isiCicilanPerBulanTxt.setText("" + cicilanPerBulan);
                    isiTotalAkhirTxt.setText("" + totalAkhir);
                    break;
                } catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Isian harus diisi oleh angka");
                    cbxPersetujuan.setSelected(false);
                break;
                }
            }
        }  
    }//GEN-LAST:event_buttonProsesPerhitunganActionPerformed

    private void buttonSimpanKeDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanKeDatabaseActionPerformed
        if (cbxPersetujuan.isSelected() == false) {
            JOptionPane.showMessageDialog(null,
                    "Klik centang checkbox untuk simpan data", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String sql_syntax =
                "INSERT INTO mobil (nama,merek,wilayah,model,tipe,"
                    + "tahun,harga,dp,jml_cicilan,cicilan_bulan,totalAkhir) VALUES ('"
                + namaPembeliTxt.getText() + "','"
                + merekMobilComboBox.getSelectedItem() + "','"
                + kotaPembeliComboBox.getSelectedItem() + "','"
                + modelMobilComboBox.getSelectedItem() + "','"
                + tipeMobilComboBox.getSelectedItem() + "','"
                + tahunMobilTxt.getText() + "','"
                + isiHargaTxt.getText() + "','"
                + isiDpTxt.getText() + "','"
                + isiBulanCicilanTxt.getText() + "','"
                + isiCicilanPerBulanTxt.getText() + "','"
                + isiTotalAkhirTxt.getText()+"')";
                Connection koneksi_db = (Connection) JaringanKeDatabase.koneksiDatabase();
                PreparedStatement stat_preparedStat;
                stat_preparedStat = (PreparedStatement) koneksi_db.prepareStatement(sql_syntax);
                stat_preparedStat.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke database");
            } catch (SQLException ex) {
            }
            hapusData();
            hapusCbx();
        }
    }//GEN-LAST:event_buttonSimpanKeDatabaseActionPerformed

    private void buttonKeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeMenuActionPerformed
        SubFrameMenuOpsi opt_menu = new SubFrameMenuOpsi();
        opt_menu.setVisible(true);
        this.getDesktopPane().add(opt_menu);
        this.dispose();
    }//GEN-LAST:event_buttonKeMenuActionPerformed

    private void merekMobilComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merekMobilComboBoxActionPerformed
        int selectedItemMerek = merekMobilComboBox.getSelectedIndex();
        if (selectedItemMerek > 0) {
            tipeMobilComboBox.setModel(
                    new javax.swing.DefaultComboBoxModel<>(storage[1][0][selectedItemMerek]));
        } else {
            tipeMobilComboBox.setModel(
                    new javax.swing.DefaultComboBoxModel<>(new String[] {null}));
            modelMobilComboBox.setModel(
                    new javax.swing.DefaultComboBoxModel<>(new String[] {null}));
        }
    }//GEN-LAST:event_merekMobilComboBoxActionPerformed

    private void tipeMobilComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipeMobilComboBoxActionPerformed
        int selectedItemMerek = merekMobilComboBox.getSelectedIndex();
        int selectedItemTipe = tipeMobilComboBox.getSelectedIndex();
        if (selectedItemTipe > 0) {
            modelMobilComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(
                    storage[2][selectedItemMerek][selectedItemTipe]));   
        } else {
            modelMobilComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] {null}));
        }
    }//GEN-LAST:event_tipeMobilComboBoxActionPerformed

    private void cbxKreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxKreditActionPerformed
        if (cbxKredit.isSelected() == true) {
            onOffCbxKredit(true,true,true,"","","");
        } else if (cbxKredit.isSelected() == false) {
            onOffCbxKredit(false,false,false,"0","0","0");
        }
    }//GEN-LAST:event_cbxKreditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapusTextField;
    private javax.swing.JButton buttonKeMenu;
    private javax.swing.JButton buttonProsesPerhitungan;
    private javax.swing.JButton buttonSimpanKeDatabase;
    private javax.swing.JCheckBox cbxKredit;
    private javax.swing.JCheckBox cbxPersetujuan;
    private javax.swing.JTextField isiBulanCicilanTxt;
    private javax.swing.JTextField isiCicilanPerBulanTxt;
    private javax.swing.JTextField isiDpTxt;
    private javax.swing.JTextField isiHargaTxt;
    private javax.swing.JTextField isiPpnTxt;
    private javax.swing.JTextField isiTotalAkhirTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabel12;
    private javax.swing.JComboBox<String> kotaPembeliComboBox;
    private javax.swing.JComboBox<String> merekMobilComboBox;
    private javax.swing.JComboBox<String> modelMobilComboBox;
    private javax.swing.JTextField namaPembeliTxt;
    private javax.swing.JTextField tahunMobilTxt;
    private javax.swing.JComboBox<String> tipeMobilComboBox;
    // End of variables declaration//GEN-END:variables
}

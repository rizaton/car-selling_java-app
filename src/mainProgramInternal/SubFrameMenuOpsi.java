/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package mainProgramInternal;
/**
 *
 * @author Iza
 */
public class SubFrameMenuOpsi extends javax.swing.JInternalFrame {

    /**
     * Creates new form OptionMenu
     */
    public SubFrameMenuOpsi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonKeFormPenjualan = new javax.swing.JButton();
        buttonKeTabelData = new javax.swing.JButton();

        setTitle("Menu Opsi");

        buttonKeFormPenjualan.setText("Form Penjualan");
        buttonKeFormPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeFormPenjualanActionPerformed(evt);
            }
        });

        buttonKeTabelData.setText("Tampilkan Data");
        buttonKeTabelData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeTabelDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(buttonKeFormPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonKeTabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonKeFormPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(buttonKeTabelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKeFormPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeFormPenjualanActionPerformed
        SubFrameInputForm formPenjualan = new SubFrameInputForm();
        formPenjualan.setVisible(true);
        this.getDesktopPane().add(formPenjualan);
        this.dispose();
    }//GEN-LAST:event_buttonKeFormPenjualanActionPerformed

    private void buttonKeTabelDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeTabelDataActionPerformed
        SubFrameTabelData dataForm = new SubFrameTabelData();
        dataForm.setVisible(true);
        this.getDesktopPane().add(dataForm);
        this.dispose();
    }//GEN-LAST:event_buttonKeTabelDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonKeFormPenjualan;
    private javax.swing.JButton buttonKeTabelData;
    // End of variables declaration//GEN-END:variables
}
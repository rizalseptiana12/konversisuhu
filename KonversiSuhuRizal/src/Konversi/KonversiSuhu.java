/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konversi;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo x220
 */
public class KonversiSuhu extends javax.swing.JFrame {
    Celcius c = new Celcius();
    Calvin k = new Calvin();
    Fahrenheit f = new Fahrenheit();

    /**
     * Creates new form KonversiSuhu
     */
    public KonversiSuhu() {
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

        Tinput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        FCelcius = new javax.swing.JRadioButton();
        FFahrenheit = new javax.swing.JRadioButton();
        FCalvin = new javax.swing.JRadioButton();
        TCelcius = new javax.swing.JRadioButton();
        TFahrenheit = new javax.swing.JRadioButton();
        TCalvin = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Bconvert = new javax.swing.JButton();
        Thasil = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Input");

        FCelcius.setText("Celcius");

        FFahrenheit.setText("Fahrenheit");

        FCalvin.setText("Calvin");

        TCelcius.setText("Celcius");

        TFahrenheit.setText("Fahrenheit");

        TCalvin.setText("Calvin");

        jLabel2.setText("From");

        jLabel3.setText("To");

        Bconvert.setText("Calculate");
        Bconvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconvertActionPerformed(evt);
            }
        });

        jLabel4.setText("Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tinput)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FCelcius)
                                    .addComponent(FFahrenheit)
                                    .addComponent(FCalvin)
                                    .addComponent(jLabel2))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(TCalvin)
                                    .addComponent(TFahrenheit)
                                    .addComponent(TCelcius)))
                            .addComponent(Thasil, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(Bconvert)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(Tinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FCelcius)
                    .addComponent(TCelcius))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FFahrenheit)
                    .addComponent(TFahrenheit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FCalvin)
                    .addComponent(TCalvin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bconvert)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Thasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BconvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconvertActionPerformed
        // TODO add your handling code here:
        if(Tinput.getText().equals ("")){
            JOptionPane.showMessageDialog(null, "input tidak boleh kosong", "error", JOptionPane.ERROR_MESSAGE);
        }
        double n = Double.parseDouble(Tinput.getText());
        
        if (FCalvin.isSelected()){
            if(TCelcius.isSelected()){
                n = k.toCelcius(n);
                Thasil.setText(String.valueOf(n));
            }
            if(TFahrenheit.isSelected()){
                n = k.toFahrenheit(n);
                Thasil.setText(String.valueOf(n));
            }
            if(TCalvin.isSelected()){
                n = k.toCalvin(n);
                Thasil.setText(String.valueOf(n));
                JOptionPane.showMessageDialog(null, "tidak ada konversi yang dilakukan");
            }
        }
        if(FCelcius.isSelected()){
            if(TCelcius.isSelected()){
                n = c.toCelcius(n);
                Thasil.setText(String.valueOf(n));
                JOptionPane.showMessageDialog(null, "tidak ada konversi yang dilakukan");
            }
            if(TFahrenheit.isSelected()){
                n = c.toFahrenheit(n);
                Thasil.setText(String.valueOf(n));
            }
            if(TCalvin.isSelected()){
                n = c.toCalvin(n);
                Thasil.setText(String.valueOf(n));
            }
        }
        if(FFahrenheit.isSelected()){
            if(TCelcius.isSelected()){
                n = f.toCelcius(n);
                Thasil.setText(String.valueOf(n));
            }
            if(TFahrenheit.isSelected()){
                n = f.toFahrenheit(n);
                Thasil.setText(String.valueOf(n));
                JOptionPane.showMessageDialog(null, "tidak ada konversi yang dilakukan");
            }
            if(TCalvin.isSelected()){
                n = f.toCalvin(n);
                Thasil.setText(String.valueOf(n));
            }
        }
        
        
    }//GEN-LAST:event_BconvertActionPerformed

    private void TinputKeyTyped(java.awt.event.KeyEvent evt) {
        //TODO add your handling code here:
        cekKey(evt);
    }
    
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt){
        // TODO add your handling code here:
        System.exit(0);
    }
    
    private void TinputActionPerformed(java.awt.event.ActionEvent evt){
        // TODO add your handling code here:
    }
    
    private void FcalciusActionPerformed(java.awt.event.ActionEvent evt){
        // TODO add your handling code here:
    }
    
    private void TcalciusActionPerformed(java.awt.event.ActionEvent evt){
        // TODO add your handling code here:
    }
    
    
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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bconvert;
    private javax.swing.JRadioButton FCalvin;
    private javax.swing.JRadioButton FCelcius;
    private javax.swing.JRadioButton FFahrenheit;
    private javax.swing.JRadioButton TCalvin;
    private javax.swing.JRadioButton TCelcius;
    private javax.swing.JRadioButton TFahrenheit;
    private javax.swing.JTextField Thasil;
    private javax.swing.JTextField Tinput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private void cekKey(KeyEvent a) {
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null, "input harus berupa angka", "error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
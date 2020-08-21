/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class customerSignup extends javax.swing.JFrame {

    /**
     * Creates new form customerSignup
     */
    public customerSignup() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        cnic = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        pswd = new javax.swing.JPasswordField();
        cpswd = new javax.swing.JPasswordField();
        amount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Signup");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 320, 60));

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 50, 50));

        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setOpaque(false);
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 210, -1));

        cnic.setForeground(new java.awt.Color(255, 255, 255));
        cnic.setOpaque(false);
        getContentPane().add(cnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 210, -1));

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setOpaque(false);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 210, -1));

        pswd.setForeground(new java.awt.Color(255, 255, 255));
        pswd.setOpaque(false);
        getContentPane().add(pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 210, -1));

        cpswd.setForeground(new java.awt.Color(255, 255, 255));
        cpswd.setOpaque(false);
        cpswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpswdActionPerformed(evt);
            }
        });
        getContentPane().add(cpswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 210, -1));

        amount.setForeground(new java.awt.Color(255, 255, 255));
        amount.setOpaque(false);
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 210, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarysystem/customerSignup.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void cpswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpswdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                new customerLogin().setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(name.getText().isEmpty() || cnic.getText().isEmpty() || username.getText().isEmpty() || pswd.getText().isEmpty() || amount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields should be filled.");
        }
        
       
        else if(cnic.getText().length() != 13) {
            JOptionPane.showMessageDialog(this, "Invalid CNIC Number.");
        }
         else if(!pswd.getText().equals(cpswd.getText())) {
            JOptionPane.showMessageDialog(this, "Password and Confirm Password did not matched.");
        }
        else{
            try {
                customer c = new customer(name.getText(),cnic.getText(),username.getText(),pswd.getText(),Double.parseDouble(amount.getText()));
                if(c.checkUsername(username.getText())){
                     JOptionPane.showMessageDialog(this, "This username already exists, please try again with another username.");
                }
                else {
                    c.write();
                     JOptionPane.showMessageDialog(this, "Signup Successful.");
                     new customerLogin().setVisible(true);
                     this.setVisible(false);
                    
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(customerSignup.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(customerSignup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(customerSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField cnic;
    private javax.swing.JPasswordField cpswd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pswd;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendacomics;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlumMati
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        
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

        Compras = new javax.swing.JButton();
        Distribuidores = new javax.swing.JButton();
        Editorial = new javax.swing.JButton();
        Facturas = new javax.swing.JButton();
        Historial = new javax.swing.JButton();
        Peticiones = new javax.swing.JButton();
        Desconexion = new javax.swing.JButton();
        Ventas = new javax.swing.JButton();
        Comics = new javax.swing.JButton();
        Clientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Compras.setText("Compras");
        Compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprasActionPerformed(evt);
            }
        });
        getContentPane().add(Compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 110, 50));

        Distribuidores.setText("Distribuidores");
        Distribuidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistribuidoresActionPerformed(evt);
            }
        });
        getContentPane().add(Distribuidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 110, 50));

        Editorial.setText("Editorial");
        Editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditorialActionPerformed(evt);
            }
        });
        getContentPane().add(Editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 110, 50));

        Facturas.setText("Facturas");
        Facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturasActionPerformed(evt);
            }
        });
        getContentPane().add(Facturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 110, 50));

        Historial.setText("Historial");
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });
        getContentPane().add(Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 110, 50));

        Peticiones.setText("Peticiones");
        Peticiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeticionesActionPerformed(evt);
            }
        });
        getContentPane().add(Peticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 110, 50));

        Desconexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendacomics/imagenes/iconos/logout-512.png"))); // NOI18N
        Desconexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesconexionActionPerformed(evt);
            }
        });
        getContentPane().add(Desconexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 110, 80));

        Ventas.setText("Ventas");
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });
        getContentPane().add(Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 110, 50));

        Comics.setText("Cómics");
        Comics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComicsActionPerformed(evt);
            }
        });
        getContentPane().add(Comics, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 110, 50));

        Clientes.setText("Clientes");
        Clientes.setBorder(null);
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        getContentPane().add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendacomics/imagenes/menuflash.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, 860, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DesconexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesconexionActionPerformed
        dispose();
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_DesconexionActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        try {
            Clientes cli = new Clientes();
            cli.setVisible(true);
            cli.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ClientesActionPerformed

    private void ComicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComicsActionPerformed
        try {
            Comics com = new Comics();
            com.setVisible(true);
            com.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComicsActionPerformed

    private void ComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprasActionPerformed
        try {
            Compras cop = new Compras();
            cop.setVisible(true);
            cop.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComprasActionPerformed

    private void DistribuidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistribuidoresActionPerformed
        try {
            Distribuidores dis = new Distribuidores();
            dis.setVisible(true);
            dis.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DistribuidoresActionPerformed

    private void EditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditorialActionPerformed
        try {
            Editorial ed = new Editorial();
            ed.setVisible(true);
            ed.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditorialActionPerformed

    private void FacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturasActionPerformed
        try {
            Facturas fac = new Facturas();
            fac.setVisible(true);
            fac.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FacturasActionPerformed

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        try {
            Historial his = new Historial();
            his.setVisible(true);
            his.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HistorialActionPerformed

    private void PeticionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeticionesActionPerformed
        try {
            Peticiones pet = new Peticiones();
            pet.setVisible(true);
            pet.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PeticionesActionPerformed

    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
        try {
            Ventas ven = new Ventas();
            ven.setVisible(true);
            ven.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_VentasActionPerformed

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
    private javax.swing.JButton Clientes;
    private javax.swing.JButton Comics;
    private javax.swing.JButton Compras;
    private javax.swing.JButton Desconexion;
    private javax.swing.JButton Distribuidores;
    private javax.swing.JButton Editorial;
    private javax.swing.JButton Facturas;
    private javax.swing.JButton Historial;
    private javax.swing.JButton Peticiones;
    private javax.swing.JButton Ventas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

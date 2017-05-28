/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendacomics;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author AlumMati
 */
public class Clientes extends javax.swing.JFrame {

    static public ResultSet r;
    static public Connection connec;

    public Clientes() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SUPERHEROES COMICS");
        String url = "jdbc:mysql://localhost:3306/bd_aplicacion";
        String user = "root";
        String pass = "";
        connec = DriverManager.getConnection(url, user, pass);

        Statement s = (Statement) connec.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String query = "select * from Clientes C";
        r = s.executeQuery(query);
        r.first();

        Codigo.setText(r.getString("Codigo"));
        Nombre.setText(r.getString("Nombre"));
        Apellidos.setText(r.getString("Apellidos"));
        FechaNac.setText(r.getString("FechaNacimiento"));
        FechaCli.setText(r.getString("FechaCliente"));
        HistorialPed.setText(r.getString("HistorialPedidos"));

        Codigo.setEditable(false);
        Nombre.setEditable(false);
        Apellidos.setEditable(false);
        FechaNac.setEditable(false);
        FechaCli.setEditable(false);
        HistorialPed.setEditable(false);
        Insertar.setEnabled(false);
        Cancelar.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        FechaCli = new javax.swing.JTextField();
        FechaNac = new javax.swing.JTextField();
        HistorialPed = new javax.swing.JTextField();
        Siguiente = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        Primero = new javax.swing.JButton();
        Ultimo = new javax.swing.JButton();
        Insertar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 24, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Código");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Apellidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("FechaNacimiento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("FechaCliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("HistorialPedidos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoActionPerformed(evt);
            }
        });
        getContentPane().add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 200, -1));
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 200, -1));
        getContentPane().add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 200, -1));
        getContentPane().add(FechaCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 200, -1));
        getContentPane().add(FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 200, -1));
        getContentPane().add(HistorialPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 200, -1));

        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        Anterior.setText("Anterior");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        Primero.setText("Primero");
        Primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimeroActionPerformed(evt);
            }
        });
        getContentPane().add(Primero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 80, -1));

        Ultimo.setText("Último");
        Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoActionPerformed(evt);
            }
        });
        getContentPane().add(Ultimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 70, -1));

        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });
        getContentPane().add(Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        Cancelar.setText("Cancelar");
        Cancelar.setToolTipText("");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendacomics/imagenes/wolverine.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        try {
            if (r.previous()) {
                Codigo.setText(r.getString("Codigo"));
                Nombre.setText(r.getString("Nombre"));
                Apellidos.setText(r.getString("Apellidos"));
                FechaNac.setText(r.getString("FechaNacimiento"));
                FechaCli.setText(r.getString("FechaCliente"));
                HistorialPed.setText(r.getString("HistorialPedidos"));
            } else {
                JOptionPane.showMessageDialog(null, "Estás en el primer registro.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AnteriorActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        try {
            if (r.next()) {
                Codigo.setText(r.getString("Codigo"));
                Nombre.setText(r.getString("Nombre"));
                Apellidos.setText(r.getString("Apellidos"));
                FechaNac.setText(r.getString("FechaNacimiento"));
                FechaCli.setText(r.getString("FechaCliente"));
                HistorialPed.setText(r.getString("HistorialPedidos"));
            } else {
                JOptionPane.showMessageDialog(null, "Estás en el último registro.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SiguienteActionPerformed

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
        try {
            if (r.last()) {
                Codigo.setText(r.getString("Codigo"));
                Nombre.setText(r.getString("Nombre"));
                Apellidos.setText(r.getString("Apellidos"));
                FechaNac.setText(r.getString("FechaNacimiento"));
                FechaCli.setText(r.getString("FechaCliente"));
                HistorialPed.setText(r.getString("HistorialPedidos"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UltimoActionPerformed

    private void PrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimeroActionPerformed
        try {
            if (r.first()) {
                Codigo.setText(r.getString("Codigo"));
                Nombre.setText(r.getString("Nombre"));
                Apellidos.setText(r.getString("Apellidos"));
                FechaNac.setText(r.getString("FechaNacimiento"));
                FechaCli.setText(r.getString("FechaCliente"));
                HistorialPed.setText(r.getString("HistorialPedidos"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrimeroActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        try {
            String vCodigo, vNombre, vApellidos, vFechaNac, vFechaCli, vHistorialPed;
            vCodigo = Codigo.getText();
            vNombre = Nombre.getText();
            vApellidos = Apellidos.getText();
            vFechaNac = FechaNac.getText();
            vFechaCli = FechaCli.getText();
            vHistorialPed = HistorialPed.getText();
            String url = "jdbc:mysql://localhost:3306/bd_aplicacion";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement s = connection.createStatement();
            if (Codigo.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "No has insertado un código");
            } else {
                String query = "insert into clientes values ('" + vCodigo + "','" + vNombre + "','" + vApellidos + "','" + vFechaNac + "','" + vFechaCli + "','" + vHistorialPed + "')";
                int resultado = s.executeUpdate(query);
                String query2 = "select * from Clientes";
                r = s.executeQuery(query2);
                r.first();
            }

            Anterior.setEnabled(true);
            Nuevo.setEnabled(true);
            Siguiente.setEnabled(true);
            Primero.setEnabled(true);
            Ultimo.setEnabled(true);
            Insertar.setEnabled(false);
            Cancelar.setEnabled(false);

        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_InsertarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        try {
            Insertar.setEnabled(false);
            Cancelar.setEnabled(false);
            Primero.setEnabled(true);
            Ultimo.setEnabled(true);
            Anterior.setEnabled(true);
            Siguiente.setEnabled(true);
            Volver.setEnabled(true);
            Codigo.setEditable(false);
            Nombre.setEditable(false);
            Apellidos.setEditable(false);
            FechaNac.setEditable(false);
            FechaCli.setEditable(false);
            HistorialPed.setEditable(false);
            Nuevo.setEnabled(true);

            if (r.first()) {
                Codigo.setText(r.getString("Codigo"));
                Nombre.setText(r.getString("Nombre"));
                Apellidos.setText(r.getString("Apellidos"));
                FechaNac.setText(r.getString("FechaNacimiento"));
                FechaCli.setText(r.getString("FechaCliente"));
                HistorialPed.setText(r.getString("HistorialPedidos"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed

        JOptionPane.showMessageDialog(null, "Vas a registrar un nuevo Cliente. Pulsa Aceptar para continuar.");

        Codigo.setEditable(true);
        Nombre.setEditable(true);
        Apellidos.setEditable(true);
        FechaNac.setEditable(true);
        FechaCli.setEditable(true);
        HistorialPed.setEditable(true);
        Anterior.setEnabled(false);
        Nuevo.setEnabled(false);
        Siguiente.setEnabled(false);
        Primero.setEnabled(false);
        Ultimo.setEnabled(false);
        Insertar.setVisible(true);
        Cancelar.setVisible(true);
        Insertar.setEnabled(true);
        Cancelar.setEnabled(true);
        Codigo.setText(null);
        Nombre.setText(null);
        Apellidos.setText(null);
        FechaNac.setText(null);
        FechaCli.setText(null);
        HistorialPed.setText(null);

    }//GEN-LAST:event_NuevoActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JTextField Apellidos;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField FechaCli;
    private javax.swing.JTextField FechaNac;
    private javax.swing.JTextField HistorialPed;
    private javax.swing.JButton Insertar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton Primero;
    private javax.swing.JButton Siguiente;
    private javax.swing.JButton Ultimo;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}

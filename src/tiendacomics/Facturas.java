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
public class Facturas extends javax.swing.JFrame {

    static public ResultSet r;
    static public Connection connec;

    /**
     * Creates new form Facturas
     */
    public Facturas() throws SQLException {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("SUPERHEROES COMICS");
        String url = "jdbc:mysql://localhost:3306/bd_aplicacion";
        String user = "root";
        String pass = "";
        connec = DriverManager.getConnection(url, user, pass);

        Statement s = (Statement) connec.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String query = "select * from Facturas F";
        r = s.executeQuery(query);
        r.first();

        Id.setText(r.getString("Identificador"));
        Articulo.setText(r.getString("Articulos"));
        Cantidad.setText(r.getString("Cantidad"));
        Precio.setText(r.getString("Precio"));
        IVA.setText(r.getString("IVA"));
        FechaFac.setText(r.getString("FechaFactura"));
        IdCli.setText(r.getString("IdCliente"));

        Id.setEditable(false);
        Articulo.setEditable(false);
        Cantidad.setEditable(false);
        Precio.setEditable(false);
        IVA.setEditable(false);
        FechaFac.setEditable(false);
        IdCli.setEditable(false);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        Articulo = new javax.swing.JTextField();
        Cantidad = new javax.swing.JTextField();
        Precio = new javax.swing.JTextField();
        IVA = new javax.swing.JTextField();
        FechaFac = new javax.swing.JTextField();
        IdCli = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();
        Insertar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        Primero = new javax.swing.JButton();
        Ultimo = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Facturas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Identificador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Artículos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Precio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("IVA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("FechaFactura");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("IdCliente");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));
        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 222, -1));
        getContentPane().add(Articulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 222, -1));
        getContentPane().add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 222, -1));
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 222, -1));
        getContentPane().add(IVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 222, -1));
        getContentPane().add(FechaFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 222, -1));
        getContentPane().add(IdCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 222, -1));

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });
        getContentPane().add(Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        Primero.setText("Primero");
        Primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimeroActionPerformed(evt);
            }
        });
        getContentPane().add(Primero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 80, -1));

        Ultimo.setText("Último");
        Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoActionPerformed(evt);
            }
        });
        getContentPane().add(Ultimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 70, -1));

        Anterior.setText("Anterior");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiendacomics/imagenes/joker.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        try {
            if (r.previous()) {
                Id.setText(r.getString("Identificador"));
                Articulo.setText(r.getString("Articulos"));
                Cantidad.setText(r.getString("Cantidad"));
                Precio.setText(r.getString("Precio"));
                IVA.setText(r.getString("IVA"));
                FechaFac.setText(r.getString("FechaFactura"));
                IdCli.setText(r.getString("IdCliente"));
            } else {
                JOptionPane.showMessageDialog(null, "Estás en el primer registro.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AnteriorActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        try {
            if (r.next()) {
                Id.setText(r.getString("Identificador"));
                Articulo.setText(r.getString("Articulos"));
                Cantidad.setText(r.getString("Cantidad"));
                Precio.setText(r.getString("Precio"));
                IVA.setText(r.getString("IVA"));
                FechaFac.setText(r.getString("FechaFactura"));
                IdCli.setText(r.getString("IdCliente"));
            } else {
                JOptionPane.showMessageDialog(null, "Estás en el último registro.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SiguienteActionPerformed

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
        try {
            if (r.last()) {
                Id.setText(r.getString("Identificador"));
                Articulo.setText(r.getString("Articulos"));
                Cantidad.setText(r.getString("Cantidad"));
                Precio.setText(r.getString("Precio"));
                IVA.setText(r.getString("IVA"));
                FechaFac.setText(r.getString("FechaFactura"));
                IdCli.setText(r.getString("IdCliente"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UltimoActionPerformed

    private void PrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimeroActionPerformed
        try {
            if (r.first()) {
                Id.setText(r.getString("Identificador"));
                Articulo.setText(r.getString("Articulos"));
                Cantidad.setText(r.getString("Cantidad"));
                Precio.setText(r.getString("Precio"));
                IVA.setText(r.getString("IVA"));
                FechaFac.setText(r.getString("FechaFactura"));
                IdCli.setText(r.getString("IdCliente"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrimeroActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        try {
            String vId, vArticulo, vCantidad, vPrecio, vIVA, vFechaFac, vIdCli;
            vId = Id.getText();
            vArticulo = Articulo.getText();
            vCantidad = Cantidad.getText();
            vPrecio = Precio.getText();
            vIVA = IVA.getText();
            vFechaFac = FechaFac.getText();
            vIdCli = IdCli.getText();
            String url = "jdbc:mysql://localhost:3306/bd_aplicacion";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement s = connection.createStatement();
            if (Id.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "No has insertado un identificador");
            } else {
                String query = "insert into Facturas values ('" + vId + "','" + vArticulo + "','" + vCantidad + "','" + vPrecio + "','" + vIVA + "','" + vFechaFac + "','" + vIdCli + "')";
                int resultado = s.executeUpdate(query);
                String query2 = "select * from Facturas";
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
            Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
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
            Id.setEditable(false);
            Articulo.setEditable(false);
            Cantidad.setEditable(false);
            Precio.setEditable(false);
            IVA.setEditable(false);
            FechaFac.setEditable(false);
            IdCli.setEditable(false);
            Nuevo.setEnabled(true);

            if (r.first()) {
                Id.setText(r.getString("Identificador"));
                Articulo.setText(r.getString("Articulos"));
                Cantidad.setText(r.getString("Cantidad"));
                Precio.setText(r.getString("Precio"));
                IVA.setText(r.getString("IVA"));
                FechaFac.setText(r.getString("FechaFactura"));
                IdCli.setText(r.getString("IdCliente"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Facturas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        JOptionPane.showMessageDialog(null, "Vas a registrar una nueva Factura. Pulsa Aceptar para continuar.");

        Id.setEditable(true);
        Articulo.setEditable(true);
        Cantidad.setEditable(true);
        Precio.setEditable(true);
        IVA.setEditable(true);
        FechaFac.setEditable(true);
        IdCli.setEditable(true);
        Anterior.setEnabled(false);
        Nuevo.setEnabled(false);
        Siguiente.setEnabled(false);
        Primero.setEnabled(false);
        Ultimo.setEnabled(false);
        Insertar.setVisible(true);
        Cancelar.setVisible(true);
        Insertar.setEnabled(true);
        Cancelar.setEnabled(true);
        Id.setText(null);
        Articulo.setText(null);
        Cantidad.setText(null);
        Precio.setText(null);
        IVA.setText(null);
        FechaFac.setText(null);
        IdCli.setText(null);
    }//GEN-LAST:event_NuevoActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        dispose();
    }//GEN-LAST:event_VolverActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JTextField Articulo;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField FechaFac;
    private javax.swing.JTextField IVA;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField IdCli;
    private javax.swing.JButton Insertar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JTextField Precio;
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
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaGrafica;

import CapaLogica.Administrador;
import capaLogica.Cine;
import static capaLogica.Cine.totalPagadoSala1;
import static capaLogica.Cine.totalPagadoSala2;
import static capaLogica.Cine.totalPagadoSala3;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class FrmOpcionesAdmin extends javax.swing.JFrame {

    private Cine cine;
    private Administrador admin;

    /**
     * Creates new form AdministrarCartelera
     */
    public FrmOpcionesAdmin(Cine cn) {
        initComponents();
        
    }
    public void setCine(Cine cine){
     this.cine = cine;   
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnVolver = new javax.swing.JButton();
        btnDefinirCartelera = new javax.swing.JButton();
        btnMostrarEstadoSalas = new javax.swing.JButton();
        btnReporteDeIngresos = new javax.swing.JButton();
        btnReporteAsientos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        btnVolver.setBackground(new java.awt.Color(255, 102, 102));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnDefinirCartelera.setText("Definir cartelera");
        btnDefinirCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefinirCarteleraActionPerformed(evt);
            }
        });

        btnMostrarEstadoSalas.setText("Mostrar Estado de salas");
        btnMostrarEstadoSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEstadoSalasActionPerformed(evt);
            }
        });

        btnReporteDeIngresos.setText("Reporte de ingresos");
        btnReporteDeIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteDeIngresosActionPerformed(evt);
            }
        });

        btnReporteAsientos.setText("Reporte de asientos");
        btnReporteAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteAsientosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Opciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDefinirCartelera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMostrarEstadoSalas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReporteAsientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReporteDeIngresos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnVolver)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDefinirCartelera)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarEstadoSalas)
                .addGap(18, 18, 18)
                .addComponent(btnReporteAsientos)
                .addGap(18, 18, 18)
                .addComponent(btnReporteDeIngresos)
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        FrmAdministrador adm = new FrmAdministrador();
        adm.setVisible(true);
        adm.setLocationRelativeTo(this);
        adm.setCine(cine);
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnDefinirCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefinirCarteleraActionPerformed
        this.dispose();
        FrmAdministrarCartelera adm = new FrmAdministrarCartelera();
        adm.setVisible(true);
        adm.setLocationRelativeTo(this);
        adm.setCine(cine);
    }//GEN-LAST:event_btnDefinirCarteleraActionPerformed

    private void btnReporteDeIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteDeIngresosActionPerformed
        JOptionPane.showMessageDialog(this, "Ingresos de sala 1: "+totalPagadoSala1+"₡"+"\n"+
                                        "Ingresos sala 2: "+totalPagadoSala2+"₡"+"\n"+
                                        "Ingresos sala 3: "+totalPagadoSala3+"₡");
    }//GEN-LAST:event_btnReporteDeIngresosActionPerformed

    private void btnMostrarEstadoSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEstadoSalasActionPerformed
        this.dispose();
        FrmSalas salas = new FrmSalas();
        salas.setVisible(true);
        salas.setLocationRelativeTo(this);
        salas.setCine(cine);
        
    }//GEN-LAST:event_btnMostrarEstadoSalasActionPerformed

    private void btnReporteAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteAsientosActionPerformed
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de sala"));
        
        JOptionPane.showMessageDialog(this, "Asientos reservados: "+cine.numeroAsientosReservados(opcion)+" en sala"+opcion);
    }//GEN-LAST:event_btnReporteAsientosActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDefinirCartelera;
    private javax.swing.JButton btnMostrarEstadoSalas;
    private javax.swing.JButton btnReporteAsientos;
    private javax.swing.JButton btnReporteDeIngresos;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

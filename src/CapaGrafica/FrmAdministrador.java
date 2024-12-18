/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaGrafica;

import CapaLogica.Administrador;
import static CapaLogica.Administrador.contadorDeIntentos;
import capaLogica.Cine;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class FrmAdministrador extends javax.swing.JFrame {
    private Cine cine;
    Administrador admin = new Administrador();
   

    /**
     * Creates new form FrmAdministrador
     * @param cn
     */
    public FrmAdministrador() {
        initComponents();
        
    }
    public void setCine(Cine cn) {
        this.cine = cn;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCartelera = new javax.swing.JButton();
        btnReservaciones = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        btnCartelera.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        btnCartelera.setText("Administrar cartelera");
        btnCartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarteleraActionPerformed(evt);
            }
        });

        btnReservaciones.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        btnReservaciones.setText("Reservaciones y compra");
        btnReservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservacionesActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 102, 102));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 255, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Bienvenido!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnReservaciones)
                        .addGap(18, 18, 18)
                        .addComponent(btnCartelera, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnSalir)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCartelera, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarteleraActionPerformed
        if(contadorDeIntentos==3){
            JOptionPane.showMessageDialog(this, "0 intentos restantes");
                return;
            }
        
        String clave = (JOptionPane.showInputDialog("Ingrese clave de ingreso"));
        if(admin.validarContrasena(clave) == true){
            contadorDeIntentos++;
            if(contadorDeIntentos==3){
                return;
            }
            FrmOpcionesAdmin adm = new FrmOpcionesAdmin(cine);
            adm.setVisible(true);
            adm.setLocationRelativeTo(this);
            adm.setCine(cine);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Clave invalida");
        }
    }//GEN-LAST:event_btnCarteleraActionPerformed

    private void btnReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservacionesActionPerformed
        this.dispose();
        FrmCliente c1 = new FrmCliente();
        c1.setVisible(true);
        c1.setLocationRelativeTo(null);
        c1.setCine(cine);
        
    }//GEN-LAST:event_btnReservacionesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCartelera;
    private javax.swing.JButton btnReservaciones;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

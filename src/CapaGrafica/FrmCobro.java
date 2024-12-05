/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaGrafica;

import CapaLogica.Cliente;
import capaLogica.Cine;
import java.time.DateTimeException;
import java.time.YearMonth ;
import javax.swing.JOptionPane;

public class FrmCobro extends javax.swing.JFrame {
        
        private Cliente cliente;
        private Cine cine;
    
        
        public FrmCobro() {
        initComponents();
        txtFechaVencimiento.setText("01-2025"); 
        CCV.setText("500");
        this.setTitle("Comprar");
    }
         
    public void setRegistro(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setCine(Cine cine){
        this.cine = cine;
    }
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Visa = new javax.swing.JRadioButton();
        MasterCard = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CCV = new javax.swing.JTextField();
        txtFechaVencimiento = new javax.swing.JTextField();
        N_tarjeta = new javax.swing.JTextField();
        N_cliente = new javax.swing.JTextField();
        Comprar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        Nreserva = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Facturacion");

        jLabel2.setText("Nombre de cliente:");

        buttonGroup1.add(Visa);
        Visa.setText("Visa");
        Visa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisaActionPerformed(evt);
            }
        });

        buttonGroup1.add(MasterCard);
        MasterCard.setSelected(true);
        MasterCard.setText("MasterCard");
        MasterCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasterCardActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero de Tarjeta:");

        jLabel4.setText("Fecha de vencimiento:");

        jLabel5.setText("Codigo de Seguridad:");

        CCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCVActionPerformed(evt);
            }
        });
        CCV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CCVKeyTyped(evt);
            }
        });

        txtFechaVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaVencimientoActionPerformed(evt);
            }
        });

        N_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_tarjetaActionPerformed(evt);
            }
        });
        N_tarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                N_tarjetaKeyTyped(evt);
            }
        });

        N_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_clienteActionPerformed(evt);
            }
        });

        Comprar.setText("Comprar");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        jLabel6.setText("Numero de Reservacion:");

        jLabel7.setText("Selecciones tipo de tarjeta:");

        btnVolver.setBackground(new java.awt.Color(255, 102, 102));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MasterCard, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnVolver)
                                        .addGap(28, 28, 28))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Visa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CCV, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(Nreserva))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(N_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Visa)
                    .addComponent(MasterCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(N_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CCVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CCVKeyTyped
        if (CCV.getText().length()>=3)
        {
            evt.consume();
        }
    }//GEN-LAST:event_CCVKeyTyped

    private void CCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CCVActionPerformed

    private void N_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N_tarjetaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_N_tarjetaActionPerformed

    private void N_tarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_N_tarjetaKeyTyped
        // TODO add your handling code here:
        if (N_tarjeta.getText().length()>=16)
        {
            evt.consume();
        }
    }//GEN-LAST:event_N_tarjetaKeyTyped

    private void N_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N_clienteActionPerformed
   
    }//GEN-LAST:event_N_clienteActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        // TODO add your handling code here:
    String fechaTexto = txtFechaVencimiento.getText().trim();
    String fechaRegex = "^(0[1-9]|1[0-2])-(\\d{4})$";
    if (!fechaTexto.matches(fechaRegex)) {
        JOptionPane.showMessageDialog(this, "El formato de fecha debe ser MM-YYYY.");
        return;
    }
    
    String[] partesFecha = fechaTexto.split("-");
    int mes = Integer.parseInt(partesFecha[0]);
    int anio = Integer.parseInt(partesFecha[1]);
    
    if (anio <= 2024) {
        JOptionPane.showMessageDialog(this, "El año debe ser mayor a 2024.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        YearMonth fechaVencimiento = YearMonth.of(anio, mes);
        if (fechaVencimiento.isBefore(YearMonth.now())) {
            JOptionPane.showMessageDialog(this, "La fecha debe ser futura.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (DateTimeException e) {
        JOptionPane.showMessageDialog(this, "Error en la fecha: " + e.getMessage());
        return;
    }
    
    String numeroTarjeta = N_tarjeta.getText().trim();
    if (numeroTarjeta.isEmpty()||numeroTarjeta.length() != 16) {
        JOptionPane.showMessageDialog(this, "El número de tarjeta debe tener 16 dígitos.", "Error", JOptionPane.ERROR_MESSAGE );
        return;
    }

    String tipoTarjeta = Visa.isSelected() ? "Visa" : "MasterCard";

    try {
        Cliente miCliente = new Cliente(tipoTarjeta, numeroTarjeta, fechaTexto, CCV.getText());
        FrmFactura factura = new FrmFactura(
            String.valueOf(miCliente.contadorReservaciones - 1),
            N_cliente.getText(),
            tipoTarjeta,
            numeroTarjeta,
            fechaTexto,
            CCV.getText()
        );
        factura.setVisible(true);
        factura.setLocationRelativeTo(null);
        factura.setCine(cine);

        this.dispose(); 
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    } catch (DateTimeException e) {
        JOptionPane.showMessageDialog(this, "Error en la fecha: " + e.getMessage());
        return;
    }
   cine.reservarAsiento();

    }//GEN-LAST:event_ComprarActionPerformed
 
    private void txtFechaVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaVencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaVencimientoActionPerformed

    private void MasterCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasterCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MasterCardActionPerformed

    private void VisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VisaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        FrmReserva reser = new FrmReserva();
        reser.setVisible(true);
        reser.setLocationRelativeTo(this);
        reser.setCine(cine);
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCV;
    private javax.swing.JButton Comprar;
    private javax.swing.JRadioButton MasterCard;
    private javax.swing.JTextField N_cliente;
    private javax.swing.JTextField N_tarjeta;
    private javax.swing.JLabel Nreserva;
    private javax.swing.JRadioButton Visa;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtFechaVencimiento;
    // End of variables declaration//GEN-END:variables
}

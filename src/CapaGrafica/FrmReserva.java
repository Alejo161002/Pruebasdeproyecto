/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaGrafica;


import CapaLogica.Cliente;
import capaLogica.Cine;
import static capaLogica.Cine.contador;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;


/**
 *
 * @author sebas
 */
public class FrmReserva extends javax.swing.JFrame {

    private Cine cine;
    private Cliente cliente;
    //Cine cine = new Cine();
    
    public FrmReserva() {
        initComponents();
        
        
         ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbtnItalia);
        grupo.add(rbtnRio);
        grupo.add(rbtnX);
        
        
    }
    public void setCine(Cine cine){
        this.cine = cine;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnItalia = new javax.swing.JRadioButton();
        rbtnRio = new javax.swing.JRadioButton();
        rbtnX = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAdultoRegular = new javax.swing.JTextField();
        txtAdultoMayor = new javax.swing.JTextField();
        txtninnos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnMostrarAsientos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnSelecionarAsientos = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        rbtnItalia.setSelected(true);
        rbtnItalia.setText("Italia 90");
        rbtnItalia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnItaliaActionPerformed(evt);
            }
        });

        rbtnRio.setText("Rio 2");
        rbtnRio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRioActionPerformed(evt);
            }
        });

        rbtnX.setText("X-MEN");
        rbtnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnXActionPerformed(evt);
            }
        });

        jLabel1.setText("Adultos regulares");

        jLabel2.setText("Adultos mayores");

        jLabel3.setText("Niños");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Número de entradas");

        txtAdultoRegular.setText("0");
        txtAdultoRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdultoRegularActionPerformed(evt);
            }
        });

        txtAdultoMayor.setText("0");
        txtAdultoMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdultoMayorActionPerformed(evt);
            }
        });

        txtninnos.setText("0");
        txtninnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtninnosActionPerformed(evt);
            }
        });

        jLabel5.setText("(Total máximo: 4)");

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        btnMostrarAsientos.setText("Ver asientos");
        btnMostrarAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAsientosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Peliculas disponibles");

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel7.setText("1        2         3         4         5         6        7         8        ");

        jLabel8.setText("A");
        jLabel8.setMinimumSize(new java.awt.Dimension(8, 20));

        jLabel9.setText("B");

        jLabel10.setText("C");

        jLabel11.setText("D");

        jLabel12.setText("E");

        jLabel13.setText("F");

        jLabel15.setText("H");

        jLabel16.setText("G");

        jButton2.setText("vaciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnSelecionarAsientos.setText("Seleccionar asientos");
        btnSelecionarAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarAsientosActionPerformed(evt);
            }
        });

        jLabel17.setText("I");

        jLabel18.setText("J");

        btnVolver.setBackground(new java.awt.Color(255, 102, 102));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAdultoMayor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtninnos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addComponent(btnSelecionarAsientos)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAdultoRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnItalia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtnRio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtnX, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnMostrarAsientos)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(btnComprar))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jLabel15)
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18)
                                        .addGap(6, 6, 6))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarAsientos)
                            .addComponent(jButton2)
                            .addComponent(btnComprar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(rbtnX))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addComponent(rbtnItalia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnRio)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdultoRegular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdultoMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtninnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addComponent(btnSelecionarAsientos)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnItaliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnItaliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnItaliaActionPerformed

    private void rbtnRioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnRioActionPerformed

    private void rbtnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnXActionPerformed

    private void txtAdultoRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdultoRegularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdultoRegularActionPerformed

    private void txtAdultoMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdultoMayorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdultoMayorActionPerformed

    private void txtninnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtninnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtninnosActionPerformed

    private void btnMostrarAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAsientosActionPerformed
        
        int numeroSala=1;
        if(rbtnItalia.isSelected()){
            numeroSala=0;
        }
        if(rbtnRio.isSelected()){
            numeroSala=1;
        }
        if(rbtnX.isSelected()){
            numeroSala=2;
        }
        txtResultado.setText(cine.mostrarAsientos(numeroSala));
    }//GEN-LAST:event_btnMostrarAsientosActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        this.dispose();
        FrmCobro fc= new FrmCobro();
        fc.setVisible(true);
        fc.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnComprarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtResultado.setText(" ");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSelecionarAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarAsientosActionPerformed
        int numeroSala=0;
        if(rbtnItalia.isSelected()){
            numeroSala=0;
        }
        if(rbtnRio.isSelected()){
            numeroSala=1;
        }
        if(rbtnX.isSelected()){
            numeroSala=2;
        }
        char [] asientos;
        char temp;
        char si =' ';
        int no = 0;
        int suma = 0;
        int entradasRegulares = Integer.parseInt(txtAdultoRegular.getText());
        int entradasMayores = Integer.parseInt(txtAdultoMayor.getText());
        int entradasNinnos = Integer.parseInt(txtninnos.getText());
        suma = entradasRegulares+entradasMayores+entradasNinnos;
        int j=0;
        if(suma<5){
            
            
        for(j=0;j<suma;j++){
            if(contador>=4){
            JOptionPane.showMessageDialog(this, "Limite de entradas alcanzado");
            break;
            }
        String mensaje;
        mensaje = JOptionPane.showInputDialog("Ingrese el asiento");
        asientos= mensaje.toCharArray();
        si = asientos[0];
        temp = asientos[1];
        no = Character.getNumericValue(temp);
        if(cine.reservarAsientoTemporal(si, no, numeroSala)==true){
            cine.reservarAsientoTemporal(si, no, numeroSala);
            cine.mostrarAsientos(numeroSala);
            JOptionPane.showMessageDialog(this, "Asiento Reservado con exito");
        }
        else{
            JOptionPane.showMessageDialog(this, "Asiento no disponible");
        }
            
            contador++;
            if(contador>=4){
            JOptionPane.showMessageDialog(this, "Limite de entradas alcanzado");
            break;
        }
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Numero de entradas maximo excedido");
        }
        
        

    }//GEN-LAST:event_btnSelecionarAsientosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        FrmCliente adm = new FrmCliente();
        adm.setVisible(true);
        adm.setLocationRelativeTo(this);
        adm.setCine(cine);
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnMostrarAsientos;
    private javax.swing.JButton btnSelecionarAsientos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnItalia;
    private javax.swing.JRadioButton rbtnRio;
    private javax.swing.JRadioButton rbtnX;
    private javax.swing.JTextField txtAdultoMayor;
    private javax.swing.JTextField txtAdultoRegular;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtninnos;
    // End of variables declaration//GEN-END:variables

    void setCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

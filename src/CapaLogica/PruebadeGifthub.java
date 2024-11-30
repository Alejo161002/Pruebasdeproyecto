/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CapaLogica;
import capaLogica.Cine;
import CapaGrafica.FrmAdministrador;
import CapaGrafica.FrmCliente;

/**
 *
 * @author Ale
 */
public class PruebadeGifthub {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cine cn = new Cine();
        cn.construirAsientos();
        cn.peliculas();
        FrmAdministrador adm = new FrmAdministrador();
        adm.setVisible(true);
        adm.setLocationRelativeTo(null);
        adm.setCine(cn);
    }
    
}

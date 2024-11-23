    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra.capaLogica;

/**
 *
 * @author sebas
 */
public class Cliente {
    private String nombreCliente;
    private int numeroReservacion;
    private String tipoTarjeta;
    private String numeroTarjeta;
    private String fechaVencimiento;
    private int codigoSeguridad;
    private double totalPagado;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }
    
    
    
}



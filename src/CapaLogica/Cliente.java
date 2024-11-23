
package CapaLogica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;


public class Cliente {
    private static int contadorReservaciones=1000;
    private String nombreCliente;
    private int numeroReservacion;
    private String tipoTarjeta;
    private String numeroTarjeta;
    private LocalDate fechaVencimiento;
    private String codigoSeguridad;
    private double totalPagado;
    
    public Cliente(String nombre, String tipoTarjeta, String numeroTarjeta , String fechaVencimiento, String codigoSeguridad){
        this.nombreCliente= nombre;
        this.numeroReservacion = contadorReservaciones++;
        this.tipoTarjeta= tipoTarjeta;
        this.numeroTarjeta=numeroTarjeta;
        this.fechaVencimiento = LocalDate.parse(fechaVencimiento, DateTimeFormatter.ofPattern("MM/yyyy"));
        this.codigoSeguridad = codigoSeguridad;
        this.totalPagado = 0.0;
        validarDatos();
        
}
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

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }
    
    private void validarDatos(){
        validarTipoTarjeta();
        validarFechaVencimiento();
        validarCodigoSeguridad();
        validarNumeroTarjeta();
    }
    
    private void validarTipoTarjeta(){
        if(!tipoTarjeta.equals("Visa")&& !tipoTarjeta.equals("MasterCard")){
            throw new IllegalArgumentException("Tipo de tarjeta no valido.Unicamente se acepta Visa o MasterCard.");
        }
    }
    
    private void validarFechaVencimiento(){
        if(fechaVencimiento.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("LA fecha de venbcimiento debe ser posterior a la fecha actual.");
    
    }
    }
    
    private void validarCodigoSeguridad(){
    if(codigoSeguridad.length() != 3||
            !codigoSeguridad.matches("\\d{3}")){
            throw new IllegalArgumentException("El codigo de seguridad debe ser un numero de 3 digitos.");
        }
    }

private void validarNumeroTarjeta() {
    String Visa = "^4[0-9]{15}$"; 
    String MasterCard = "^(5[1-5][0-9]{14})$"; 

    if (tipoTarjeta.equals("Visa")) {
        if (!Pattern.matches(Visa,numeroTarjeta)) {
            throw new IllegalArgumentException("Numero Visa Invalido");
        }
    } else if (tipoTarjeta.equals("Master Card")) {
        if (!Pattern.matches(MasterCard, numeroTarjeta)) {
            throw new IllegalArgumentException("Numero de tarjeta MasterCard Invalido");
        }
    }

    if (!validarAlgoritmoLunh(numeroTarjeta)) {
        throw new IllegalArgumentException("Numero de tarjeta invalido segun el algoritmo de Luhn.");
    }
}
    
    private boolean validarAlgoritmoLunh(String numero) {
    int suma = 0;
    boolean alternar = false;
    
    for (int i= numero.length() - 1; i>=0; i--){
    int n = Character.getNumericValue(numero.charAt(i));
    if (alternar) {
        n *=2;
        if (n>9)n -=9;
    }
    suma += n;
    alternar = !alternar;
    }
    return suma % 10==0;
}
    
    public void realizarPago(double monto){
        totalPagado += monto;
    }
    
    @Override
    public String toString(){
        return "Cliente{" +
                "nombre='" + nombreCliente + '\'' +
                ", numeroReservacion=" + numeroReservacion +
                ", tipoTarjeta='" + tipoTarjeta + '\'' +
                ", totalPagado=" + totalPagado +
                '}';
    }
    
    public static void main(String[] args){
        try {
            Cliente cliente1 = new Cliente(
                    "Juan Pérez",
                    "Visa",
                    "4552720412345678",
                    "12/2025",
                    "123"
            );
            System.out.println(cliente1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear el cliente: " + e.getMessage());
        }
    }
}



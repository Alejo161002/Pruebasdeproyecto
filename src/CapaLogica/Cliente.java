
package CapaLogica;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;



public class Cliente {
    public static int contadorReservaciones=1000;
    private int numeroReservacion;
    private String tipoTarjeta;
    private String numeroTarjeta;
    private YearMonth fechaVencimiento;
    private String codigoSeguridad;
    private double totalPagado;
    
    public Cliente(String tipoTarjeta, String numeroTarjeta, String fechaVencimiento, String codigoSeguridad){
        this.numeroReservacion = contadorReservaciones++;
        this.tipoTarjeta= tipoTarjeta;
        this.numeroTarjeta=numeroTarjeta;
        this.fechaVencimiento = YearMonth.parse(fechaVencimiento, DateTimeFormatter.ofPattern("MM-yyyy"));
        this.codigoSeguridad = codigoSeguridad;
        this.totalPagado = 0.0;
        validarDatos();
        
}
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }


    public YearMonth    getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }
    
    private void validarDatos(){
        validarTipoTarjeta();
        validarCodigoSeguridad();
        validarNumeroTarjeta();
    }
    
    public void validarTipoTarjeta(){
        if(!tipoTarjeta.equals("Visa")&& !tipoTarjeta.equals("MasterCard")){
            throw new IllegalArgumentException("Tipo de tarjeta no valido.Unicamente se acepta Visa o MasterCard.");
        }
    }
    
    
    public void validarCodigoSeguridad(){
    if(codigoSeguridad.length() != 3||
            !codigoSeguridad.matches("\\d{3}")){
            throw new IllegalArgumentException("El codigo de seguridad debe ser un numero de 3 digitos.");
        }
    }
    
public void validarNumeroTarjeta() {
    String Visa = "^4[0-9]{15}$"; 
    String MasterCard = "^(5[1-5][0-9]{14})$"; 

    if (tipoTarjeta.equals("Visa")) {
        if (!Pattern.matches(Visa,numeroTarjeta)) {
            throw new IllegalArgumentException("Numero Visa Invalido");
        }
    } else if (tipoTarjeta.equals("MasterCard")) {
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
}
    


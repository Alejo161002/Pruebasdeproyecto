/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

/**
 *
 * @author sebas
 */
public class Administrador {
    public static int contadorDeIntentos=0;
    public static int ingreso;
    
    public boolean validarContrasena(String contrasena){
        boolean estado = false;
       
        if(contrasena.matches("([0-9]{4})")){
            estado = true;
        }
        else{
            estado =  false;
        }
        
        String [] numeros = contrasena.split("");
        for(int i = 1;i<4;i++){
            int numero = Integer.parseInt(numeros[i]);
            int anterior = Integer.parseInt(numeros[i-1]);
            
            
            if(numero/2 == anterior){
                estado = true;
            }
            else if((numero+10)/2 == anterior){
                estado = true;
            }
            else{
                estado = false;
            }
        }
        
        
        return estado;
    }
}

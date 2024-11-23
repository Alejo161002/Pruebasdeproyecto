/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

/**
 *
 * @author sebas
 */
public class Cine {

    private String[] pelicula = new String [3];
    private int filas = 11;
    private int columnas = 9;
    private int profundidad = 3;
    private String[][][] salas = new String[filas][columnas][profundidad];
    
    
    public static final int CLIENTE_REGULAR = 2800;
    public static final int ADULTO_MAYOR = 2300;
    public static final int NINNOS = 2000;

    public void peliculas() {
        pelicula[0] = "Italia 90";
        pelicula[1] = "Rio 2";
        pelicula[2] = "X-MEN";
    }
    public String vaciarSalas(){
        String hilera ="";
        for (int i = 0; i < profundidad; i++) {
            for (int j= 0; j < columnas; j++) {
                for (int k = 0; k < filas; k++) {
                    if(j==0){
                        if(k==0){
                            hilera += salas[k][j][i] = "     ";
                        }if(k!=10){
                        hilera += salas[k][j][i] = (k+1)+"    ";
                        }
                    }else{
                    hilera += salas [k][j][i] = " &  ";
                    }
                }
                hilera += "\n";
            }
            hilera += "\n";
        }
        return hilera;
    }

    public String validacionAsientos(int fila, int columna, int sala) {
        String asientoDisponible = "cliente";
        if (salas[fila][columna][sala] == null) {
            salas[fila][columna][sala] = asientoDisponible;
            return "Asiento reservado";
        }else{
            return "asiento ocupado";
        }
    }
    public String imprimirCartelera(){
        String hilera = "Peliculas:\t"+pelicula[0]+"\t"+pelicula[1]+"\t"+pelicula[2]+"\n"+
                "Cliente regular: ₡"+CLIENTE_REGULAR+"\t₡"+CLIENTE_REGULAR+"\t₡"+CLIENTE_REGULAR+
                "\nAdulto mayor:  ₡"+ADULTO_MAYOR+"\t₡"+ADULTO_MAYOR+"\t₡"+ADULTO_MAYOR+"\n"+
                "Niños:\t₡"+NINNOS+"\t₡"+NINNOS+"\t₡"+NINNOS;
        return hilera;
    }
}

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
    private int filas = 10;
    private int columnas = 8;
    private int profundidad = 3;
    private String[][][] salas = new String[filas][columnas][profundidad];
    private int numeroSala = 0;
    
    
    public static final int CLIENTE_REGULAR = 2800;
    public static final int ADULTO_MAYOR = 2300;
    public static final int NINNOS = 2000;

    public void peliculas(int numeroSala) {
        pelicula[0] = "Italia 90";
        pelicula[1] = "Rio 2";
        pelicula[2] = "X-MEN";
        this.numeroSala = numeroSala;
    }
    public String vaciarSalas(){
        String hilera ="";
        for (int i = 0; i<profundidad;i++){
            if(i==0){
            for (int j= 0; j < columnas; j++) {
                for (int k = 0; k < filas; k++) {
                    
                            hilera += salas [k][j][this.numeroSala] = " &   ";
                        }
                hilera += "\n\n";
                    }
                }
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
    public String compraDeEntradas(int numeroSala,int numerodeEntradas
            ,String filaAsiento, int columnaAsiento){
        int fila = 0;
        String mensaje ="";
        for(int i=0 ; i<numerodeEntradas;i++){
            switch (filaAsiento) {
                case "a","A"-> {
                    fila = 1;
                }
                case "b","B"-> {
                    fila = 2;
                }
                case "c","C"-> {
                    fila = 3;
                }
                case "d","D"-> {
                    fila = 4;
                }
                case "e","E"-> {
                    fila = 5;
                }
                case "f","F"-> {
                    fila = 6;
                }
                case "g","G"-> {
                    fila = 7;
                }
                case "h","H"-> {
                    fila = 8;
                }
                case "i","I"-> {
                    fila = 9;
                }
                case "j","J"-> {
                    fila = 10;
                }
                default -> mensaje = "Asiento no valido";
            }
            salas[fila][columnaAsiento][numeroSala] = "X";
            mensaje += "asiento"+filaAsiento+columnaAsiento;
        }
        
        return mensaje;
    }
}

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
    public String[][][] salas; //= new String[filas][columnas][profundidad];
    private int numeroSala;
    public static  int contador = 0;
    
    
    public static final int CLIENTE_REGULAR = 2800;
    public static final int ADULTO_MAYOR = 2300;
    public static final int NINNOS = 2000;
    
    public Cine(){
        salas = new String[filas][columnas][profundidad];
    }
    public void peliculas(int numeroSala) {
        pelicula[0] = "Italia 90";
        pelicula[1] = "Rio 2";
        pelicula[2] = "X-Men";
        this.numeroSala = numeroSala;
    }
    public void cambiarCartelera(String nombrePelicula, int sala){
        pelicula[sala-1] = nombrePelicula;
    }
//    public String vaciarSalas(){
//        String hilera ="";
//        for (int i = 0; i<profundidad;i++){
//            if(i==0){
//            for (int j= 0; j < columnas; j++) {
//                for (int k = 0; k < filas; k++) {
//                    if(k==0){
//                        hilera += salas [k][j][this.numeroSala] = "&";
//                    }
//                    else{
//                            hilera += salas [k][j][this.numeroSala] = "        &";
//                    }
//                        }
//                if(j<7){
//                hilera += "\n\n";
//                }
//                    }
//                }
//        }
//        return hilera;
//    }
//
//    public String validacionAsientos(int fila, int columna, int sala) {
//        String asientoDisponible = "cliente";
//        if (salas[fila][columna][sala] == null) {
//            salas[fila][columna][sala] = asientoDisponible;
//            return "Asiento reservado";
//        }else{
//            return "asiento ocupado";
//        }
//    }
    public String imprimirCartelera(){
        String hilera = "Peliculas:\t"+pelicula[0]+"\t"+pelicula[1]+"\t"+pelicula[2]+"\n"+
                "Cliente regular: ₡"+CLIENTE_REGULAR+"\t₡"+CLIENTE_REGULAR+"\t₡"+CLIENTE_REGULAR+
                "\nAdulto mayor:  ₡"+ADULTO_MAYOR+"\t₡"+ADULTO_MAYOR+"\t₡"+ADULTO_MAYOR+"\n"+
                "Niños:\t₡"+NINNOS+"\t₡"+NINNOS+"\t₡"+NINNOS;
        return hilera;
    }
    public void construirAsientos() {
        for (int i = 0; i < profundidad; i++) {
            for (int j = 0; j < filas; j++) {
                for (int k = 0; k < columnas; k++) {
                salas[j][k][i] = "L        "; 
                }
            }
        }
    }
    public int numeroAsientosReservados(int sala) {
        sala = sala-1;
        int contador = 0;
            for (int i=0;i<filas;i++){
                for(int j=0;j<columnas;j++){
                    if (salas[i][j][sala] == "#        ") {
                    contador++; 
                    }
                }
            }
        return contador;
    }
    public boolean reservarAsientoTemporal(int filaAsiento, int columna,int sala) {
        int fila = 0;
        boolean mensaje = true;
            switch (filaAsiento) {
                case 'a','A'-> {
                    fila = 0;
                }
                case 'b','B'-> {
                    fila = 1;
                }
                case 'c','C'-> {
                    fila = 2;
                }
                case 'd','D'-> {
                    fila = 3;
                }
                case 'e','E'-> {
                    fila = 4;
                }
                case 'f','F'-> {
                    fila = 5;
                }
                case 'g','G'-> {
                    fila = 6;
                }
                case 'h','H'-> {
                    fila = 7;
                }
                case 'i','I'-> {
                    fila = 8;
                }
                case 'j','J'-> {
                    fila = 9;
                }
                default -> mensaje = false;
            }
            columna = columna-1;
        if (salas[fila][columna][sala] == "L        " && mensaje==true && columna<8 ) {
            salas[fila][columna][sala] = "#        ";
            return true;
        } else {
            return false; 
        }
    }
    public String mostrarAsientos(int sala) {
        StringBuilder asientos = new StringBuilder();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asientos.append(salas[i][j][sala]).append(" ");
            }
            if(i<filas-1){
            asientos.append("\n\n");
            }
        }
        return asientos.toString();
    }
}


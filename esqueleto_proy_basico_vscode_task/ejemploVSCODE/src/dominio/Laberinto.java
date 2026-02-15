package dominio;

public class Laberinto {
    public static boolean Salida(char[][] laberinto, int fila, int columna) {


        if (fila < 0 || columna < 0 || fila >= laberinto.length || columna >= laberinto[0].length){
            return false;
        }
        //muro 
        if (laberinto[fila][columna] == 'm'){
            return false;
        }
        //salida encontrada
        if (laberinto[fila][columna] == 's'){
            return true;
        }
        //visto
        laberinto[fila][columna] = 'v';

        
        if (Salida(laberinto, fila + 1, columna)){
             return true;
        }
        if (Salida(laberinto, fila - 1, columna)) {
            return true;
        }
        if (Salida(laberinto, fila, columna + 1)) {
            return true;
        }
        if (Salida(laberinto, fila, columna - 1)){ 
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        char[][] laberinto = {
            {' ', ' ', 'v'}, {'m', ' ', 'v'},{' ', ' ', 's'}
        };
        System.out.println(Salida(laberinto, 0, 0));
    }
}

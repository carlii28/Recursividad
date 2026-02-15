package dominio;

public class Recursividad {
    public static int contar(int numero, int digito){
        if(numero == 0 ){
            return 0;
        }
        int contador = contar(numero / 10,digito);
        if(numero % 10 == digito){
        contador ++; 
        }
        return contador++;
    }
    public static void main(String[] args){
        int numero = 00112233;
        int digito = 2;
        int resultado = Recursividad.contar(numero,digito);
    System.out.println("Aparece" + resultado + "veces");
    }

}


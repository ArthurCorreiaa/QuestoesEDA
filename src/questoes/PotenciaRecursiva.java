package questoes;

import java.util.Scanner;

public class PotenciaRecursiva {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        String pot = sc.nextLine();

        System.out.println(calculaPotencia(Integer.parseInt(n), Integer.parseInt(pot), 1, Integer.parseInt(n)));
        
    }

    public static int calculaPotencia(int numero, int potencia, int i, int resultado) {
        if (potencia == 0) {
            return 1;
        }
        
        if (i != potencia) {
            return calculaPotencia(numero, potencia, i+1, (resultado * numero));
        }
        return resultado;
    }

}

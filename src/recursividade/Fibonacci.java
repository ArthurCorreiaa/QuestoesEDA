package recursividade;

import java.util.*;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nTermo = sc.nextLine();

        System.out.println(geraSequencia(0, 1, 0, Integer.parseInt(nTermo)-1));
        
    }


    public static int geraSequencia(int n1, int n2, int contador, int limite) {
        if (limite == -1) {
            return 0;
        }

        if (contador == limite) {
            return n2;
        }

        return geraSequencia(n2, n1 + n2, contador+1, limite);
    }

}

package questoes;

import java.util.*;

public class BuscaBinaria {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");  
        String numBuscado = sc.nextLine();

        int[] sequencia = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            sequencia[i] = Integer.parseInt(entrada[i]);
        }

        System.out.println(encontraElemento(sequencia, Integer.parseInt(numBuscado), 0, sequencia.length-1));
    }

    public static int encontraElemento(int[] seq, int buscado, int inicio, int fim) {
        int meio = (inicio + fim) / 2;
        
        if (inicio > fim) {
            return -1;
        }

        if (seq[meio] == buscado) {
            return meio;
        }
        
        System.out.println(meio);

        if (buscado < seq[meio]) {
            return encontraElemento(seq, buscado, inicio, meio - 1);
        }
        return encontraElemento(seq, buscado, meio + 1, fim);
    }
}

package recursividade;

import java.util.*;

public class BuscaLinear {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");  
        String numBuscado = sc.nextLine();

        int[] sequencia = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            sequencia[i] = Integer.parseInt(entrada[i]);
        }

        System.out.println(buscaElemento(sequencia, Integer.parseInt(numBuscado), 0));

    }

    public static int buscaElemento(int[] seq, int elemento, int i) {
        if (i == seq.length) {
            return -1;
        }

        if (seq[i] == elemento) {
            return i;
        }
        
        return buscaElemento(seq, elemento, i+1);
    }


}

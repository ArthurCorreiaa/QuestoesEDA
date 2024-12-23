package questoes;

import java.util.*;

public class TrocaVizinhos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int[] sequenciaInteiros = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            sequenciaInteiros[i] = Integer.parseInt(entrada[i]);
        }

        trocaVizinhos(sequenciaInteiros);
        System.out.println(Arrays.toString(sequenciaInteiros));
    }

    private static void trocaVizinhos(int[] seq) {
        for (int i = 0; i < seq.length - 1; i++ ) {
            int aux = seq[i];
            seq[i] = seq[i + 1];
            seq[i + 1] = aux;    
        }
    }
}

package questoes;

import java.util.*;

public class VerificacaoElementosDuplicados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int[] sequeciaNumerica = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            sequeciaNumerica[i] = Integer.parseInt(entrada[i]);
        } 

        System.out.println(verificaElementos(sequeciaNumerica));    
    }

    private static boolean verificaElementos(int[] seq) {
        for (int i = 0; i < seq.length - 1; i++) {
            for (int j = i + 1; j < seq.length; j++) {
                if (seq[i] == seq[j]) return true;
            }
        }
        return false;
    }
}
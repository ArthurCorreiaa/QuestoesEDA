package questoes;

import java.util.Scanner;

/*
 * Não consigo encontrar o tst da questão. Testes feitos são apenas manuais.
 */

public class MultiplicaNElementosSeq {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        String num = sc.nextLine();

        String[] entrada = sc.nextLine().split(" ");
        int[] sequenciaNums = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            sequenciaNums[i] = Integer.parseInt(entrada[i]);
        }
        
        sequenciaNums = multiplicador(sequenciaNums, Integer.parseInt(num));
        for (int i = 0; i < sequenciaNums.length; i++) {
            if (i == sequenciaNums.length-1) {
                System.out.println(sequenciaNums[i]);
            } else {
                System.out.print(sequenciaNums[i] + " ");
            }
        }
    }

    private static int[] multiplicador(int[] seq, int n) {
        for (int i = 0; i < seq.length; i++) {
            seq[i] *= n;
        }
        return seq;
    }
}
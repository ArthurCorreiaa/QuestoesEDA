package questoes;

import java.util.Scanner;

public class MultiplicaNPorElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        String[] entrada = sc.nextLine().split(" ");
        int[] sequencia = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            sequencia[i] = Integer.parseInt(entrada[i]);
        }

        sequencia = mutiplicador(sequencia, Integer.parseInt(num));
        for (int i = 0; i < sequencia.length; i++) {
            if (i != sequencia.length-1) {
                System.out.print(sequencia[i] + " ");
            } else {
                System.out.println(sequencia[i]);
            }
        }
    }

    public static int[] mutiplicador(int[] seq, int multi) {
        for (int i = 0; i < seq.length; i++) {
            seq[i] *= multi;
        }
        return seq;
    }
}

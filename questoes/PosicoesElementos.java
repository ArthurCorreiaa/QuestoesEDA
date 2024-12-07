package questoes;

import java.util.*;

public class PosicoesElementos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        String[] entrada = sc.nextLine().split(" ");
        int[] sequenciaNums = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            sequenciaNums[i] = Integer.parseInt(entrada[i]);
        }

        List<Integer> posicoes = verificaPosicoes(sequenciaNums, Integer.parseInt(num));
        for (int i = 0; i < posicoes.size(); i++) {
            if (i == posicoes.size()-1) {
                System.out.println(posicoes.get(i));
            } else {
                System.out.print(posicoes.get(i) + " ");
            }
        }
    }

    public static List<Integer> verificaPosicoes(int[] seq, int numConferido) {
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == numConferido) {
                pos.add(i);
            }
        }
        if (pos.size() == 0) {
            pos.add(-1);
        }
        return pos;
    }


}

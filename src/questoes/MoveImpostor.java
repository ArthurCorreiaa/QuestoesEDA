package questoes;

import java.util.*;

public class MoveImpostor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int[] entradaInteiros = new int[entrada.length];
        for (int i = 0; i < entradaInteiros.length; i++) {
            entradaInteiros[i] = Integer.parseInt(entrada[i]);
        }

        moveImpostor(entradaInteiros);
        System.out.println(Arrays.toString(entradaInteiros));
    }
    

    private static void moveImpostor(int[] seq) {
        int iImpostor = 0;
        for (int i = 0; i < seq.length - 1; i++) {
            if (seq[i] > seq[i + 1]) {
                iImpostor = i+1;
                break;
            }
        }

        int contador = 0;
        // Procurando o indice a partir de onde as trocas deves ser feitas
        while (contador < iImpostor) {
            if (seq[contador] > seq[iImpostor]) {
                swap(seq, contador, iImpostor);
            }
            contador++;
        }
    }

    private static void swap(int[] seq, int i, int iTrocaFixo) {
        int aux = seq[iTrocaFixo];
        seq[iTrocaFixo] = seq[i];
        seq[i] = aux;
    }
}

package recursividade;

import java.util.Scanner;

public class FrequenciaElementoSequenciaRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num = sc.nextLine();
        
        String[] sequencia = sc.nextLine().split(" ");
        int[] numeros = new int[sequencia.length];
        for (int i = 0; i < sequencia.length; i++) {
            numeros[i] = Integer.parseInt(sequencia[i]);
        }

        System.out.println(confereFrequencia(numeros, Integer.parseInt(num), 0, 0));
    }

    public static int confereFrequencia(int[] seq, int numeroBuscado, int contaFrequencia, int indice) {
        if (indice == seq.length) {
            return contaFrequencia;
        }

        if (seq[indice] == numeroBuscado){
            return confereFrequencia(seq, numeroBuscado, ++contaFrequencia, ++indice);
        } else {
            return confereFrequencia(seq, numeroBuscado, contaFrequencia, ++indice);
        }
    }


}

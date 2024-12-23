package questoes;

import java.util.*;

public class FrequenciaElementoSequencia {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num = sc.nextLine();
        
        String[] sequencia = sc.nextLine().split(" ");
        int[] numeros = new int[sequencia.length];
        for (int i = 0; i < sequencia.length; i++) {
            numeros[i] = Integer.parseInt(sequencia[i]);
        }

        System.out.println(confereFrequencia(numeros, Integer.parseInt(num)));
    }


    private static int confereFrequencia(int[] seq, int numBuscado) {
        int contaFrequencia = 0;
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == numBuscado) {
                contaFrequencia++;
            }
        }
        return contaFrequencia;
    }
}

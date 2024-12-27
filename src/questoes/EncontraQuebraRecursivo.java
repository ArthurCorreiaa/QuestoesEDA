package questoes;

import java.util.*;

public class EncontraQuebraRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");  

        int[] sequencia = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            sequencia[i] = Integer.parseInt(entrada[i]);
        }

        System.out.println(EncontraQuebra(sequencia, 1));
    }

    public static int EncontraQuebra(int[] seq, int i) {
        if (i == seq.length){
            return -1;
        }
        
        if (seq[i-1] > seq[i]) {
            return i;
        }

        return EncontraQuebra(seq, i+1);
    }
}

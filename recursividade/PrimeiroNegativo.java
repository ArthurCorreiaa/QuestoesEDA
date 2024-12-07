package recursividade;

import java.util.*;

public class PrimeiroNegativo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");  
        

        System.out.println(encontraNegativo(entrada, 0));
    }

    public static String encontraNegativo(String[] seq, int i) {
        if (i >= seq.length) {
            return "-";
        }

        if (Integer.parseInt(seq[i]) < 0) {
            return seq[i];
        }
         
        return encontraNegativo(seq, i+1);
    }
}

package questoes;

import java.util.*;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nTermo = sc.nextLine();

        System.out.println(fibonacci(Integer.parseInt(nTermo)));
        
    }


    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}

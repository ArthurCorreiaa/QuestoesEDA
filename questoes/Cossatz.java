package questoes;
import java.util.*;

public class Cossatz {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String primeiro = sc.nextLine();
        String segundo = sc.nextLine();

        System.out.println(geraSequencia(Integer.parseInt(primeiro), Integer.parseInt(segundo) ));
    }

    public static int geraSequencia(int inicio, int fim) {
        int contaSequencia;
        int maior = 1;
        for (int i = inicio; i <= fim; i++) {
            contaSequencia = 1;
            int x = i;
            while (x != 1) {
                if (x % 2 == 0) {
                    x /= 2;
                } else { 
                    x = x * 3 + 1;
                }
                contaSequencia += 1;
            }    

            if (contaSequencia > maior) {
                maior = contaSequencia;
            }
        }
        return maior;
    }
}
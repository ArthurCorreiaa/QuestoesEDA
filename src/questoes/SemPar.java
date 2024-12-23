package questoes;

import java.util.*;

public class SemPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int[] sequenciaInteiros = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            sequenciaInteiros[i] = Integer.parseInt(entrada[i]);
        }
        
        semPar(sequenciaInteiros);
    }

    private static void semPar(int[] seq) {
        Map<Integer, Integer> mapa = geraMapaDeFrequencia(seq);
        
        for (Integer chave: mapa.keySet()) {
            if (mapa.get(chave) == 1) {
                System.out.println(chave);
                break;
            }
        }
    }
    
    private static Map<Integer, Integer> geraMapaDeFrequencia(int[] seq) {
        Map<Integer, Integer> mapeiaFrequencia = new HashMap<>();
        for (int i = 0; i < seq.length; i++) {
            if (!mapeiaFrequencia.containsKey(seq[i])) {
                mapeiaFrequencia.put(seq[i], 1);
            } else {
                mapeiaFrequencia.replace(seq[i], mapeiaFrequencia.get(seq[i]) + 1);
            }
        }
        return mapeiaFrequencia;
    }

}

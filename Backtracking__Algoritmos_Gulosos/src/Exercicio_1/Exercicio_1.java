package Exercicio_1;

import java.util.ArrayList;
import java.util.List;

/*
Dado um conjunto S de elementos únicos, calcule todos os seus subconjuntos de n elementos.

Exemplos:

Entrada: S = [1, 2, 3], n = 2
Saída: [1, 2], [1, 3], [2, 3]

Entrada: S= [1, 2, 3, 4], n = 1
Saída: [1],[2], [3] e [4]
 */
public class Exercicio_1 {

    public static void main(String[] args) {
        List<Integer> S1 = List.of(1, 2, 3, 4,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13, 14 ,15);
        int n1 = 5;
        System.out.println("Entrada: " + S1 + ", n = " + n1);
        System.out.println("Saída: " + subconjuntos(S1, n1));

        List<Integer> S2 = List.of(1, 2, 3, 4,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13, 14 ,15);
        int n2 = 3;
        System.out.println("\nEntrada: " + S2 + ", n = " + n2);
        System.out.println("Saída: " + subconjuntos(S2, n2));
    }

    public static List<List<Integer>> subconjuntos(List<Integer> S, int n) {
        List<List<Integer>> resultados = new ArrayList<>();
        gerarSubconjuntos(S, n, 0, new ArrayList<>(), resultados);
        return resultados;
    }

    public static void gerarSubconjuntos(List<Integer> S, int n, int indice, List<Integer> subsetAtual, List<List<Integer>> resultados) {
        if (subsetAtual.size() == n) {
            resultados.add(new ArrayList<>(subsetAtual));
            return;
        }
        for (int i = indice; i < S.size(); i++) {
            subsetAtual.add(S.get(i));
            gerarSubconjuntos(S, n, i + 1, subsetAtual, resultados);
            subsetAtual.remove(subsetAtual.size() - 1);
        }
    }
}

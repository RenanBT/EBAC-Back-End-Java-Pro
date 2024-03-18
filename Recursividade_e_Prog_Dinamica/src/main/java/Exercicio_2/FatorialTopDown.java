package Exercicio_2;

/*
Problema: resolva o exercício 2 com programação dinâmica.
Crie um algoritmo com abordagem top down e outro com bottom up e explique as diferenças entre a solução do exercício 2 e a do exercício 3.

Exemplos:

Entrada: 3
Saída: 6

Entrada: 7
Saída: 5040

Consegue calcular o fatorial de um número acima de 100 com uma solução recursiva? Justifique sua
 */

import java.util.HashMap;

public class FatorialTopDown {

    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int calcularFatorial(int n) {


        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int resultado = n * calcularFatorial(n - 1);
        memo.put(n, resultado);

        return resultado;
    }

    public static void main(String[] args) {
        int numero = 5;
        int fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}


/*
Top-down (recursivo com memoização): Nesta abordagem, sempre que precisamos calcular o fatorial de um número, primeiro verificamos se já calculamos o fatorial
desse número antes. Se sim, retornamos o valor armazenado. Caso contrário, calculamos o fatorial e o armazenamos na tabela de memoização.
Isso evita recálculos de subproblemas já resolvidos.
 */


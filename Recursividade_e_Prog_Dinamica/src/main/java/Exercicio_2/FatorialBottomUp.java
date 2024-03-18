package Exercicio_2;

/*
Bottom-up (iterativo): Nesta abordagem, começamos calculando o fatorial de números menores e vamos subindo até o número desejado.
Armazenamos os resultados intermediários em uma tabela (ou array), de forma que possamos usar esses resultados para calcular o fatorial de números maiores.
Essa abordagem elimina a necessidade de recursão e é mais eficiente em termos de memória e tempo de execução.
 */

public class FatorialBottomUp {
        public static int calcularFatorial(int n) {


            int[] memo = new int[n + 1];
            memo[0] = 1;
            memo[1] = 1;

            for (int i = 2; i <= n; i++) {
                memo[i] = i * memo[i - 1];
            }

            return memo[n];
        }

        public static void main(String[] args) {
            int numero = 8;
            int fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }


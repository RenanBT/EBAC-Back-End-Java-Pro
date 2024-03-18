package Exercicio_1;

import java.math.BigInteger;

/*
Problema: crie um código que calcule o fatorial de um número

Exemplos:

Entrada: 3
Saída: 6

Entrada: 7
Saída: 5040

Consegue calcular o fatorial de um número acima de 100 com uma solução recursiva? Justifique sua resposta.
 */

public class Exercicio_1 {public static int calcularFatorial(int n) {

    Long resultado = 1L;
    for (int i = 1; i <= n; i++) {
        resultado *= i;
    }
    return Math.toIntExact(resultado);
}

    public static void main(String[] args) {
        int entrada = 3;
        int fatorial = calcularFatorial(entrada);
        System.out.println("O fatorial de " + entrada + " é: " + fatorial);

        int entrada2 = 7;
        int fatorial2 = calcularFatorial(entrada2);
        System.out.println("O fatorial de " + entrada2 + " é: " + fatorial2);



    }
}










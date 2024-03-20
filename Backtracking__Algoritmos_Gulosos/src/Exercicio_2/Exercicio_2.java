package Exercicio_2;

/*
Você tem que dar o troco de uma quantia em dinheiro usando o menor número possível de moedas.

Exemplos:

Entrada: Quantia 18, Moedas disponíveis 5, 2 e 1
Saída: 5 (três moedas de cinco, uma de 2 e uma de 1)
 */

import java.util.ArrayList;
import java.util.List;

public class Exercicio_2 {
    public static void main(String[] args) {


        int valorTotal = 18;
        int saida = 0;
        System.out.println("Troco para: " + valorTotal);

        List<Integer> moedas = new ArrayList<>();
        moedas.add(5);
        moedas.add(2);
        moedas.add(1);

        while(valorTotal >= moedas.get(0)){
            valorTotal -= moedas.get(0);
            saida ++;
        }
        while(valorTotal >= moedas.get(1)) {
            valorTotal -= moedas.get(1);
            saida++;
        }

        while(valorTotal >= moedas.get(2)) {
            valorTotal -= moedas.get(2);
            saida++;
        }


        System.out.println("Menor quantidade possível de moedas é: " + saida);

    }
}

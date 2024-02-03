package Projeto;



public class Main {
    public static void main(String[] args) {

        Exercicio1 pilha = new Exercicio1();

        pilha.push(2);
        pilha.push(4);
        pilha.push(6);
        pilha.push(8);
        pilha.push(10);
        pilha.push(11);
        pilha.push(13);

        pilha.pop();
        pilha.top();
        pilha.isEmpty();
    }
}
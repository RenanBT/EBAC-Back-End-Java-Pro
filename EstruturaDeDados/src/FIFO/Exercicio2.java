package FIFO;

import java.util.LinkedList;

//TODO: implemente uma classe que represente uma estrutura de dados de Fila (FIFO – first in, first out). Sua implementação
// aceitará somente inteiros e deverá conter os seguintes métodos:
// enqueue() → Adiciona um inteiro à fila.
// dequeue() → Remove um inteiro da fila.
// rear() → Retorna o inteiro que está no fim da fila.
// front() → Retorna o inteiro que está na frente da fila.
// size() → Retorna o tamanho da fila.
// isEmpty() → Retorna true ou false dependendo da fila estar vazia ou não.
public class Exercicio2 {

    private LinkedList<Integer> queue;

    public Exercicio2() {
        queue = new LinkedList<>();
    }


    public void enqueue(int number){
        queue.addLast(number);
    }

    public void dequeue(){
        queue.removeFirst();
    }

    public int rear(){

        return queue.getLast();
    }
    public int front(){
        return queue.getFirst();
    }

    public int size(){
        return queue.size();

    }

    public boolean isEmpty(){
        return queue.isEmpty();

    }

    public static void main(String[] args) {

        Exercicio2 fifo = new Exercicio2();
        fifo.enqueue(10);
        fifo.enqueue(11);
        fifo.enqueue(6);
        fifo.enqueue(31);
        fifo.enqueue(7);
        fifo.enqueue(8);

        System.out.println("Tamanho da fila: " + fifo.size());
        System.out.println("Último elemento da fila: " + fifo.rear());
        System.out.println("Primeiro elemento da fila:: " + fifo.front());

        System.out.println("Removendo um elemento da fila....");
        fifo.dequeue();

        System.out.println("Novo tamanho da fila: " + fifo.size());

        System.out.println("Fila está vazia?  " + fifo.isEmpty());



    }

}

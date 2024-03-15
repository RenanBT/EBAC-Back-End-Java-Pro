package Projeto;

//TODO:implemente uma classe que represente uma estrutura de dados de Pilha. Sua implementação aceitará somente inteiros e deverá conter os seguintes métodos:
// push() → Coloca um inteiro no topo da pilha.
// pop() → Remove o valor do topo da pilha e o retorna ao chamador.
// top() → Espia o inteiro que está no topo e o retorna sem mexer na pilha.
// isEmpty() → Retorna true ou false dependendo da pilha estar vazia ou não.
// size() → Retorna um valor inteiro com o número de elementos da pilha.


import java.util.EmptyStackException;

public class Exercicio1 {
    private int[] array;
    private int size;
    private int STANDARD_SIZE = 10;


    public Exercicio1(){
        this.array = new int[STANDARD_SIZE];
        this.size = 0;
    }

    public void push (int elemento){
        if (size == array.length){
            increaseCapacity();
        }
        array[size++] = elemento;
    }

    private void increaseCapacity() {
        int newSize = array.length + 1;
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return array[--size];
    }

    private int top() {
        return array[size];
    }

    private int size() {
        return array.length;
    }

    public boolean isEmpty() {
        return size ==0;
    }


    public static void main(String[] args) {

        Exercicio1 pilha = new Exercicio1();

        pilha.push(2);
        pilha.push(4);
        pilha.push(6);
        pilha.push(8);
        pilha.push(10);
        pilha.push(11);
        pilha.push(13);
        pilha.push(15);
        pilha.push(17);
        //pilha.push(19);
        //pilha.push(20);

        System.out.println("Número no topo da pilha: " + pilha.top());
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Removendo topo da pilha..." + pilha.pop());
        System.out.println("Novo número no topo da pilha" + pilha.top());
        System.out.println("Pilha está vazia? " + pilha.isEmpty());
    }




}

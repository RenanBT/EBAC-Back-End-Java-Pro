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
    private static final int STANDARD_SIZE = 10;


    public Exercicio1(){
        this.array = new int[STANDARD_SIZE];
        this.size = 0;
    }

    public void push (int elemento){
        if (size == array.length){
            increaeCapacity();
        }
        array[size++] = elemento;
    }

    private void increaeCapacity() {
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

    public boolean isEmpty() {
        return size ==0;
    }
}

package Projeto;
// 63 + 22
//TODO:implemente uma classe que represente uma estrutura de dados de Lista Encadeada. Sua implementação aceitará somente inteiros
// e deverá conter os seguintes métodos:
// void push(<Node> node) → Adiciona o nó ao fim da lista.
// <Node> pop() → Remove o nó no fim da lista e retorna o mesmo.
// void insert(int index, <Node> node) →
// Adiciona um nó na posição da lista indicada via parâmetro.
// void remove(int index) → Remove um nó na posição da lista indicada via parâmetro.
// <Node> elementAt(int index) → Retorna o elemento que está no índice da lista indicado via parâmetro.
// int size() → Retorna o tamanho da lista.
// void printList() → Retorna uma representação em texto da lista.

import java.util.LinkedList;

public class Exercicio3 {

    public class Node{
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public void push(Node node){
        if(head == null){
            head = node;
        } else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    // <Node> pop() → Remove o nó no fim da lista e retorna o mesmo.void insert(int index, <Node> node) →
    public Node pop() {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            Node temp = head;
            head = null;
            size--;
            return temp;
        } else {
            Node current = head;
            Node prev = null;
            while (current.next != null) {
                prev = current;
                current = current.next;
            }
            prev.next = null;
            size--;
            return current;
        }
    }
    public void insert(int index, Node node) {

        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    public void remove(int index) {

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            Node prev = null;
            for (int i = 0; i < index; i++) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
        }
        size--;
    }

    public Node elementAt(int index) {

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // Retorna o tamanho da lista
    public int size() {
        return size;
    }

    // Retorna uma representação em texto da lista
    public String printList() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" ");
            current = current.next;
        }
        return sb.toString();
    }



}

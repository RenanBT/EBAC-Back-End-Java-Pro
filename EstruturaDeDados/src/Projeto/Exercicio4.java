package Projeto;

//TODO: Usando como base suas implementações dos exercícios de 1 a 3, calcule a complexidade assintótica de tempo e de espaço das estruturas de dados que você criou. A complexidade de tempo deverá ser calculada para os métodos definidos abaixo:
// Pilha: métodos push e pop.
// Fila: métodos enqueue, dequeue, rear e front.
// Lista encadeada: métodos push, pop, insert, remove e elementAt.

//TODO:Justifique seus resultados, sua implementação pode diferir da definição padrão das estruturas de dados apresentadas no curso.
public class Exercicio4 {

    /*

     Pilha: métodos push e pop.

    PUSH e POP:

     Não é necessário percorrer a pilha apenas inserir ou remover um elemento da mesma, portanto independende do tamanho da pilha as complexidades seriam:
     complexidade de tempo total é O(1)
     complexidade de espaço é O(1).

    Fila: métodos enqueue, dequeue, rear e front.

    Em todos os casos:
    complexidade de tempo total é O(1)
    complexidade de espaço é O(1).

    Lista Encadeada:
    PUSH:

       complexidade de tempo O(n) onde n é o número de elementos na lista.

    Complexidade de Espaço:

    O método não aloca memória adicional além do nó fornecido e de algumas variáveis locais, então a  complexidade de espaço é O(1).

    POP:
    Se houver apenas um elemento na lista complexidade de tempo total é O(1)
    Caso contrário, o método precisa percorrer a lista até o penúltimo nó para remover o último nó. Isso requer percorrer a lista,
    o que é O(n) onde n é o número de elementos na lista.

    O método não aloca memória adicional além de algumas variáveis locais, então a complexidade de espaço é O(1).


    INSERT e REMOVE:

    Complexidade de Tempo:

    Se o índice de inserção for 0, o método simplesmente adiciona o novo nó no início da lista. Isso é feito em tempo constante O(1)O(1).
    Caso contrário, o método precisa percorrer a lista até o índice de inserção, o que requer percorrer a lista até index−1index−1 nós.
     Portanto, essa parte do algoritmo tem complexidade de tempo O(index).

      O método não aloca memória adicional além de algumas variáveis locais, então a complexidade de espaço é O(1).


    ELEMENT_AT:

    Neste caso tive dúvidas. Eu entendo que como o metodo recebe o index do elemento não seria necessário percorrer toda a lista,
    portanto ambas complexidades seriam O(1).



     */


}

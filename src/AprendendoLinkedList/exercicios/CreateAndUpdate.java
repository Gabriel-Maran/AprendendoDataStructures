package AprendendoLinkedList.exercicios;

import java.util.LinkedList;

public class CreateAndUpdate {
    public static void main(String[] args) {
        //Crie uma LinkedList de inteiros e adicione os elementos 5, 10, 15 e 20.
        //Adicione 25 no início da lista.
        //Insira 12 na terceira posição.
        //Adicione 30 no final.

        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.add(20);

        lista.addFirst(25);
        lista.add(2, 12);
        lista.addLast(30);
        System.out.println(lista);
    }
}

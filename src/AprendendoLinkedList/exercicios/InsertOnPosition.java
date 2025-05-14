package AprendendoLinkedList.exercicios;

import java.util.LinkedList;

public class InsertOnPosition {
    public static void main(String[] args) {
        //Escreva uma função que insira um elemento em uma posição específica da LinkedList.
        //Se a posição for maior que o tamanho da lista, lance uma exceção.
        LinkedList<String> lista = new LinkedList<String>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        insertNewElement(lista, "D", 2);
        System.out.println(lista);

    }

    public static LinkedList<String> insertNewElement(LinkedList<String> lista, String valueToInsert, int position) {
        if (position > lista.size() || position <= 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        lista.add(position - 1, valueToInsert);
        return lista;
    }
}

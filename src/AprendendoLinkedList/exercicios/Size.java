package AprendendoLinkedList.exercicios;

import java.util.LinkedList;

public class Size {
    public static void main(String[] args) {
        //Crie uma função que calcule o tamanho de uma LinkedList sem usar o função size().
        //Retorne o número de elementos.
        LinkedList<String> lista = new LinkedList<String>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        int sizeLinkList = sizeLinkedList(lista);
        System.out.println(sizeLinkList);
    }

    public static int sizeLinkedList(LinkedList<String> lista) {
        int count = 0;
        for (String s : lista) {
            count++;
        }
        return count;
    }
}

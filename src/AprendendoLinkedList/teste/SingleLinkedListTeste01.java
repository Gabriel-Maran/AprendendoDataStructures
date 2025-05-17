package AprendendoLinkedList.teste;

import AprendendoLinkedList.dominio.SingleLinkedList;
import AprendendoLinkedList.dominio.SingleNode;

import java.util.LinkedList;

public class SingleLinkedListTeste01 {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("------------------------");
        System.out.println("Lista: " + list);

    }
}

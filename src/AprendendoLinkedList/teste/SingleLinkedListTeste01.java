package AprendendoLinkedList.teste;

import AprendendoLinkedList.dominio.SingleLinkedList;
import AprendendoLinkedList.dominio.SingleNode;

import java.util.LinkedList;

public class SingleLinkedListTeste01 {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("------------------------");
        list.addAt(1, 500);
        System.out.println("Remove ultimo:\n " + list);
        System.out.println("Index 2: " + list.getValue(1));

    }
}

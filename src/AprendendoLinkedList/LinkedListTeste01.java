package AprendendoLinkedList;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.LinkedList;

public class LinkedListTeste01 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();
        lista.push("A");
        lista.push("B");
        lista.push("C");
        lista.push("D");
        lista.push("F");
        lista.pop();
        System.out.println(lista);

    }
}

package AprendendoLinkedList;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.LinkedList;

public class LinkedListTeste01 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        /*
        lista.push("A"); //Like a stack
        lista.push("B");
        lista.push("C");
        lista.push("D");
        lista.push("F");
        lista.pop();
         */
        linkedList.offer("A"); //Like a queue
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //lista.pop();

        linkedList.add(4, "E");
        linkedList.remove("A");

        linkedList.addFirst("1");
        linkedList.addFirst("0");
        linkedList.addLast("G");

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList);

    }
}

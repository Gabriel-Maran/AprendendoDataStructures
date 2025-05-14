package AprendendoLinkedList.exercicios;

import java.util.LinkedList;

public class Searching {
    public static void main(String[] args) {
        //Implemente uma função que receba uma LinkedList de números inteiros e um valor alvo.
        //Retorne true se o valor existir na lista, caso contrário, false.
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        boolean isNumberFiveOnLinkedList = isNumberOnLinkedList(lista, 5);
        System.out.println("O número 5 está na lista? "+isNumberFiveOnLinkedList);
        boolean isNumberSixOnLinkedList = isNumberOnLinkedList(lista, 6);
        System.out.println("O número 6 está na lista? "+isNumberSixOnLinkedList);
    }

    public static boolean isNumberOnLinkedList(LinkedList<Integer> lista, Integer target) {
        return lista.contains(target);
    }
}

package AprendendoLinkedList.exercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class FindMiddleElement {
    public static void main(String[] args) {
        //Dada uma LinkedList de números, encontre o elemento do meio sem calcular o tamanho total antecipadamente.
        //Se a lista tiver tamanho par, retorne o segundo elemento do meio.
        LinkedList<String> lista = new LinkedList<>();
            for(int i=1; i<=1000000; i++){
                lista.addFirst(""+i);
            }
        System.out.println(findMiddleElement(lista));
    }

    public static String findMiddleElement(LinkedList<String> lista) {
        Iterator<String> iteratorSkip1 = lista.listIterator();
        Iterator<String> iteratorSkip2 = lista.listIterator();
        String middle = "";
        while (iteratorSkip2.hasNext() && iteratorSkip1.hasNext()) {
            middle = iteratorSkip1.next();
            iteratorSkip2.next();
            if (iteratorSkip2.hasNext()) {
                iteratorSkip2.next();
            }else{
                break;
            }
        }
        return middle;
    }
}

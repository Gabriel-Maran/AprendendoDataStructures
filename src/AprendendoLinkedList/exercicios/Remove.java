package AprendendoLinkedList.exercicios;

import java.util.LinkedList;

public class Remove {
    public static void main(String[] args) {
        //Dada uma LinkedList de strings (ex: "Maçã", "Banana", "Uva", "Pera"), faça:
        //Remova o primeiro elemento.
        //Remova o último elemento.
        //Remova a fruta "Uva" se existir.
        //Verifique se a lista está vazia após as remoções.
        LinkedList<String> lista = new LinkedList<String>();
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Uva");
        lista.add("Pera");
        lista.removeFirst();
        lista.removeLast();
        lista.remove("Uva");
        System.out.println("Lista está vazia? " + lista.isEmpty());
        System.out.println(lista);

    }
}

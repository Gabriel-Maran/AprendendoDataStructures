package AprendendoLinkedList.exercicios;

import java.util.LinkedList;

public class Reverse {
    public static void main(String[] args) {
        //Inversão da Lista
        //Inverta a ordem dos elementos de uma LinkedList de caracteres (ex: 'A', 'B', 'C', 'D')
        //Sem usar estruturas auxiliares como ArrayList ou Collections.reverse().
        LinkedList<String> lista = new LinkedList<>();
        for(int i = 0; i < 10000; i++){
            lista.add("A");
            lista.add("B");
            lista.add("C");
            lista.add("D");
        }
        System.out.println("Inicio");
        long inicio = System.currentTimeMillis();
        System.out.println(reverseLinkedList(lista));
        long fim = System.currentTimeMillis();
        System.out.println("Fim");
        System.out.println(fim - inicio);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> lista) {
        int left = 0, right = lista.size() - 1;
        while(left < right){
            String temp = lista.get(left);
            lista.set(left, lista.get(right));
            lista.set(right, temp);
            left++;
            right--;
        }
        return lista;
    }
}

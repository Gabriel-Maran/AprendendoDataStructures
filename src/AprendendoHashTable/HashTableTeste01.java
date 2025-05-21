package AprendendoHashTable;

import java.util.Hashtable;

public class HashTableTeste01 {
    //Divido em "buckets" onde se encontram os números
    //Quando Integer a chave, o hash é o proprio valor do numero
    //Para definir a posição, se usa key%10
    //Caso haja 2 keys em que o resultado é o mesmo, é criada uma linkedlist
    //Ex: 0:( 100 -> 200 ); 1:( 101 ); 2:( 202 )...
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);
        table.put(100, "Gabriel");
        table.put(123, "NaoSei");
        table.put(321, "Joao");
        table.put(555, "Carlos");
        table.put(777, "Alguem");

//        table.remove(777);

        for (Integer k : table.keySet()) {
            System.out.print(k.hashCode() % 10 + " - ");
            System.out.print("Chave: " + k + " : ");
            System.out.println("Nome: " + table.get(k));
        }


    }
}

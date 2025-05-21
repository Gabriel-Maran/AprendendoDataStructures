package AprendendoHashTable;

import java.util.Hashtable;

public class HashTableTeste02 {
    public static void main(String[] args) {
        //Formula: key.hashCode % capacity = index
        //Runtime complexity: Best case = O(1); Worst case = O(n);
        //Complexidade depende da quantidade de colisões, quanto mais, pior o desempenho na questão runtime
        Hashtable<String, String> table = new Hashtable<>(21);
        table.put("100", "Gabriel");
        table.put("123", "NaoSei");
        table.put("321", "Joao");
        table.put("555", "Carlos");
        table.put("777", "Alguem");

        for (String k : table.keySet()) {//%num, pois num é o valor inicial da nossa table
            System.out.println(k.hashCode()%21 + " - " + k + " : " + table.get(k));
        }
    }
}

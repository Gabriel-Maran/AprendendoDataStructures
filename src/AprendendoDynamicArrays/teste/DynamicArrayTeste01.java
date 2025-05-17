package AprendendoDynamicArrays.teste;

import AprendendoDynamicArrays.dominio.DynamicArray;

public class DynamicArrayTeste01 {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(100);
        array.add("Nao");
        array.add("Sei");
        array.add("A");
        array.add("String");
        array.add(1);
        System.out.println(array.getCapacity());
        array.delete(1);
        array.remove(1);
        System.out.println(array);
        System.out.println("Empty: " + array.isEmpty());
    }
}

package AprendendoDynamicArrays;

public class AprendendoDynamicArray {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(10);
        array.add("Nao");
        array.add("Sei");
        array.add("A");
        array.add("String");
        array.add(1);
        array.delete(1);
        System.out.println(array);
        System.out.println("Empty: " + array.isEmpty());
    }
}

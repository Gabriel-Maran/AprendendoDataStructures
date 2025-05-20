package AprendendoSort.teste;

import java.util.Arrays;

public class InsertionSortTeste01 {
    //Best case O(n)
    //Current case O(n²)
    public static void main(String[] args) {
        int[] array = {7, 55, 6, 5, 1, 4};
        int[] arraySorted = insertionSort(array);
        System.out.println(Arrays.toString(arraySorted));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }
}

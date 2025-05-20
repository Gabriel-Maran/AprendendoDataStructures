package AprendendoSort.teste;

import java.util.Arrays;

public class BubbleSortTeste01 {//O(n²)
    public static void main(String[] args) {
        int[] vetor = {1, 9, 4, 6, 2, 4, 6, 8, 1, 2, 0};
        System.out.println("Inicial: " + Arrays.toString(vetor));
        int[] listOrdenada = bubbleSort(vetor);
        System.out.println("Final: " + Arrays.toString(vetor));
    }

    public static int[] bubbleSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }
}

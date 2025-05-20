package AprendendoSort.teste;

public class SelectionSortTeste01 {//O(n²)
    public static void main(String[] args) {
        int[] array = new int[100001];
        int j = 0;
        for (int i = 100000; i > 0; i--) {
            array[j] = i;
            j++;
        }
        long init = System.currentTimeMillis();
        int[] arraySorted = selectionSort(array);
        long end = System.currentTimeMillis();
        System.out.println("Tempo: " + (end - init) + "ms");
    }

    public static int[] selectionSort(int[] array) {
        for (int k = 0; k < array.length -1; k++) {
            int min = k;
            for (int i = k + 1; i < array.length; i++) {
                if (array[min] > array[i]) {
                    min = i;
                }
            }
            if (min != k) {
                int temp = array[k];
                array[k] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }
}

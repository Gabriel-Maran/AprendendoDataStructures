package AprendendoBinarySearch;

public class BinarySearchTeste01 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int value = 42;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 5;
        }
        int position = binarySearch(array, value);
//        int position = Arrays.binarySearch(array, value);
        if (position == -1) {
            System.out.println("The value given does not exist in the array");
        } else {
            System.out.println("The value give is at " + position + " index");
        }

    }

    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] > value) {
                high = middle - 1;
            } else if (array[middle] < value) {
                low = middle + 1;
            }
        }
        return -1;
    }
}

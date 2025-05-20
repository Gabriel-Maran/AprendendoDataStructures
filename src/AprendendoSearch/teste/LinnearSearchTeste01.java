package AprendendoSearch.teste;

public class LinnearSearchTeste01 {//O(n), ou seja, linear
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = linerSearch(array, 100);
        if(index == -1){
            System.out.println("Index not found");
        }else{
            System.out.println("Index was found at: "+index);
        }
    }

    public static int linerSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

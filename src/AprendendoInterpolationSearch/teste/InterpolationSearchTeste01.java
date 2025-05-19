package AprendendoInterpolationSearch.teste;

public class InterpolationSearchTeste01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int index = 256;
        int search = interpolationSearch(array, index);
        if (search == -1) {
            System.out.println("The number given is not found");
        } else {
            System.out.println("The number given is at " + search + " index");
        }
    }

    public static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;
        while (value >= array[low] && value <= array[high] && low <= high) {
            //Calculo
            int prob = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("Prob = " + prob);
            if (array[prob] == value) {
                return prob;
            } else if (array[prob] < value) {
                low = prob + 1;
            } else {
                high = prob - 1;
            }
        }
        return -1;
    }
}

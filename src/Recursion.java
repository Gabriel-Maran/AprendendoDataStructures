public class Recursion {
    public static void main(String[] args) {
//        walk(10);
//        long factorialRecursive = recursiveFactorial(50);
        System.out.println(power(2, 10));
    }

    public static void walk(int step) {
        //Better in some cases, but it may use more memory than a not-recursive method
        if (step < 1) return;
        System.out.println("You take a step");
        step--;
        walk(step);
    }

    public static long recursiveFactorial(long num) {
        if (num <= 1) return 1;
        return num * recursiveFactorial(num - 1);
    }

    public static long power(long num, long exponent) {
        if (exponent < 1) return 1;
        return num * power(num, exponent - 1);
    }

}

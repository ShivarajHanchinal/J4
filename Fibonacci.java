public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Change this to the desired number of terms in the Fibonacci series
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}

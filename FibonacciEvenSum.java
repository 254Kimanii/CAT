public class FibonacciEvenSum {
    public static void main(String[] args) {
        System.out.println("Sum of even Fibonacci numbers: " + sumEvenFibonacci(4000000));
    }

    // Method to calculate the sum of even Fibonacci numbers not exceeding a given limit
    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int a = 1; // First Fibonacci term
        int b = 2; // Second Fibonacci term
        while (b <= limit) {
            if (b % 2 == 0) { // Check if the term is even
                sum += b;
            }
            int next = a + b; // Generate the next term in the sequence
            a = b; // Update a to the last term
            b = next; // Update b to the new term
        }
        return sum;
    }
}

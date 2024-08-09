import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];

        // Input 15 integers from the user
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the values stored in the array
        System.out.println("Array elements: " + Arrays.toString(array));

        // Ask user to enter a number to check its presence in the array
        System.out.println("Enter a number to check:");
        int numberToCheck = scanner.nextInt();

        // Check if the number is present in the array
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToCheck) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        // Sort the array in ascending order
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Create another array in reverse order
        int[] reversedArray = new int[15];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

        // Calculate the sum and product of array elements
        int sum = 0;
        long product = 1; // Use long to avoid overflow
        for (int num : array) {
            sum += num;
            product *= num;
        }

        // Print the sum and product of array elements
        System.out.println("Sum of elements: " + sum);
        System.out.println("Product of elements: " + product);
    }
}
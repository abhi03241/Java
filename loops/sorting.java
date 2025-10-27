import java.util.Arrays; // Import the Arrays class

public class ArraySortingExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3}; // Declare and initialize an integer array

        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers); // Sort the array in ascending order

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
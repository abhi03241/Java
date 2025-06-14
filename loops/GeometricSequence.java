package loops;

import java.util.Scanner;

public class GeometricSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the sequence: ");
        int n = scanner.nextInt();
        
        int term = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(term);
            if (i < n - 1) {
                System.out.print(", ");
            }
            term *= 2;
        }

        scanner.close();
    }
}

package SortingArray;
import java.util.Scanner;

public class DiagMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of the square matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isDiagonal = true;

        // Check diagonal property
        for (int i = 0; i < n && isDiagonal; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && matrix[i][j] != 0) {
                    isDiagonal = false;
                    break;
                }
            }
        }

        // Output result
        if (isDiagonal) {
            System.out.println("The matrix is a diagonal matrix.");
        } else {
            System.out.println("The matrix is NOT a diagonal matrix.");
        }
    }
}

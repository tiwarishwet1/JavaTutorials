package java_basics_question3;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[3][3];

        System.out.println("Enter elements of first 3 x 3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        MatrixOperations obj = new MatrixOperations();

        // Display first matrix using enhanced for loop
        System.out.println("\nFirst Matrix:");

        obj.display(matrix1);

        // Transpose
        int[][] transpose = obj.transpose(matrix1);

        System.out.println("\nTranspose:");

        obj.display(transpose);

        // Second matrix
        int[][] matrix2 = new int[3][3];

        System.out.println("\nEnter elements of second 3 x 3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Addition
        int[][] result = obj.add(matrix1, matrix2);

        System.out.println("\nAddition of two matrices:");

        obj.display(result);

        sc.close();
    }
}
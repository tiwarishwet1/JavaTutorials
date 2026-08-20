package java_basics_question2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayOperations obj = new ArrayOperations();

        // a. Find maximum and minimum
        obj.findMaxMin(arr);

        // b. Multiply each element by 5
        int[] result = obj.multiplyByFive(arr);

        System.out.println("Array after multiplying each element by 5:");

        for (int value : result) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}

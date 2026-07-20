package Array;

import java.util.Scanner;

public class Example_03 {

    public static void main(String[] args) {

        int[] Number = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 integer Number :");

        for (int i = 0; i < Number.length; i++) {

            Number[i] = sc.nextInt();

        }
        
        System.out.println("Output :");

        for (int i = 0; i < Number.length; i++) {

            System.out.println(Number[i] + "\n");

        }

    }

}

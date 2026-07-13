package Array;

import java.util.Scanner;

public class Example_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] number = new int[5];
        int sum = 0;
        System.out.println("Enter 5 Integer Number :");

        for (int i = 0; i < 5; i++) {

            number[i] = input.nextInt();

        }

        for (int i = 0; i < 5; i++) {

            sum = sum + number[i];

        }

        System.out.println("Total :" + sum);

        int avrg = sum / 5;
        System.out.println("Avarege : " + avrg);

        int max = number[0];

        for (int i = 0; i < 5; i++) {

            if (max < number[i]) {

                max = number[i];
            }

        }

        System.out.println("Maximum number in Array :" + max);

        int min = number[0];

        for (int i = 0; i < 5; i++) {

            if (min > number[i]) {

                min = number[i];
            }

        }

        System.out.println("Maximum number in Array :" + min);
    }

}

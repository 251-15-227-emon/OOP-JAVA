package ExceptionHandaling;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter num1 :");

            int num1 = input.nextInt();
            System.out.println("Enter num2 :");

            int num2 = input.nextInt();
            int result = num1 / num2;

            System.out.println("Result :" + num1 + "/" + num2+ "=" + result);

        } catch (Exception e) {
            System.out.println("Exception :" + e);

            System.out.println("You must enter intiger.please try again");
        }

    }
}

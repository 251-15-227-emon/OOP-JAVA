package Input_Scannar;

import java.util.Scanner;

public class Example_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter Any Number :");

        String name;

        System.out.println("Enter Your Name :");

        number = input.nextInt();
        name = input.next();

        System.out.println("Number=" + number);
        System.out.println("Name=" + name);

    }

}

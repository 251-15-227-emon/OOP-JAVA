package ArrayList;

import java.util.ArrayList;

public class Example_03 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("All Numbers: " + numbers);

        System.out.println("First Number: " + numbers.get(0));

        numbers.set(1, 100);

        System.out.println(numbers);

        numbers.remove(0);

        System.out.println(numbers);

        System.out.println("Size = " + numbers.size());

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }

}

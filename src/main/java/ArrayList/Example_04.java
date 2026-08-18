package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Example_04 {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();

        name.add("Emon");
        name.add("Anika");
        name.add("Promit");

        System.out.println("List of Name :");

        for (String n : name) {

            System.out.println(n);

        }

        // Access specific Index
        System.out.println("Second Name :" + name.get(1));

        // Remove an element 
        name.remove("Promit");

        System.out.println("List After Removal :");

        for (String n : name) {

            System.out.println(n);
        }

    }

}

package HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Emon {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Emon");
        names.add("Anika");
        names.add("Promit");
        names.add("Emon");
        System.out.println("Hashset Name : ");

        for (String n : names) {

            System.out.println(n);
        }

        Set<String> uniqueNames = new HashSet<>();

        System.out.println("Duplicate Names :");

        for (String name : names) {

            if (!uniqueNames.add(name)) {

                System.out.println("Duplicate detected: " + name);

            }
        }

        System.out.println("Total Distinct Names: " + uniqueNames.size());

        System.out.println("Distinct Names:");

        for (String name : uniqueNames) {

            System.out.println(name);
        }

    }
}

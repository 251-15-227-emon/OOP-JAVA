package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Example_01 {
    
    public static void main(String[] args) {
        
       
       Set <String> Names =new HashSet<>();
       
       Names.add("Emon Sarkar");
       Names.add("Anika Nishat");
       Names.add("Promit Mondal");
       Names.add("Puja rani Sarkar");
       
       Names.remove("Puja rani Sarkar");
       
       for(String a : Names){
       
           System.out.println(a);
           
       
       }
      
        System.out.println(Names.contains("Emon Sarkar"));
        
         System.out.println("Total Distinct Names: " + Names.size());
        
        
    }
    
}

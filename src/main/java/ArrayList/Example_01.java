package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;




public class Example_01 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        System.out.println("Size =" + number.size());

        number.add(10);
        number.add(20);
        number.add(2, 40);

        System.out.println(number);
        
        for(int x: number){
        
            System.out.print("   "+x);
        
        }
        
        
        // Iterator itr =number.iterator();
        
     /* while(itr.hasNext()){
       
           System.out.print(" "+itr.next());
       
       }*/
        
        System.out.println(" Size =" + number.size());

    }

}

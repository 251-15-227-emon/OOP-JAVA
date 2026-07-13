package Array;

public class Example_01 {
    
    public static void main(String[] args) {

        int[] number = new int[5];

        number[0] = 5;
        number[1] = 6;

        number[2] = 7;

        number[3] = 8;

        number[4] = 9;
        
        int sum = number[0]+number[1]+number[2]+number[3]+number[4];
        
        int len= number.length;
        
        System.out.println("Total :"+sum);
        System.out.println("Length Of Array:"+len);
    }
    
}

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
          System.out.println("Enter num1");
         int num1 = input.nextInt();
          System.out.println("Enter num2");
         int num2 = input.nextInt();
          System.out.println("Enter num3");
         int num3 = input.nextInt();

         if(num1>num2){
            int largest = num1;
            if(largest>num3){
                System.out.println("largest number is num1");
            }
            
         }
         else if(num2<num3){
             System.out.println("largest number is num3");
         }
         else{
              System.out.println("largest number is num2");
         }

    }
    
}

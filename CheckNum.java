import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        if(num>0){
            System.out.println("Number is positive");

          
        }
         else if(num==0){
                   System.out.println("Number is Zero");
            }
        else{
              System.out.println("Number is Negative");
        }
    }
}


import java.util.Scanner;

public class CurrentBill {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int unit= input.nextInt();
        if(unit<=100){
            int amount = unit*2;
            System.out.println(amount);
        }
        else if(unit>100 && unit<=200){
            int amount = 200 + (unit-100)*3;
            System.out.println(amount);
        }
        else{
             int amount = 500 + (unit-200)*5;
             System.out.println(amount);
        }
    }
}

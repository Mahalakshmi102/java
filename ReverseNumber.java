import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        int reverse =0;
        while(number>0){
            int digit= number%10;
            reverse = reverse*10+digit;
            number= number/10;

            
        }
        System.out.println(reverse);
    }
}

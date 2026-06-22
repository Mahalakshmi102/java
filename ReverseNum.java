import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        int F = num/100;
        int M = (num/10)%10;
        int L = num%10;
             
                         

        int reverseNum = L*100 + M*10 + F;
        System.out.println(reverseNum);
        
       
    }
}

import java.util.Scanner;

public class CheckSym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter = input.next().charAt(0);
        int val = letter;
        if (val>=65 && val<=90){
            System.out.println("uppercase");
        }
       else if (val>=97 && val<=122){
            System.out.println("lowercase");
        }
        else if(val>=48 && val<=57){
            System.out.println("Number");
        }
        
        else{
            System.out.println("Symbols");
        }



    }
}

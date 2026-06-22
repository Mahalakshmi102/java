import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args){

    
          Scanner input = new Scanner(System.in);
          System.out.println("Enter num1");
          int num1 = input.nextInt();
          System.out.println("Enter num2");
          int num2 = input.nextInt();
          System.out.println("Enter number to calculate");
          char cal = input.next().charAt(0);
       switch(cal){
            case '+':
                int add = num1+ num2;
                System.out.println("addition:"+add);
                break;
            case '-':
                int sub = num1- num2;
                System.out.println("Subraction:"+sub);
                break;
            case '/':
                int div= num1/ num2;
                System.out.println("division:"+div);
                break;
            case '*':
                int mul = num1* num2;
                System.out.println("multiplication:"+mul); 
                break;
            default:
                System.out.println("wrong values");      
        }        
   }
}

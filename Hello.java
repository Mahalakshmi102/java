import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        String  s= input.next();
        char ch = input.next().charAt(0);
        System.out.println(ch);
       
    }
}
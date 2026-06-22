import java.util.Scanner;
public class Inputss {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name= input.nextLine();
        int age = input.nextInt();
        float percent = input.nextFloat();
        System.out.println(name);
        System.out.println(age);
        System.out.println(percent);

    }
}

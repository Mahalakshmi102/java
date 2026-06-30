import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int num=input.nextInt();

        for(int i=1;i<=num;i++){
            for(int s=i;s<=num-i;s--){
                System.out.print("-");
            }
            for(int j=i;j<=i*2-1;j--){
                System.out.print("*");
            }
            System.out.println();

        }

      /*   for (int i=0; i<=num;i++){
            for(int j=1; j<=num-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
      */

       /*  for (int i=1; i<=num;i++){
            for(int j=1; j<=num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */

       /*for(int i=1; i<=5;i++){
        for(int j=1; j<=5; j++){
            System.out.print(j+" ");
        }
        System.out.println();
      }*/
    }
        
    
}

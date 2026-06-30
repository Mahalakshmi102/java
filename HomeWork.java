import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i=0;   
        int setPin = 123;
        
        while(i<3){
            System.out.println("Enter pin");
            int pin =input.nextInt();
            if(pin==setPin){
                  System.out.println("Access Granted");
                  i=3;

                  
            }
            else{
                i++;

            }
            
        }
          
         
              System.out.println("Card Bloked");
          
         
        

       /* int total=0;
        int sub = input.nextInt();
        for(int i=0; i<5;i++){
            int marks =input.nextInt();
            total +=marks;
        }
        int average= total/sub;
        System.out.println("total:"+total);
         System.out.println("average:"+average);  */
     }
}

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr =new int[5];
          for(int i=0;i<arr.length;i++){
               arr[i]=input.nextInt();
          }

          for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                 System.out.print(arr[i]+" ");

            }
          }
       /*   int max = arr[0];
          for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

          }
            System.out.print(max);*/ 

   /*    int[] arr =new int[5];
          for(int i=0;i<arr.length;i++){
               arr[i]=input.nextInt();
          }
        for(int i=0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
    
        } */ 
        
    }
}

import java.util.Scanner;
public class LinearSerch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i] =input.nextInt();

        }
        int target = input.nextInt();
        boolean isfound=false;
        for(int i:arr){
            if(i==target){
                System.out.println("Value found");
                isfound=true;
            }
        }
         if(! isfound){
            System.out.println("Not found");
        }

    }
}

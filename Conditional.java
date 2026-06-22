public class Conditional {
    public static void main(String[] args) {
        int i=4;
        if(i<5){
            System.out.println("value is less then 5:"+i);
            if(i<3){
                 System.out.println("value is less then 3:"+i);
            }
        }
        else if(i<10){
            System.out.println("value is less then 10:"+i);
        }
        else{
             System.out.println("value is  Not less then 10:"+i);
        }
    }
    
}

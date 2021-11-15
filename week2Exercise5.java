//week 2 Exercise 5
import java.util.Scanner;
public class week2Exercise5 {
    public static void main (String [] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int power = Integer.parseInt(reader.nextLine());
        int sum = 2 ;
        
        for (int i  = 1 ;  i < power; i++){
            sum = sum + (int) Math.pow(2,i);
           
         System.out.println("The result is :  " + sum );
            
        }
    }
    
}

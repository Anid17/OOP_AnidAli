//week 3 Exercise 4
import java.util.Scanner;
public class week3Ex4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.nextLine();
        System.out.println("In reverse order : ");
        
        int i;
        int x = name.length();
        for(i=x-1;i>=0;i--){
            System.out.println(name.charAt(i));
            
        }
          
    }
}

//week3 Exercise 3
import java.util.Scanner;
public class week3Exercise4 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        int count = 1;
        while (count<=name.length()){
         System.out.println(count + " charcters = "+ name.charAt(count-1));
       count++;
    }}}
 
    


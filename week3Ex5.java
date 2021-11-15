//week3 Exercise 5
package week4Ex5;
import java.util.Scanner;
public class week3Ex5 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String string1 = input.nextLine();
        System.out.println("Enter second string : ");
        String string2 = input.nextLine();
        int result = string1.indexOf(string2);
        if(result >=0)
            System.out.println("The second string is in the first string");
        else{
            System.out.println("The second sting is no founded in the first one ");
        }
    }
    
}

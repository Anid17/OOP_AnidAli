/*
4th exercise
*/
package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {
 
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Type an Integer: ");
            int firstNumber = reader.nextInt();
            System.out.println("Type second Integer ");
            int secondNumber = reader.nextInt();
            System.out.println("The sum is " + (firstNumber+secondNumber));
        }
    }
    
}

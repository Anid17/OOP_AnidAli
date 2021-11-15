//week2 Exercise 4

import java.util.Scanner;
public class week2Exercise4 {
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 =Integer.parseInt(reader.nextLine());
        System.out.println("Enter second number: ");
        int n2 = Integer.parseInt(reader.nextLine());
        
        while (n1<n2){
            System.out.println(n1);
                    n1++;
        }
    }
    
}

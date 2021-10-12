/*
 6th exercise
 */
package javaapplication5;
import java.util.Scanner;

public class JavaApplication5 {
    
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type an integer ");
        int numberone = reader.nextInt();
        System.out.print("Type an integer ");
        int numbertwo = reader.nextInt();
        if(numberone == numbertwo){
        System.out.println("Equal");
        }else if (numberone > numbertwo){
        System.out.println(numberone);
        }else{
        System.out.println(numbertwo);
}

   

    }
    
}

/*
5th exercise
*/
package javaapplication4;
import java.util.Scanner;
public class JavaApplication4 {

    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                int numberOne= reader.nextInt();
                
                if(numberOne > 0){
                    System.out.print("Number is positive ");
                }else{
                    System.out.print("Number is negative ");
                }
    }
    
}

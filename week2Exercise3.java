//week 2 exercise : 3

import java.util.Scanner;
public class NewClass2 {
   
    public static void main(String[] args){
   Scanner reader=new Scanner(System.in);
   int sum = 0;
   int n;

     while(true){
       System.out.println("Enter a number: ");
       n = Integer.parseInt(reader.nextLine());
       
       if(n==0){
       break;
    }
       sum += n;
        System.out.println("Sum now: " + sum);
       
    }
     System.out.println("The sum in the end is: " + sum);
    
   }}
  
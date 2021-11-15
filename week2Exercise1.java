//week 2 exercise : 1

import java.util.Scanner;
public class NewClass2 {
   
    public static void main(String[] args){
   Scanner reader=new Scanner(System.in);
        String right_password = "carrot";
        int right = 0;
        while(right != 1){
            System.out.println("Enter password");
            String user_password = reader.nextLine();
                    
            if(!right_password.equals(user_password)){
                System.out.println("Enter password");
                 user_password = reader.nextLine();
            }else {
                right = 1;
            }
        }
{
        System.out.println("Secret message is : jryy qbar! ");
}
    }
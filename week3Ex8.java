//week3 Ex: 8
import java.util.Scanner;
public class week3Ex8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        boolean help_variable = Ppalindrome(name);
        System.out.println(help_variable);
        input.close();
    }
    public static boolean Ppalindrome(String text){
        int length = text.length();
        int forward = 0;
        int backward = length - 1;
        while(backward > forward){
            char forwardChar = text.charAt(forward++);
            char backwardChar=text.charAt(backward--);
            if(forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    
    
}
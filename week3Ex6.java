// week 3 Ex : 6
import java.util.Scanner;
import java.util.ArrayList;
public class week3Ex6 {
    public static void main(String[] args){
        ArrayList<String>wordList = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.println("type a word : ");
            String new_string = input.nextLine();
            
            if(wordList.contains(new_string)){
                System.out.println("you gave the word " + new_string + " twice ");
                break;
            }
            wordList.add(new_string);
        }
    }
    
}

//week 2 Exercise 8
import java.util.Random;
import java.util.Scanner;

public class week2Exercisee8 {
    public static void main(String[] args) {
        	Scanner reader = new Scanner(System.in);
        	int random_number = drawNumber();
        	
        
       		 int attempts = 0; 
        
        	System.out.print("Guess the number : ");     
       		int guess = reader.nextInt();
		while(guess!=random_number){
	   	 if(guess>random_number) {
	    		attempts +=1;
	    		System.out.println("The number is lesser!  ");
	   	 }else if (guess<random_number){
	    		attempts += 1;
	    		System.out.println("The number is greater ");
	    	 }
	    	guess = reader.nextInt(); 	
		}
		System.out.println("Congratulations, your guess is correct ! ");
       		System.out.println("You made "+ (attempts + 1)  + " guesses !"); 
    	}
    
    	public static int drawNumber(){
     	   Random rand = new Random();
      	   int random_number = rand.nextInt(100);
        
           return random_number;
        }

}

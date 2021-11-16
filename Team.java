/* Team Class 
import java.util.ArrayList;
public class Team {
    
    private String name; 
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize = 16;
    
    public Team(String newName){
        this.name = newName; 
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName; 
    }
    public void addPlayer(Player player){
        if(this.players.size()<this.maxSize){
            this.players.add(player);
        }
        
    }
    
    public void printPlayers(){
        for(Player player : this.players){
            System.out.println(player);
        }
    }
    public void setMaxSize(int newMaxSize){
        this.maxSize = newMaxSize;
    }
    
    public int size(){
       return this.players.size();
    }
    
    public int goals(){
        int totalGoals = 0;
        
        for(Player player : this.players){
            totalGoals = totalGoals + player.goals();
        }
        
        return totalGoals; 
    }

    private static class Player {

        public Player() {
        }

        private int goals() {
           
        }
    }
}  
*/


/* Player class


/ public class Player {
    private String name; 
    private int numberOfGoals; 
    
    public Player(String newName){
        this.name = newName; 
    }
    
     public Player(String newName, int newNumberOfGoals){
        this.name = newName; 
        this.numberOfGoals = newNumberOfGoals;
    }
     
     public String getName(){
         return this.name;
     }
     
     public int goals(){
        
         return this.numberOfGoals;
     }
     
     public String toString(){
         return "Player: " +  this.name + " goals: " + this.numberOfGoals;
     }
} 
*/

/* Main class 
//import java.util.Random;
public static void main(String[] args) {
Team team1 = new Team("FC Barcelona");
System.out.println(team1.getName());
Player Messi = new Player("Lionel",32);
Player Ronaldinho = new Player("Gaucho",45);
System.out.println(Messi.getName());
System.out.println(Messi.goals());
team1.addPlayer(Messi);
team1.addPlayer(Ronaldinho);
System.out.println(team1.goals());
}
*/
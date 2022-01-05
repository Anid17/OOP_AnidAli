import java.util.Random;

public class Cow  implements Milkable, Alive {
     
    private String name; 
    private int capacity;
    private int amount = 0;
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",  "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",  "Jaana", "Jami", "Jatta", "Laku", "Liekki",  "Mainikki", "Mella", "Mimmi", "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(){
        int randomIndex = new Random().nextInt(NAMES.length);
        this.name = NAMES[randomIndex];
        this.capacity = 15 + new Random().nextInt(40);
    }
    
    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + new Random().nextInt(40);
    }
    
    public String getName(){
        return this.name; 
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public int getAmount(){
        return this.amount; 
    }
    
    public String toString(){
        return this.name + " " + this.amount + " / " + this.capacity;
    }
    
    public double milk(){
        double keepAmout = this.amount;
        this.amount = 0;
        return keepAmout; 
    }
    
    public void liveHour(){
        this.amount += 0.7 + new Random().nextInt(2);
    }
   
    
}

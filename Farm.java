import java.util.LinkedList;

public class Farm {
     private String owner; 
    private Barn barn; 
    private LinkedList<Cow> cowList;
    
    public Farm(String o, Barn b){
        this.owner = o; 
        this.barn = b;
        this.cowList = new LinkedList<Cow>();
    }
    
    public String getOwner(){
        return this.owner; 
    }
    
    public String toString(){
        String returnString = "";
        for(Cow cow : this.cowList){
          returnString += "\t" + cow.toString() + "\n";
        }
        return "Farm owner " + this.owner + "\nBarn bulk tank " + this.barn.toString() 
                + "\nAnimals:" + "\n" + returnString;
    }
    
    public void addCow(Cow cow){
        this.cowList.add(cow);
    }
    
    public void liveHour(){
        for(Cow cow : this.cowList){
           cow.liveHour();
        }
    }
    
    public void manageCows(){
        this.barn.takeCareOf(cowList);
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }
}

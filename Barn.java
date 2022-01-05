import java.util.Collection;


  public class Barn {
        
    private BulkTank bulkTank; 
    private MilkingRobot milkingRobot; 

    public Barn(BulkTank tank){
        this.bulkTank = tank; 
    }
    
    public BulkTank getBulkTank(){
        return this.bulkTank;
    }
     
    public void installMilkingRobot(MilkingRobot milkingRobot){
         this.milkingRobot = milkingRobot; 
         this.milkingRobot.setBulkTank(bulkTank);
     }
     
    public void takeCareOf(Cow cow){
        if(this.milkingRobot == null){
            throw new IllegalStateException("Install milking robot");
        }
        
        milkingRobot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(this.milkingRobot == null){
            throw new IllegalStateException("Install milking robot");
        }
        
        for(Cow c : cows){
            milkingRobot.milk(c);
        }
    }
    
   
    public String toString(){
      return this.bulkTank.toString();
    }

}

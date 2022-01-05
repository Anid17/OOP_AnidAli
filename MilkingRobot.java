

public class MilkingRobot {
     private BulkTank bulkTank = null; 
    
    public MilkingRobot(){}
    
    public BulkTank getBulkTank(){
        return this.bulkTank;
    }
    
    public void setBulkTank(BulkTank tank){
        this.bulkTank = tank; 
    }
    
    public void milk(Milkable milkable){
        if(this.bulkTank == null){
            throw new IllegalStateException("Connect bulk tank");
        }
        double amountToAdd = milkable.milk();
        bulkTank.addToTank(amountToAdd);
    }
}

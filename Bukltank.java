
public class BuklTank {
    private double capacity;
    private double volume;
    
    public BulkTank(){
        this.capacity = 2000;
        this.volume = 0;
    }
    
    public BulkTank(double capacity){
        this.capacity = capacity;
        this.volume = 0;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double volume(){
        return this.volume;
    }
    
    public double howMuchFreeSpace(){
        return this.capacity - this.volume;
    }
    
    public void addToTank(double amount){
        if(this.capacity - this.volume >= amount){
            this.volume += amount;
        }else{
            this.volume += this.capacity-volume;
        }
    }
    
    public double getFromTank(double amount){
        if(this.volume >= amount){
            this.volume-=amount;
        }else{
            this.volume = 0;
        }
        return amount; 
    }
    
    public String toString(){
        return Math.ceil(this.volume) + " / " + Math.ceil(this.capacity);
    }
    
}

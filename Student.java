
public class Student extends People{
    private int credits;
    
    public Student(String n, String a){
       super(n, a);
       this.credits = 0;
    }
    
    public int credits(){
        return this.credits;
    }
    
    public void study(){
        this.credits++;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n\tcredits " + this.credits;
    }
}

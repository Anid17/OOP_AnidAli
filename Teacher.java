
public class Teacher  extends People{
    private int salary;
    
    public Teacher(String n, String a, int s){
       super(n, a);
       this.salary = s;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n\tsalary " + this.salary;
    }
    
}

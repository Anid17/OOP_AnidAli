
public class Person1 {
    public Person1(String name, int age){       
        if(name == null || name.equals("") || name.length() > 40 || age < 0 || age > 120){
           throw new IllegalArgumentException("Illgeal parameter value. Please provide valid parameters");
        }else{
            System.out.println("OK");
        }
    
    }

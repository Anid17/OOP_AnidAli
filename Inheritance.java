
import static java.time.Clock.system;


public class Inheritance {

    
    public static void main(String[] args){
        Samsung s = new Samsung();
        s.setAndroid_version("Android Pie");
            System.out.println(" Samsung android version :  " + s.getAndroid_version());
            s.setColor("Black ");
            s.setCost(444);
            s.setRam("four GB");
    System.out.println("Samsung cost : "  + s.getCost());
    System.out.println("Samsung color : " + s.getColor());
    System.out.println("Samsung ram : " + s.getRam());
    
            
            
         
    }
    
}
    
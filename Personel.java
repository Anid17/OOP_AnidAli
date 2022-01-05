public class Personel {
     private String name;
    private Education title;
	
    public Personel (String name, Education title) {
        this.name = name;
	this.title = title;
    }
	
    @Override
    public String toString(){
        return this.name + ", " + this.title;
    }
	
    public Education getEducation() {
        return this.title;
    }
    
}

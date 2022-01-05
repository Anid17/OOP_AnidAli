

public class PersonalDuplicateRemover {
     private int amountOfDuplicates;
    private Set<String> charSet;
    
    public PersonalDuplicateRemover(){
        this.charSet = new HashSet<String>();
    }
    
    public void add(String characterString){
        if(this.charSet.contains(characterString)){
            this.amountOfDuplicates++;
        }
        
        this.charSet.add(characterString);
    }
    
    public int getNumberOfDetectedDuplicates(){
        return this.amountOfDuplicates;
    }
    
    public Set<String> getUniqueCharacterStrings(){
        return this.charSet;
    }
    
    public void empty(){
        this.amountOfDuplicates = 0;
        this.charSet.clear();
    }
}

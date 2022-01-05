import file.Analysis;
import java.io.File;
import mooc.logic.ApplicationLogic;
import mooc.ui.TextUserInterface;
import mooc.ui.UserInterface;
import tools.DuplicateRemover;
import tools.PersonalDuplicateRemover;


public class w11 {
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);*/
       
       Person p = new Person("Name", 121);
       
        Printer printer = new Printer("src/week11/textfile.txt");

        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");*/
        
        File file = new File("src/week11/testfile.txt");
        Analysis analysis = new Analysis(file);
        System.out.println("Lines: " + analysis.lines());
        System.out.println("Lines: " + analysis.lines());
        System.out.println("Characters: " + analysis.characters());
        
            MultipleEntryDictionary dict = new PersonalMultipleEntryDictionary();
        dict.add("kuusi", "six");
        dict.add("kuusi", "spruce");

        dict.add("pii", "silicon");
        dict.add("pii", "pi");

        System.out.println(dict.translate("kuusi"));
        dict.remove("pii");
        System.out.println(dict.translate("pii"));
       
        DuplicateRemover remover = new PersonalDuplicateRemover();
        remover.add("first");
        remover.add("second");
        remover.add("first");

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        remover.add("last");
        remover.add("last");
        remover.add("new");

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
            remover.getUniqueCharacterStrings());

        remover.empty();

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
            remover.getUniqueCharacterStrings());
    }
    
}
      
}

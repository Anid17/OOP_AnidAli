
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class week6 {
      public static void main(String[] args) {
        int[] values  = {6, 5, 7, 11};
        System.out.println("Smallest is " + smallest(values));
        System.out.println("Smallest is at index " + indexOfSmallest(values));
        System.out.println("The smallest is at index " + indexOfTheSmallestStartingFrom(values, 2));
        
        System.out.println("Before Swap: " + Arrays.toString(values));
        swap(values, 1, 0);
        System.out.println("After 1. Swap: " + Arrays.toString(values));
        swap(values, 0, 3);
        System.out.println("After 2. Swap: " + Arrays.toString(values));
        
       
        
        int[] sort_array = {1, 6,4,8,3,2};
        Arrays.sort(sort_array);
        System.out.println(Arrays.toString(sort_array));
       
        int[] arrayN = { -3, 2, 3, 4, 7, 8, 12 };
       
        Scanner reader = new Scanner(System.in);

        System.out.print("Values of the array: " + Arrays.toString(arrayN));
        System.out.println();
        System.out.print("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();
        int result = BinarySearch.search(arrayN,  0, arrayN.length, Integer.parseInt(searchedValue));
       
        if(result == -1){
            System.out.println("Value : " + searchedValue + " is not in the array");
        }else{
            System.out.println("Value : " + searchedValue + " is in the array");
        }
        
      int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
      
      NightSky sky = new NightSky(0.1, 40, 10);
      sky.print();
      System.out.println("Number of stars: " + sky.starsInLastPrint());
     
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());
        
        System.out.println(cheese);
        
        Book nh1 = new Book("NHL Hockey", "Stanley Cup", 1952);
        
        Library l = new Library();
        l.addBook(cheese);
        l.addBook(nh1);
        l.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        l.addBook(new Book("Cheese Man", "Penguin Group", 1992));
        
        l.printBooks();
        
        ArrayList<Book> result = Library.searchByTitle("CHEESE");
        System.out.println("========");
        for(Book b : result){
            System.out.println(b);
        }
    }
    
    public static int smallest(int[] array){
        int smallest = array[0]; 
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = array[0]; 
        int index = 0; 
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                index = i; 
                smallest = array[i];
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallest = array[index];
        int indexOfSmallest = index; 
        
        for(int i = index+1; i < array.length; i++){
            if(array[i] < smallest){
                indexOfSmallest = i; 
                smallest = array[i];
            }
        }
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp; 
        
    }
    
    public static void printElegantly(int[]array) {
        for (int i=0; i < array.length ; i++ ) {
            if (i==array.length-1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i]+", ");
            }
        }
    }
    
}

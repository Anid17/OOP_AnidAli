/** import java.util.ArrayList;
public class week10E1 {
public static void main(String[] args){ 
    
//exercise 1
//interface
public interface prvaVjezba {
    int getDaysLeft(); 
    void work();
}
//civilService
public class civilService implements prvaVjezba{
    private int daysLeft; 
    public civilService() {
	this.daysLeft = 362;	
    }

    public int getDaysLeft() {
     return this.daysLeft;   
}
    public void work() {
    if(this.daysLeft>0)
	this.daysLeft--;

    }

}
//militaryService
public class militaryService implements prviVjezba{
    private int daysLeft;
    public militaryService(int days) {
	this.daysLeft = days;
    }

    public int getDaysLeft() {
        return this.daysLeft ; 
}
    public void work() {
        if(this.daysLeft>0)
            this.daysLeft--;
}
}
//task 2
//ToBeStored
public interface ToBeStored {
    double weight();

}
//CD class
public class CD implements ToBeStored{
    private String writer; 
    private String title;
    private int publishing_year;
    private double weight;
    public CD(String writer, String title, int publishing_year) {
	this.weight = 0.1;
	this.writer = writer; 
	this.title = title; 
	this.publishing_year = publishing_year;
	
    }
    public double weight() {
	return this.weight;
    }
}
//Book class

public class Book implements ToBeStored {
    private String writer; 
    private String name;
    private double weight_book;
    public Book(String writer, String name,double weight_book) {
	this.writer = writer; 
	this.name = name ; 
	this.weight_book = weight_book;
    }
@Override
    public double weight() {
    return this.weight_book;
}
}
//Box class
public class Box {
    private double max_weight;
    public ArrayList items = new ArrayList();
    private double current_weight = 0;
    public Box(double max_weight)
    {
	this.max_weight = max_weight;
    }
    public void add(ToBeStored item) {
	if(this.current_weight<max_weight) {
	    this.items.add(item);
	    this.current_weight+=item.weight();
	    
	}
    }

}
//task 3
//GenericClass
public class GenericClass {
private T value;
public GenericClass(T value) {
this.value = value;
}
public T getValue() {
if(this.value.getClass()==Integer.class)
System.err.print("This is int");
return this.value;
}

}
//main with GenericClass
public class Main {
public static void main(String [] args) {
GenericClass gc1 = new GenericClass("Burchy");
System.err.print(gc1.getValue());
GenericClass gc2 = new GenericClass(12345);
System.err.print(gc2.getValue());
}

}
//task 4
//class storehouse
import java.util.HashMap;
import java.util.Set;
public class Storehouse {
    private String product;
    private int price;
    private int stock;
    public HashMap<String,Integer> prices = new HashMap<String,Integer>();
    public HashMap<String,Integer> stocks = new HashMap<String,Integer>();
    public void addProducts(String product, int price, int stock) {
	prices.put(this.product,this. price); 
	stocks.put(this.product, this.stock);
	
    }
    public int hasProduct (String product_name) {
	if(prices.containsKey(product_name))
	    return prices.get(product_name);
	else 
	    return -99;
    }
    public int stock(String product_name) {
	if(stocks.containsKey(product_name))
	    return stocks.get(product_name);
	else 
	    return 0;
	
    }
    public boolean take(String product_name) {
	if(stocks.containsKey(product_name)){
		if(stocks.get(product_name)>0) {
		    stocks.put(product_name, stocks.get(product_name)-1);
		    return true;
		}
		else {
		    return false;
		}
	else  {
		    return false;
		}
	
	}
    }
    public Set<String> products(){
        return prices.keySet();
    }
 

}
//task 5 
//purchase class
public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;
    public Purchase(String product, int amount, int unitPrice) {
	this.product = product; 
	this.amount = amount; 
	this.unitPrice = unitPrice;
	}
    public int price() {
	return this.amount+this.unitPrice;
    }
    public void increaseAmount() {
	this.amount+=this.amount;
    }
    public String toString() {
	return "The total price of a purchase containing "+ this.amount+this.product+ " is"+this.price();
    }
    
    }
//Shopping Basket class
import java.util.Map;
import java.util.HashMap;
public class ShoppingBasket {
    public Map<String,Purchase> basket;
    public ShoppingBasket() {
	basket = new HashMap<String,Purchase>();
    }
    public void addProduct(String product, int price) {
	if(basket.containsKey(product)){
            basket.get(product).increaseAmount();
        }else {
             Purchase purchase = new Purchase(product, 1, price);
             basket.put(product, purchase);
        }
	
    }
    public int price(){
    int total = 0;
    
    for(Purchase product : basket.values()){
        total = total + product.price();
    }  
    return total;
    }
    public void print(){
        for(Purchase product : basket.values()){
            System.out.println(product);
        }
    } 
    
}
//Shop class
import java.util.Scanner;
public class Shop {
    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("below is our sale offer:");

        for (String product : store.products()) {
            System.out.println( product );
        }

        while (true) {
            System.out.print("what do you want to buy (press enter to pay):");
            String product = reader.nextLine();
            if (product.isEmpty()) {
                break;
            }
            
            if(store.stock(product) > 0){
                store.take(product);
                basket.add(product, store.price(product));
            }

        }

        System.out.println("your purchases are:");
        basket.print();
        System.out.println("basket price: " + basket.price());
    }
}


}    
}
**/
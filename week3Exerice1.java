// week 3 Exercise 1.
package javaapplication6;
public class JavaApplication6 {
    public static void main (String[] args){
        double result = average(4,3,6,1);
        System.out.println("The average is : " + result);
    }
    
    public static double average (int n1, int n2, int n3, int n4){
        
        int sum = 0;
    double numbersOfInteger = 4;
    sum = n1 + n2 + n3 + n4;
    double averageOfNumbers = 0;
    averageOfNumbers = sum / numbersOfInteger;
    return averageOfNumbers;
    }
    
    
}

package Fibonaccitest;

import java.util.ArrayList;

/*Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String". 
Remember that a String in Java is an object (not a primitive type). 
To use other types, such as int, you must specify an equivalent wrapper class:
	Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:*/

public class ArrayListEx {

	public static void main(String[] args) {
		// ArrayList of Strings
		ArrayList<String> cars = new ArrayList<String>();
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		
		
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    System.out.println(cars.size());
	    for (int i = 0; i < cars.size(); i++) {
	        System.out.println(cars.get(i));
	      }
	    
	    System.out.println(cars.get(0));
	    cars.set(0, "Opel");
	   
	    System.out.println(cars.get(0));
	    cars.remove(0);
	    System.out.println(cars.get(0));
	    
	    System.out.println(cars);
	    System.out.println(cars.size());
	    cars.clear();
	    System.out.println(cars);
	    System.out.println(cars.size());
	   
	    //Integer array
	    System.out.println("Integer array");
	    
	    myNumbers.add(10);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(25);
	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	}

}

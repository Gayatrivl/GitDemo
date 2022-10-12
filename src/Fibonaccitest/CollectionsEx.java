package Fibonaccitest;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    Collections.sort(cars);  // Sort cars
		    for (String i : cars) {
		      System.out.println(i);
		    }
	}

}

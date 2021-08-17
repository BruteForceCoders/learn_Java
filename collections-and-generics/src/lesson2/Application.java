package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("cat");
		animals.add("dog");
		animals.add("bird");
//		for (int i = 0; i < animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
//		for(String animal : animals) {
//			System.out.println(animal);
//		}
		
		LinkedList<Vehicle> vehicle = new LinkedList<Vehicle>();
		Vehicle v2 = new Vehicle("Toyota", "Camery", 12000, false);
		vehicle.add(new Vehicle("Honda","accord",12000, false));
		vehicle.add(v2);
		vehicle.add(new Vehicle("Jeep","Compass",25000, true));
//		for(Vehicle car : vehicle) {
//			System.out.println(car.toString());
//			
//		}
		printElements(vehicle);
		printElements(animals);
	}

	public static void printElements(List<?> someItem) {
		for (int i = 0; i < someItem.size(); i++) {
			System.out.println(someItem.get(i));
		}
	}
}

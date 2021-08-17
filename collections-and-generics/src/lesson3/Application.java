package lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<Integer> values = new HashSet<Integer>();
//		values.add(10);
//		values.add(20);
//		values.add(30);
//		values.add(40);
//		values.add(10);
		
//		LinkedHashSet<Integer> values = new LinkedHashSet<Integer>();
//		values.add(10);
//		values.add(20);
//		values.add(30);
//		values.add(40);
//		values.add(10);
		
		HashSet<Animal> animals = new HashSet<Animal>();
		Animal animal1 = new Animal("Dog",12);
		Animal animal2 = new Animal("Cat",15);
		Animal animal3 = new Animal("Giraffe",32);
		Animal animal4 = new Animal("Donkey",25);
		Animal animal5 = new Animal("Dog",12);
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
//		System.out.println(animal1.equals(animal5));
//		System.out.println(animal1.hashCode());
//		System.out.println(animal5.hashCode());
//		
		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}

}

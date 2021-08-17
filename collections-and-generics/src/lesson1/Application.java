package lesson1;

import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(100);
		numbers.add(101);
		numbers.add(102);
		numbers.add(103);
		numbers.remove();
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}

}

package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		list1.add(12);
//		list1.add(43);
//		list1.add(15);
//		list1.add(67);
//		list1.add(10);
//		list1.add(15);
//		list1.add(43);
//		list1.add(43);
		
//		ArrayList<Integer> newlist = new ArrayList<Integer>();
//		newlist.add(10);
//		newlist.add(43);
//		newlist.add(15);
//		
//		list1.addAll(newlist);
//		System.out.println(list1);
		
//		list1.removeAll(newlist);
//		System.out.println(list1);
//		
//		list1.clear();
//		System.out.println(list1);
		
//		boolean value = list1.contains(10);
//		System.out.println(value);
//		
//		boolean hasValue = list1.isEmpty();
//		System.out.println(hasValue);
//		
//		list1.retainAll(newlist);
//		System.out.println(list1);
		
		
//		HashSet<Integer> hashSet = new HashSet<Integer>();
//		hashSet.add(12);
//		hashSet.add(67);
//		hashSet.add(43);
//		hashSet.add(10);
//		hashSet.add(10);
//		hashSet.add(10);
		
		HashSet<Employee> hashSet = new HashSet<Employee>();
		Employee e1 = new Employee("Aaron", 20000, "cse");
		Employee e2 = new Employee("Mike", 25000, "acc");
		Employee e3 = new Employee("john", 21000, "adm");
		Employee e4 = new Employee("Steve", 23000, "acc");
		Employee e5 = new Employee("harish", 22000, "cse");
		hashSet.add(e1);
		hashSet.add(e2);
		hashSet.add(e3);
		hashSet.add(e4);
		hashSet.add(e5);
		
		ArrayList<Employee> list2 = new ArrayList<Employee>(hashSet);
		
		Collections.sort(list2);
		System.out.println(list2);
	}

}

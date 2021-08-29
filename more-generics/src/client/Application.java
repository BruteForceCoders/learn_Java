package client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container<Integer, String> container = new Container<Integer, String>(12, "Hello");
		int val1 = container.getItem1();
		String val2 = container.getItem2();
		int val = 4+(1)/2;
		System.out.println(val);
		
		Set<String> mySet1 = new HashSet<>();
		mySet1.add("First");
		mySet1.add("Second");
		mySet1.add("Whatever");
		
		Set<String> mySet2 = new HashSet<>();
		mySet1.add("First");
		mySet1.add("Second");
		mySet1.add("Computer");
		
		Set<String> resultSet = union(mySet1,mySet2);
		
		Iterator<String> itr = resultSet.iterator();
		while(itr.hasNext()) {
			String var = itr.next();
			System.out.println(var);
		}
	}

	public static  <E> Set<E> union(Set<E> set1,Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set1);
		return result;
	}
}

package client;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Container<Integer, String> container = new Container<Integer, String>(12, "Hello");
//		int val1 = container.getItem1();
//		String val2 = container.getItem2();
//		int val = 4+(1)/2;                                                   //line 12-16 is generics session 1 on creating generic class and accessing it 
//		System.out.println(val);
//		
//		Set<String> mySet1 = new HashSet<>();
//		mySet1.add("First");
//		mySet1.add("Second");
//		mySet1.add("Whatever");
//		
//		Set<String> mySet2 = new HashSet<>();
//		mySet1.add("First");
//		mySet1.add("Second");
//		mySet1.add("Computer");
//		
//		Set<String> resultSet = union(mySet1,mySet2);                       //line 28-34 is generics session 1 on creating generic methods and accessing it 
//		
//		Iterator<String> itr = resultSet.iterator();
//		while(itr.hasNext()) {
//			String var = itr.next();
//			System.out.println(var);
//		}
		
		
		
		
		Object myObject = new Object();
		String myVar = "Hello";
		myObject = myVar;
		
		Employee emp = new Employee();
		Accountant acc  = new Accountant();
		emp = acc;
		  
		ArrayList<Employee> employees = new ArrayList<>();                           // Generics with wildcards 
		employees.add(new Employee());
		ArrayList<Accountant> accountants = new ArrayList<>();   
//		employees = accountants;
		
		ArrayList<?> employees2 = new ArrayList<>();                           // Generics with wildcards 
		ArrayList<Accountant> accountants2 = new ArrayList<>();   
		employees2 = accountants2;
		
		//Upper Bound
		ArrayList<? extends Employee> employees3 = new ArrayList<>();                           // wildcards with extends.
		ArrayList<Accountant> accountants3 = new ArrayList<>();   
		employees3 = accountants3;
		
		//Lower Bound
		ArrayList<? super Employee> employees4 = new ArrayList<>();                           // wildcards with extends.
		ArrayList<Employee> accountants4 = new ArrayList<>();   
		employees4 = accountants4;
//		
		makeEmployeeWork(employees);
	}

//	public static  <E> Set<E> union(Set<E> set1,Set<E> set2) {
//		Set<E> result = new HashSet<>(set1);
//		result.addAll(set1);
//		return result;
//	}
	

	public static void makeEmployeeWork(List<Employee> employees) {
		for(Employee emp : employees) {
			emp.work();                                                       // method
		}
	}
}

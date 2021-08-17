package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cust = new Customer("Aaron","Mullasseril Puthuvana",20000);
		
		Vehicle vehicle = new Vehicle("BMW","M3",20000);
		
		Vehicle car = new Vehicle("BMW", "M3", 20000);
		boolean value = car.equals(vehicle);
		System.out.println(value);
		
		Employee emp = new Employee();
		
		cust.purchaseCar(vehicle, emp, false);
		
		
	}

}

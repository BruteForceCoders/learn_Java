package car_dealership;

public class Employee {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void handleCustomer(Customer cust,boolean finance,Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runcreditHistory(cust, loanAmount);
		}
		else if (vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust,vehicle);
			double balanceAmount = cust.getCashOnHand() - vehicle.getPrice();
			if(balanceAmount>0) {
				System.out.println("Balance: "+balanceAmount);
			}
		}
		else {
			System.out.println("Customer will need more money to purchase vehicle: "+vehicle);
		}
	}

	public void processTransaction(Customer cust, Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Customer has purchased the vehicle: "+vehicle.toString()+" for the price "+vehicle.getPrice());
	}

	public void runcreditHistory(Customer cust, double loanAmount) {
		// TODO Auto-generated method stub
		System.out.println("Ran credit history for the Customer");
		System.out.println("Customer has been approved to purchase the vehicle");
	}
	
}

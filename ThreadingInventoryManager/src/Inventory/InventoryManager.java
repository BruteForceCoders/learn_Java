package Inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

	List<Product> SoldProductList = new ArrayList<>();
	List<Product> PurchaseProductList = new ArrayList<>();
	
	public void populateSoldProducts() {
		
		for (int i = 0; i < 1000; i++) {
			Product prod = new Product(i, "Test_product");
			SoldProductList.add(prod);
			System.out.println("Added :"+prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void displaySoldProducts() {
		
		for (Product product : SoldProductList) {
			System.out.println("Printing the sold "+product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}

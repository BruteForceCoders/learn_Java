package ThreadBasics;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task taskRunnner1 = new Task();
		taskRunnner1.start();
		System.out.println("Hello there!...");
		Task taskRunnner2 = new Task();
		taskRunnner2.start();
	}

}

class Task extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println(i);
		}
	}
}

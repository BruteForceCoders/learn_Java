package ThreadBasics;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Thread1");
		Task2 taskRunner1 = new Task2();
		taskRunner1.run();
		
		System.out.println("Starting Thread2");
		Task2 taskRunner2 = new Task2();
		taskRunner2.run();
		
	}

}
class Task2 extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			try {
				Thread.sleep(10);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			
		}
	}
}

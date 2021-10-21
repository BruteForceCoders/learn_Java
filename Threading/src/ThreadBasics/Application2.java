package ThreadBasics;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Thread1");
		Task2 taskRunner1 = new Task2("Thread-A");
		Thread t1 = new Thread(taskRunner1);
		t1.start();
		
		
		System.out.println("Starting Thread2");
		Task2 taskRunner2 = new Task2("Thread-B");
		Thread t2 = new Thread(taskRunner2);
		t2.start();;
		
		
	}

}
class Task2 implements Runnable{
	
	public String name;
	
	
	
	public Task2(String name) {
		super();
		this.name = name;
	}

	public void run() {
		Thread.currentThread().setName(this.name);
		for(int i=0;i<10;i++) {
			System.out.println("number: "+i+"-"+Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
			
		}
	}
}



//class Task2 extends Thread{
//	
//	public String name;
//	
//	
//	
//	public Task2(String name) {
//		super();
//		this.name = name;
//	}
//
//	public void run() {
//		Thread.currentThread().setName(this.name);
//		for(int i=0;i<10;i++) {
//			System.out.println("number: "+i+"-"+Thread.currentThread().getName());
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			};
//			
//		}
//	}
//}

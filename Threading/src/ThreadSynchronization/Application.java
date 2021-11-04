package ThreadSynchronization;

import java.util.Iterator;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence sequence = new Sequence();
		for(int i=0;i<100;i++) {
			System.out.println(sequence.getNext());
		}
		
		Worker worker1 = new Worker(sequence);
		worker1.start();
		
		Worker worker2 = new Worker(sequence);
		worker2.start();
		
		

	}

}
class Worker extends Thread{
	Sequence sequence = null;
	
	
	public Worker(Sequence sequence) {
		super();
		this.sequence = sequence;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+" got value: "+sequence.getNext());
		}
	}
}
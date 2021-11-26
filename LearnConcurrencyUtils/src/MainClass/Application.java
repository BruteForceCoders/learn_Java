package MainClass;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import ProducerConsumer.Consumer;
import ProducerConsumer.Producer;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("the program starts running....");
		BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<Integer>(5);
		Thread t1 = new Thread(new Producer(questionQueue));
		Thread t2 = new Thread(new Consumer(questionQueue));
		
		t1.start();
		t2.start();
		
	}

}

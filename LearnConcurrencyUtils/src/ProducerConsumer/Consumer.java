package ProducerConsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	BlockingQueue<Integer> questionQueue;
	
	public Consumer(BlockingQueue<Integer> questionQueue) {
		super();
		this.questionQueue = questionQueue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(1<20) {
			
		i++;
		try {
			System.out.println("Ansered new Question: "+questionQueue.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
		
	}

}

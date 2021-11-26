package ProducerConsumer;

import java.util.concurrent.BlockingQueue;
 
public class Producer implements Runnable {
	
	int questionNo;
	BlockingQueue<Integer> questionQueue;
	
	

	public Producer(BlockingQueue<Integer> questionQueue) {
		super();
		this.questionQueue = questionQueue;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i= 0;
		while(i<20) {
			i++;
			
			try {
				synchronized (this) {
					int nextQuestion = questionNo++;
					System.out.println("Got new Question: "+nextQuestion);
					questionQueue.put(nextQuestion);
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	
}

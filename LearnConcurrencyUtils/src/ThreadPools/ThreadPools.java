package ThreadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable processor1 = new MessageProcessor(2);
		executor.execute(processor1);
		
		Runnable processor2 = new MessageProcessor(2);
		executor.execute(processor2);
		
		Runnable processor3 = new MessageProcessor(2);
		executor.execute(processor3);
		
		Runnable processor4 = new MessageProcessor(2);
		executor.execute(processor4);
		
		executor.shutdown();
		
		try {
			executor.awaitTermination(20, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Submitted All the task.");
		
	}

}

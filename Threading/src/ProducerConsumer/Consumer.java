package ProducerConsumer;

import java.util.List;

public class Consumer implements Runnable {

	List<Integer> questionList = null;
	final int LIMIT = 5;
	private int questionNo;

	public Consumer(List<Integer> questionList) {
		super();
		this.questionList = questionList;
	}

	public void answerQuestion() throws InterruptedException {
		synchronized (questionList) {

			while (questionList.isEmpty()) {
				System.out.println("No Question to Answer.... waiting for producer to get questions");
				questionList.wait();
			}
		}
		
		synchronized (questionList) {
			
				Thread.sleep(5000);
				System.out.println("ANSWERED Question :"+questionList.remove(0));
				questionList.notify();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				answerQuestion();
			} catch (InterruptedException e) {
			}
		}
	}

}

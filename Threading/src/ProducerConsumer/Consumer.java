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

	public void answerQuestion(int questionNo) throws InterruptedException {
		synchronized (questionList) {

			while (questionList.isEmpty()) {
				System.out.println("No Question to Answer.... waiting for producer to get questions");
				questionList.wait();
			}
		}
		
		synchronized (questionList) {
			
				System.out.println("New Question :"+questionNo);
				questionList.add(questionNo);
				Thread.sleep(100);
				questionList.notify();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				readQuestion(questionNo++);
			} catch (InterruptedException e) {
			}
		}
	}

}

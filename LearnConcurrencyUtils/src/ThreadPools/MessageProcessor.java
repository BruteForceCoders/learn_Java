package ThreadPools;

public class MessageProcessor implements Runnable{

	int message;

	public MessageProcessor(int message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" [RECEIVED] Message = "+message);
		respondtomessage();
		System.out.println(Thread.currentThread().getName()+  "(Done) Processing Message ="+message);
		
	}

	private void respondtomessage() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

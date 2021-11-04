package ThreadSynchronization;

import java.util.Iterator;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sequence sequence = new Sequence();
		for(int i=0;i<100;i++) {
			System.out.println(sequence.getNext());
		}

	}

}

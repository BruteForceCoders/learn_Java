package practice.loops;

public class LoopsPractice2 {

	public static void main(String[] args) {
		
		int count= 0;
		
		for(int i =0;i<=100;i++) {
			System.out.println(i);
			int temp = count +i;
			count = temp;
		}
	}

}

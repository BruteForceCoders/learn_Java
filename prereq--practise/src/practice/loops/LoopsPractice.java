package practice.loops;

public class LoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Aaron Sam";
//		String str = "We have a large inventory of things in our warehouse"
//				+ " falling in the category:apperal and the slightly were in "
//				+ "demand category:makeup along with the category:furniture and -....";
//		printCategories(str);
		for(int i = name.length()-1;i>=0;i--) {
			System.out.println("Char"+name.charAt(i));
		}
		for(int i = 0;i<=100;i+=2) {
//			if(i%2==0) {
//				System.out.println("Even : "+i);
//			}
			System.out.println(i);
		}
		
	}
//	public static void printCategories(String str) {
////		System.out.println(str.length());
////		System.out.println(str.indexOf("category",135));
////		System.out.println(str.substring(68,85));
////		System.out.println(str.substring(117,132));
////		System.out.println(str.substring(148,166));
////	
//		int i = 0;
//		while(true) {
//			int found = str.indexOf("category:",i);
//			if(found == -1) {
//				break;
//			}
//			int start = found+9;
//			int end = str.indexOf(" ",start);
//			System.out.println(str.substring(start, end));
//			i = end+1;
//		}
//		
//		}
	

}

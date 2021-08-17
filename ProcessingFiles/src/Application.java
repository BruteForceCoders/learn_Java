import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the name: ");
//		String text = sc.nextLine();
//		System.out.println(text);
		try {
		File file = new File("myfile.txt");
		
		
		Scanner	input = new Scanner(file);
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not find");
//			e.printStackTrace();
		}
		MyFileUtils myUtils = new MyFileUtils();
		try {
			System.out.println(myUtils.subtracttwonums(15));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
;	}

}

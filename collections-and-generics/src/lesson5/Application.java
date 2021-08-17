package lesson5;


import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, String> dictionary = new TreeMap<String, String>();
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brillaint", "exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary.put("Confidence", "the feeling or belief that one can have faith in or rely on someone or something.");
		
//		for (String word : dictionary.keySet()) {
//			System.out.println(word+"  : "+dictionary.get(word));
//		}
		
		
		for(Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}

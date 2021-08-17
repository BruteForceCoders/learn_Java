package com.aaron.learningfilereader;

class MyClass implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing!");
	}
	
}

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(MyClass var = new MyClass();){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

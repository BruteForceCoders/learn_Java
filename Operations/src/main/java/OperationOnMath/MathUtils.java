package OperationOnMath;

public class MathUtils {

	public int add(int a,int b) {
		return a+b;
	}
	
	public int divide(int a,int b) {
		return a/b;
	}
	
	public int findCircleArea(double r) {
		return (int) (Math.PI * Math.pow(r, 2));
	}
}

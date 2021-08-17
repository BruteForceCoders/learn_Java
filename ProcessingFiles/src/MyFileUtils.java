import com.aaron.exceptions.FooRuntimeException;

public class MyFileUtils {
	public int subtracttwonums(int num) throws Exception {
		if(num<10) {
			throw new FooRuntimeException("THe number was smaller than 10");
		}
		return num-10;
	}
	
}

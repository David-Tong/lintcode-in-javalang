import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;

public class Solution {
	public static Number upperLimit(Info<? extends Number> info) {
		return info.get();
	}
	
	public static Object lowerLimit(Info<? super String> info) {
		return info.get();
	}
}

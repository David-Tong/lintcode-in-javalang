import java.math.BigDecimal;
import java.util.*;

public class Solution {
	// write your code here
	public<T> Double numberSummation(T num1, T num2) {
		BigDecimal num = new BigDecimal(num1.toString()).add(new BigDecimal(num2.toString()));
		return num.doubleValue();
	}
}
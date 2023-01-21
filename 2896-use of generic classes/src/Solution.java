import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.*;

public class Solution<T> {
	private T var;
	
	public void setVar(T var) {
		this.var = var;
	}
	
	public T getVar() {
		return var;
	}
}	
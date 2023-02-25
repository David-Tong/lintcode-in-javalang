import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.*;

public class Solution<T> {
	
	private T[] arr;

    @SuppressWarnings("unchecked")
	public Solution(Class<T> cls, int size) {
    	this.arr = (T[]) Array.newInstance(cls, size);
    }
    
    public void initArrData(T[] arr) {
    	for (int i=0; i<arr.length; i++) {
    		this.arr[i] = arr[i];
    	}
    }
    
    public T[] getArr() {
    	return this.arr;
    }
    
}

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.*;

public class Solution<T> {

    public Containers<T> initContainers(T t){
        // write your code here
		Containers<T> c = new Containers<T>();
		c.set(t);
		return c;
    }
    
}

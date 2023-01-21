import java.util.*;

public class Solution {

    public List<Integer> removeNumber(List<Integer> list) {
    	Iterator<Integer> iter = list.iterator();
    	while (iter.hasNext()) {
    		Integer number = iter.next();
    		// containing 3
    		if (number.toString().contains("3")) {
    			iter.remove();
    		// multiples of 3
    		} else if (number % 3 == 0) {
    			iter.remove();
    		}
    	}
        return list;
    }
}

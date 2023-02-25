import java.util.*;

public class Solution {

    public List<Integer> largestNumber(List<Integer> list) {
    	Iterator<Integer> iter = list.iterator();
    	int prev = iter.next();
    	while (iter.hasNext()) {
    		int curr = iter.next();
    		if (curr <= prev) {
    			iter.remove();
    		} else {
    			prev = curr;
    		}
    	}
    	return list;
    }
}
import java.util.*;

public class Solution {
    public Map<Integer, List<Integer>> orderByFrequency(int[] nums) {
        // write your code here
    	Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
    	for (int num : nums) {
    		if (counter.containsKey(num)) {
    			counter.put(num, counter.get(num) + 1);
    		} else {
    			counter.put(num, 1);
    		}
    	}
    	
    	Map<Integer, List<Integer>> ans = new TreeMap<Integer, List<Integer>>(Collections.reverseOrder());
    	for (Integer key : counter.keySet()) {
    		Integer count = counter.get(key);
    		if (ans.containsKey(count)) {
    			ans.get(count).add(key);
    		} else {
    			List<Integer> list = new ArrayList<Integer>();
    			list.add(key);
    			ans.put(count, list);
    		}
    	}
    	
    	return ans;
    }
    
}
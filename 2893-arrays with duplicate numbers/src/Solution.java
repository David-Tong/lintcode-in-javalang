import java.util.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // write your code here
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
        	if (set.contains(num)) {
        		return true;
        	} else {
        		set.add(num);
        	}
        }
        return false;
    }
}
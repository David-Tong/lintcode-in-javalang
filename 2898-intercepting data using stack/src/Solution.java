import java.util.*;

public class Solution {
    public boolean isOutByStack(int[] nums) {
        // write your code here
    	
    	// short cut
    	if (nums.length <= 1) {
    		return true;
    	}
    	
    	int L = nums.length;
    	int num = 1;
    	int index = 0;
    	
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	while (num <= L) {
    		if (nums[index] == num) {
    			index++;
    			num++;
    		} else if (stack.size() > 0 && nums[index] == stack.peek()) {
    			stack.pop();
    			index++;
    		} else {
    			stack.add(num);
    			num++;
    		}
    	}
    	
    	while (stack.size() > 0) {
    		if (nums[index] == stack.peek()) {
    			stack.pop();
    			index++;
    		} else {
    			return false;
    		}
    	}
    	
    	return true;
    }
}
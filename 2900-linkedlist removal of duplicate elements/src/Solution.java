import java.util.Iterator;
import java.util.LinkedList;

class Solution {
	
	public static LinkedList<String> Weighting(LinkedList<String> list) {
		// write your code here
		LinkedList<String> ans = new LinkedList<String>();
		for (String item: list) {
			if (!ans.contains(item)) {
				ans.add(item);
			}
		}
		return ans;
	}

}

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * @param str: Limit the string to be longer than subStr
     * @param subStr: Strings shorter than str
     * @return subStr appears as an index array in Str
     */
    public int[] getIndexArray(String str, String subStr) {
        // write your code here
    	List<Integer> indexes = new ArrayList<Integer>();
    	int start = 0;
    	int index = 0;
    	while (index != -1) {
    		index = str.indexOf(subStr, start);
    		if (index != -1) {
    			indexes.add(index);
    			start = index + 1;
    		}
    	} 
    	
    	int[] ans = {-1};
    	if (indexes.size() != 0) {
    		ans = new int[indexes.size()];
    		for (int i=0; i<indexes.size(); i++) {
    			ans[i] = indexes.get(i);
    		}
    	}
    	return ans;
    }
}

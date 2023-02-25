import java.util.*;

public class Solution {
    public static Map<String, Integer> sortMap(Map<String, Integer> map) {
        // write your code here
        Map<String, Integer> ans = new TreeMap<String, Integer>();
        for (String key : map.keySet()) {
        	ans.put(key, map.get(key));
        }
        return ans;
    }

}
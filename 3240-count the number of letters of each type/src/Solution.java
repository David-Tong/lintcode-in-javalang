import java.util.*;

public class Solution {

    /**
     * Keys in Map:
     * Letters
     * Spaces
     * Numbers
     * Others
     */
    public Map<String, Integer> getLettersCounts(String s) {

        int nums = 0;
        int letters = 0;
        int spaces = 0;
        int others = 0;

        Map<String, Integer> map = new HashMap<>();
        // write your code here
        for (int i=0; i<s.length(); i++) {
        	Character ch = s.charAt(i);
        	if (Character.isDigit(ch)) {
        		nums++;
        	} else if (Character.isSpace(ch)) {
        		spaces++;
        	} else if (Character.isLetter(ch)) {
        		letters++;
        	} else {
        		others++;
        	}
        }
        
        if (nums > 0) {
        	map.put("Numbers", nums);
        }
        if (others > 0) {
        	map.put("Others", others);
        }
        if (letters > 0) {
        	map.put("Letters", letters);
        }
        if (spaces > 0) {
        	map.put("Spaces", spaces);
        }
        
        return map;
    }

}
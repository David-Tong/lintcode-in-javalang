import java.util.*;

public class Solution {

    public void sortByLength(String[] strArr) {
        // --- Write your code here ---
    	Arrays.sort(
    		strArr,
    		(String str1, String str2) -> str1.length() - str2.length()
    	);
    	
    	for (String str: strArr) {
    		System.out.println(str);
    	}
    }

}
import java.util.*;

public class Solution {
    public int[] replacement(int[] arr1, int[] arr2) {
        // -- write your code here --
    	for (int i=0; i<arr2.length; i++) {
			arr1[arr1.length - 1 - i] = arr2[arr2.length - 1 - i];
		}
    	return arr1;
    }
}
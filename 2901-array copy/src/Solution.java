import java.util.*;

public class Solution {
	// write your code here
	public <T> void copy(T[] arr1, T[] arr2) {
		for (int index=0; index<arr1.length; index++) {
			arr2[index] = arr1[index];
		}
	}
}
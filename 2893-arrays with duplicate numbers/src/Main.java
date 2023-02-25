import java.lang.reflect.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

		String[] str = sc.nextLine().replace("[", "").replace("]", "").trim().split(",");
		int[] nums = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			try {
				nums[i] = Integer.parseInt(str[i].trim());
			} catch (Exception e) {
				nums[i] = 0;
			}
		}
		Solution solution = new Solution();
		System.out.println(solution.containsDuplicate(nums));

        sc.close();
	}
}
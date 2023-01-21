import java.lang.reflect.*;
import java.util.*;


public class Main {
	public static void main(String[] args){
        /**
		Scanner sc = new Scanner(System.in);

		String in = sc.nextLine();
		String[] str = in.replace("[", "").replace("]", "").trim().split(",");
		int[] nums = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			try {
				nums[i] = Integer.parseInt(str[i].trim());
			} catch (Exception e) {
				nums[i] = 0;
			}
		}**/
		Solution solution = new Solution();
		//int[] nums = {3, 2, 1, 4};
		int[] nums = {3, 2, 1, 7, 8, 4, 5, 6};
		System.out.println(solution.isOutByStack(nums));

        //sc.close();
	}
}
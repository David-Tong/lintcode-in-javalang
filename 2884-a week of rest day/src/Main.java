import java.lang.reflect.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

		String[] days = sc.nextLine().trim().split(" ");

		List<WeekDay> list = new ArrayList<>();
		for (String s : days) {
			WeekDay w = WeekDay.valueOf(s);
			list.add(w);
		}
		EnumMap<WeekDay, Integer> result = Solution.getRestDays(list);
		System.out.println(result);

        sc.close();
	}
}
import java.util.*;

public class Solution {
    public static EnumMap<WeekDay, Integer> getRestDays(List<WeekDay> list) {
        // write your code here
    	EnumMap<WeekDay, Integer> ans = new EnumMap<>(WeekDay.class);
        for (WeekDay weekday : list) {
        	if (weekday == WeekDay.SAT || weekday == WeekDay.SUN) {
        		if (ans.containsKey(weekday)) {
        			ans.put(weekday, ans.get(weekday) + 1);
        		} else {
        			ans.put(weekday, 1);
        		}
        	}
        }
        return ans;
    }

}
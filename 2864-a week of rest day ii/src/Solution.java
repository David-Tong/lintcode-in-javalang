public class Solution {
    public static boolean isRestDay(WeekDay day) {
        // write your code here
        if (day == WeekDay.SAT || day == WeekDay.SUN) {
        	return true;
        } else {
        	return false;
        }
    }
}
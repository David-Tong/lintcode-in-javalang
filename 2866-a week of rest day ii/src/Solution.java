import java.util.EnumMap;

public class Solution {
    public static EnumMap<WeekDay, String> getDays() {
        // write your code here
        EnumMap<WeekDay, String> map = new EnumMap<>(WeekDay.class);
        map.put(WeekDay.SUN, "rest");
        map.put(WeekDay.MON, "work");
        map.put(WeekDay.TUE, "work");
        map.put(WeekDay.WED, "work");
        map.put(WeekDay.THU, "work");
        map.put(WeekDay.FRI, "work");
        map.put(WeekDay.SAT, "rest");
        return map;
    }
}
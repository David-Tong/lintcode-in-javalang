import java.util.*;
import java.util.Map.Entry;


public class Main {
	public static void main(String[] args) throws Exception {
		
		EnumMap<WeekDay, String> map = Solution.getDays();
		for (Entry<WeekDay, String> i : map.entrySet()) {
			System.out.println(i.getKey() + " is a " + i.getValue() + " day.");
		}
		
	}

}
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		WeekDay[] work = WeekDay.getWorkDay();
		WeekDay[] rest = WeekDay.getRestDay();

		StringBuilder sb = new StringBuilder();
		sb.append("WorkDay: \n");
		for (WeekDay d : work) {
			sb.append(d + " is a " + d.getDay() + ".\n");
		}
		sb.append("RestDay: \n");
		for (WeekDay d : rest) {
			sb.append(d + " is a " + d.getDay() + ".\n");
		}
		System.out.print(sb.toString());
	}

}
public class Main {
	public static void main(String[] args) throws Exception {
		WeekDay[] wd = WeekDay.values();
		for (int i = 0; i < WeekDay.values().length; i++) {
			if (Solution.isRestDay(wd[i])) {
				System.out.println(wd[i] + " is a rest day.");
			}
        }
		
	}
}
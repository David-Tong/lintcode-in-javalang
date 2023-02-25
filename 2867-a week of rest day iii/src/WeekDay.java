public enum WeekDay {
	SUN("Restday"),
	MON("Workday"),
	TUE("Workday"),
	WED("Workday"),
	THU("Workday"),
	FRI("Workday"),
	SAT("Restday");
	
    private final String day;
    
    // write your code here
	private WeekDay(String day) {
		this.day = day;
	}
	
	public String getDay() {
		return this.day;
	}
    
    public static WeekDay[] getWorkDay() {
    	WeekDay[] workdays = {MON, TUE, WED, THU, FRI};
    	return workdays;
    }
    public static WeekDay[] getRestDay() {
        WeekDay[] restdays = {SUN, SAT};
        return restdays;
    }
}
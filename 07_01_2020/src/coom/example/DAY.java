package coom.example;

public enum DAY {
	SUN("Today is holiday ",1),
	MON("Today is monday" , 2),
	TUE("Today is tuesday" , 3),
	WED("Today is wednesday" , 4),
	THU("Today is thrusday" , 5),
	FRI("Today is friday" , 6),
	SAT("Today is HOLIDAY" , 7);
	private final String name;
	private final int number;

	private DAY(String n, int r) {

		number = r;
		name = n;
	}

	public String getName() {
		return name;
	}

	public int getnumber() {
		return number;
	}
}

package coom.task;

public class Counter {
	private static Integer count;
	private String temp;
	private final int MAX; 

	class InnerCounter{
        public void add(int a,int b)
        {
        	System.out.println("\n"+(a+b));
        }
	}
	public Counter() {
		super();
		MAX = 1000;
	}
	static {
		count = 0;
	}
	public Counter(String temp) {
		super();
		MAX=100;
		count++;
		this.temp = temp;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "count of object is:"+temp+count;
	}
	public static String displayCount() {
	return count.toString();	
		
	}
	public void displayMAX() {
		
		System.out.println(MAX);
	}
	
}

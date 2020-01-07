package coom.task;

public class Box {
	private Integer wInt;
	private int pInt;
	
public Box(Integer wInt, int pInt) {
		super();
		this.wInt = wInt;
		this.pInt = pInt;
	}

@Override
public String toString() {
 return"box[wInt=" + wInt+"pInt="+pInt+"]";
}

public void display()
         {
	int tempP = wInt; //auto unboxing
	Integer tempW = pInt;//auto boxing
	System.out.println(this);
System.out.printf("after unboxing/boxing : %d ,%d" , wInt,pInt );
         }
}

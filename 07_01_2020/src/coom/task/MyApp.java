package coom.task;

import java.time.LocalDate;
import java.util.UUID;

import javax.swing.Box;

public class MyApp {
public static void main (String[] args)
        {
/*	Task myTask1 = new Task(UUID.randomUUID().toString(),"JAVA TRAINING",LocalDate.now(),true) ;
	Task myTask2= new Task(UUID.randomUUID().toString(),"JAVA TRAINING",LocalDate.now(),true);
	System.out.println("Task Details: \n"+myTask1+"\nTask2 Details: \n"+myTask2);
	System.out.println(myTask1==myTask2);
	System.out.println(myTask1.equals(myTask2));
*/
	Box demo = new Box(new Integer(100),200);
	((Object) demo).display();
	

	
        }
}

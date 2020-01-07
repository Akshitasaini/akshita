package coom.task;

import java.time.LocalDate;
import java.util.UUID;

public class MyApp {
public static void main (String[] args)
        {
	Task myTask1 = new Task(UUID.randomUUID().toString(),"JAVA TRAINING",LocalDate.now(),true) ;
	Task myTask2= new Task(UUID.randomUUID().toString(),"JAVA TRAINING",LocalDate.now(),true);
	System.out.println("Task Details: \n"+myTask1+"\nTask2 Details: \n"+myTask2);
	System.out.println(myTask1==myTask2);
	System.out.println(myTask1.equals(myTask2));


	
        }
}

package comm.taskk;
import package coom.taskk;
import java.util.Scanner;


public class test {
	/*private static final int MAX=5;
	public static Scanner scanner = new Scanner(System.in);
	private static String taskName;
	*/
	public static void main (String[] args)
	{
		/*int counter = -1;
			ToDo todos[] = new ToDo[MAX];
			int choice = 0;
			ToDo todo = new ToDo();
			ToDo tempTodo=null;
do {
	System.out.println("1.add new todo.");
	System.out.println("2.display all todo.");
	System.out.println("0.exit.");
	System.out.println("SELECT YOUR CHOICE");
	choice = scanner.nextInt();
	switch(choice) {
case 1:
    if(counter ==MAX-1)
    {
    	System.out.println("cannot add a todo");
        break;   	
    }
	System.out.print("task author: ");
	String author=scanner.next();
    System.out.print("task name");
    String taskName=scanner.next();
    System.out.print("is Completed?");
    boolean isCompleted=scanner.hasNextBoolean();
    todo=todo.createToDo(author,taskName,isCompleted);
	todos[++counter]=tempTodo;
	break;
case 2:
	for(int i=0;i<=counter;i++)
	{
		System.out.println("\n"+todos[i].getToDoDetails());
	}
	break;
case 0:
	System.exit(0);
	System.out.println("bye!!!!");

default:
	System.out.println("invalid choice");
	break;
}

}
	while(choice!=0);*/
		//Person thePerson=new Person();
		//System.out.println(thePerson);
       /*MyArray myarray = new MyArray();
       myarray.createArray();
       myarray.displayArray();*/
		ArrayString arrayString = new ArrayString();
		arrayString.convertStringToArray("Hello World");
		arrayString.displayConvertedArray();

}
	}
		
		
		
	/*	ToDo todo=new ToDo(new Task());

	todo.createToDo("AKSHITA","JAVA",true);
	System.out.println(todo.getToDoDetails());*/



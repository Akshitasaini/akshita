package comm.taskk;


import java.util.UUID;

import comm.task.Task;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ToDo {
	private Task task;
    private String todoId;
	//private RandomFortuneService fortuneService;

    private boolean isCompleted;
    private LocalDate date;
     
	public ToDo(Task task/*, RandomFortuneService fortuneService*/) {
		this.task = task;
	//	this.fortuneService = fortuneService;
	}
public ToDo createToDo(String author,String taskName,boolean isCompleted)
{
	/*if (task == null) {
		System.out.println("can't create task existing system");
		System.exit(0);
	}
	if(fortuneService==null)
	{
		System.out.println("bad day today. try again.");
		System.exit(0);

		
	}
	*/
	//System.out.println("Your Daily Fortune>>> "+fortuneService.getDailyFortune());

	System.out.println("creating a new task.");

	task = new Task();
	ToDo todo = new ToDo();
   task.createTask(author,taskName);	
   System.out.println("Succesfully created task\ncreating new todo..");
   todo.setTodoId(UUID.randomUUID().toString());
   todo.setDate(LocalDate.now());
   todo.setCompleted(isCompleted);
   todo.setTask(task);
   return todo;
}

	public String getToDoDetails()
	{
		return task.getTaskDeatilsI()+"todo id :"+getTodoId()+"todo date:"+getDate()+"completed:"+isCompleted;
	}
	
	
}

package coom.task;

import java.time.LocalDate;

public class Task {
	private String taskId;
	private String taskName;
	private LocalDate taskDate;
	private boolean isCompleted;
	 public Task(){
		 super();
	        }
	public Task(String taskId, String taskName, LocalDate taskDate, boolean isCompleted) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDate = taskDate;
		this.isCompleted = isCompleted;
	}
	@Override
	public String toString() {
		return "Task Id=" + taskId + ", Task Name=" + taskName + ", Task Date=" + taskDate + ", Is Completed="
				+ isCompleted;
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean equals(Object obj) {
		Task theTask = null;
		boolean isEqual=false;
		if (obj instanceof Task) {
			theTask = (Task) obj;
		}
		if((this.getTaskName()==theTask.getTaskName()) &&
				(this.taskDate.equals(theTask.getTaskDate())) && (this.isCompleted()==theTask.isCompleted()))
		{
			isEqual=true;
		}
		return isEqual;
	}
	@Override

	public int hashCode() {
		return super.hashCode();
		
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public LocalDate getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	}
	

	


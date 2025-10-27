package cote.exam1013;

public class Todo {
	public String time;
	public String title;
	public String memo;
	
	public Todo(String time, String title, String memo) {
		this.time = time;
		this.title = title;
		this.memo = memo;
	}
	
	public String loadTodo() {
		return title + "\n" + memo + "\n" + time;
		
	}
	
	
}

package org.example;

import java.util.List;

public class Todo{
	private List<TodoItem> todo;

	public void setTodo(List<TodoItem> todo){
		this.todo = todo;
	}

	public List<TodoItem> getTodo(){
		return todo;
	}
}
package model;

import java.util.ArrayList;
import java.util.Stack;

public class Elevator{
	
	private Stack<User> user;
	private Office of;

	
	public Elevator(Stack<User> user) {
		user = new Stack();	
		
	}

	public Stack<User> getUser() {
		return user;
		
	}	
	
	public void addUser(User u) {
		user.push(u);
	}
	
	public void moveToDestiny() {
		
		ArrayList<User> aux = new ArrayList<User>();
		
		for(int i=0; i<user.size(); i++) {
			
			User us = new User(null,null,null,null);
			us = user.pop();
			aux.add(us);
			
		}
		
			
	}

}

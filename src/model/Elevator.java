package model;

import java.util.ArrayList;
import java.util.Stack;

public class Elevator{
	
	private Stack<User> user;
	private Office of;
	ArrayList<User> aux = new ArrayList<User>();
	
	public Elevator() {
		user = new Stack();	
		
	}

	public Stack<User> getUser() {
		return user;
		
	}	
	
	public void addUser(User u) {
		user.push(u);
	}
	
	public void moveToDestiny() {
		
		for(int i=0; i<user.size(); i++) {
			
			User us = new User(null,null,null,null);
			us = user.pop();
			aux.add(us);
			
		}
		
			
	}

	public void printMoves() {
		for(int i=0;i<aux.size();i++) {
			if(aux.get(i)!=null) {
				System.out.println();aux.get(i).printMessage();
			}
			
		}
		
		
	}

}

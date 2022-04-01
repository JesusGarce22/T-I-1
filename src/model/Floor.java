package model;

import java.util.ArrayList;
import java.util.Hashtable;

public class Floor<T> {

	private T id;
	private Hashtable office;
	private ArrayList<User> users;
	
	public Floor(T id, Hashtable office,ArrayList<User> users) {
		this.id = id;
		this.office = office;
		this.users=users;
	}
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	public Hashtable getOffice() {
		return office;
	}
	public void setOffice(Hashtable office) {
		this.office = office;
	}
	public ArrayList<User> getUsers() {
		return users;
	}
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	
}

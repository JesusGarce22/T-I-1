package model;

import java.util.Queue;

public class Office<T> {

	private T id;
	private User user;
	private boolean status;
	
	public Office(T id, User user) {
		this.id = id;
		this.user = user;
		this.status = true;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}

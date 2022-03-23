package model;

public class Office<T> {

	private T id;
	private User user;
	private T status;
	
	public Office(T id, User user, T status) {
		this.id = id;
		this.user = user;
		this.status = status;
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

	public T getStatus() {
		return status;
	}

	public void setStatus(T status) {
		this.status = status;
	}
	
	
}

package model;

public class User<T> {
	
	private T name;
	private Office destination;
	private T itIsNow;
	
	public User(T name, Office destination, T itIsNow) {
		this.name = name;
		this.destination = destination;
		this.itIsNow = itIsNow;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public Office getDestination() {
		return destination;
	}

	public void setDestination(Office destination) {
		this.destination = destination;
	}

	public T getItIsNow() {
		return itIsNow;
	}

	public void setItIsNow(T itIsNow) {
		this.itIsNow = itIsNow;
	}
	
	public void printMessage() {
		System.out.println(name+" moves to the office "+destination.getId());
	}
}

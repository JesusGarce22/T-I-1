package model;

public class User<T> {

	private T name;
	private T destination;
	private T itIsNow;
	private Node now;

	public User(T name,T itIsNow, T destination, Node n) {
		this.name = name;
		this.destination = destination;
		this.itIsNow = itIsNow;
		now=n;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getDestination() {
		return destination;
	}

	public void setDestination(T destination) {
		this.destination = destination;
	}

	public T getItIsNow() {
		return itIsNow;
	}

	public void setItIsNow(T itIsNow) {
		this.itIsNow = itIsNow;
	}

	public void printMessage() {
		if(now!=null) {
			System.out.println(name+" moves to the office "+destination+" and to floor "+ now.getId());

		}
	}

	public 	Node getNow() {
		return now;
	}

	public void setNow(Node now) {
		this.now = now;
	}


}

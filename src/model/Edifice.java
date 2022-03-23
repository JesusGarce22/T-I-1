package model;

import java.util.Stack;

public class Edifice<T> {

	private T id;
	private Office office;
	private Stack<T> elevator;
	
	public Edifice(T id, Office office, Stack<T> elevator) {
		this.id = id;
		this.office = office;
		this.elevator = elevator;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public Stack<T> getElevator() {
		return elevator;
	}

	public void setElevator(Stack<T> elevator) {
		this.elevator = elevator;
	}
	
	
}

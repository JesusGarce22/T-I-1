package model;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Edifice<T> {

	private T id;
	private Hashtable office;
	private Stack<T> elevator;
	private Queue<T> floors;
	
	public Edifice(T id, Hashtable office, Stack<T> elevator,Queue<T> floors) {
		this.id = id;
		this.office = office;
		this.elevator = elevator;
		this.floors = floors;
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

	public Stack<T> getElevator() {
		return elevator;
	}

	public void setElevator(Stack<T> elevator) {
		this.elevator = elevator;
	}

	public Queue<T> getFloors() {
		return floors;
	}

	public void setFloors(Queue<T> floors) {
		this.floors = floors;
	}
	
	
}

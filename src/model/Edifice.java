package model;

import java.util.ArrayList;
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
	
	public void printInfo() {
		System.out.println(id);
		System.out.println();
		ArrayList<T> Discarded=new ArrayList();
		for(int i=0;i<floors.size();i++) {
			
			Discarded.add(floors.poll());
			Floor n=(Floor) Discarded.get(i);
			System.out.println(n.getId());
		}
		
		System.out.println();
		
		java.util.Enumeration e=office.keys();

		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}

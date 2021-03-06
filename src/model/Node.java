package model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Queue;
import java.util.Stack;

public class Node<T> {

	private Node next;
	private Node prev;
	
	private T id;
	private Hashtable office;
	private Elevator elevator;
	private Queue<T> floors;
	private Queue<String> people;
	
	public Node(T id, Hashtable office, Elevator elevator,Queue<T> floors,Queue<String> people) {
		this.id = id;
		this.office = office;
		this.elevator = elevator;
		this.floors = floors;
		this.people = people;
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

	public Elevator getElevator() {
		return elevator;
	}

	public void setElevator(Elevator elevator) {
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
		
		System.out.println("Floors");
		for(int i=0;i<floors.size();i++) {
			
			Discarded.add(floors.poll());
			Floor n=(Floor) Discarded.get(i);
			System.out.println(n.getId());
		}
		
		System.out.println();
		
		java.util.Enumeration e=office.keys();

		while(e.hasMoreElements()) {
			System.out.println("Office");
			System.out.println(e.nextElement());
		}
		
		
	}
	public void statusFinish() {
		System.out.println(people);
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
		
}

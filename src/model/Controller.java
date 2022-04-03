package model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

import Exception.UserInvalideteEntraisException;
import Exception.WrongEntriesException;

public class Controller<T> {

	private Node first;
	private Node last;
	
	public void star(T id, T numUser,int numFloors,int numOffice,String[] users)throws UserInvalideteEntraisException{
		Hashtable office=new Hashtable();
		Queue<Floor> cola=new LinkedList();
		ArrayList<Floor> flat = new ArrayList<Floor>();

		int totalOffice=numFloors*numOffice;
		int aux=numFloors;
		int itIsNow=0; // piso donde se encuentra el usuario
		User p = null;

		for(int i=1;i<totalOffice+1;i++) {
			office.put(i, new Office(1, null, true));
		}

		for(int i=1;i<=numFloors;i++) {
			Floor n = new Floor(i,office,null);
			flat.add(n);
		}

		cola.addAll(flat);
		//System.out.println(cola.size());
		for(int i=0;i<users.length;i++) {
			
			String r=users[i];
			String[] parts=r.split(" ");
			
			if(parts.length!=3 || Integer.parseInt(parts[1])!=0 || Integer.parseInt(parts[2])!=0) {
				throw new UserInvalideteEntraisException();
			}else {
			String name=parts[0];
			itIsNow=Integer.parseInt(parts[1]);
			int destination=Integer.parseInt(parts[2]);
			
			p=new User(name,itIsNow,destination,null);
			}
		}

		Node m=new Node(id, office, null,cola);
		insertLast(m);
		Node x=searchValue(id);
		p.setNow(x);
		
		printList();
	}
	
	public void insertFirst(Node node) {
		if(first == null) {
			first = node;
		}else {
			//node entrante es el nuevo primero
			//El nodo que era el primero ahora es el segundo
			Node second = first;
			first = node;
			first.setNext(second);
		}
	}
	
	public void insertLast(Node node) {
		if(first == null) {
			first = node;
			last = node;
		}else {
			last.setNext(node);
			last = node;
		}
	}

	public void printList() {
		if(first == null) {
			System.out.println("Lista vacia");
			return;
		}
		
		Node current = first;
		System.out.println(current.getId());
		while(current.getNext() != null) {
			current = current.getNext();
			System.out.println(current.getId());
		}
	
	}
	
	public Node searchValue(T id) {
		Node current = first;
		while(current.getNext() != null) {
			current = current.getNext();
			if(current.getId().equals(id)) {
				return current;
			}
		}
		return null;
	}
}

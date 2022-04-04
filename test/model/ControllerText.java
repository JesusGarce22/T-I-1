package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Exception.UserInvalideteEntraisException;

public class ControllerText {

	private Controller c;

	private Node first;
	private Node last;

	public void setupScenary1() {
		c=null;
	}

	public void setupScenary2() {
		c=new Controller();

	}

	@Test
	public void InsertNode() {
		setupScenary2();

		String id="A";
		first=new Node(id,null,null,null);
		c.insertLast(first);

		Node x=c.searchValue(id);

		assertNotNull(first);
	}

	@Test
	public void starProgramTest() throws UserInvalideteEntraisException {
		setupScenary1();

		int numUser=3;
		String id="A";
		int numFloors=3;
		int numOffice=2;
		String[] users=new String[numUser];

		users[0]="jesus 2 1";
		users[1]="carlos 1 2";
		users[2]="cesar 4 2";

		c.star(id, numUser, numFloors, numOffice, users);
		Node t=c.getList();

		t.printInfo();
		Node current = t;
		int contador=0;
		while(current.getNext() != null) {
			current = current.getNext();
			System.out.println(contador);
			contador++;
			System.out.println(contador);
		
		}
		System.out.println(contador);
		//assertEquals(contador,0);
	}
}

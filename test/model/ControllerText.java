package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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
	public void starProgramTest() {
		setupScenary1();
		
		
	}
}

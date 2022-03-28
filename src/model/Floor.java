package model;

import java.util.Hashtable;

public class Floor<T> {

	private T id;
	private Hashtable office;
	
	public Floor(T id, Hashtable office) {
		this.id = id;
		this.office = office;
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
	
	
}

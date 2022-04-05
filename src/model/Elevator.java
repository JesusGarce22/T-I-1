package model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

public class Elevator{

	private Stack<User> user;
	private Office of;
	ArrayList<User> aux = new ArrayList<User>();

	public Elevator() {
		user = new Stack();	

	}

	public Stack<User> getUser() {
		return user;

	}	

	public void add(User x) {
		aux.add(x);
	}

	public void addUser(User u) {
		user.push(u);
	}

	public void moveToDestiny(Hashtable office) {
		ArrayList<Office> fi = new ArrayList<Office>();


		fi.addAll(office.values());
		//System.out.println(fi);
		for(int j=0; j<fi.size(); j++) {
			for(int i=aux.size()-1; i>0; i--) {
				if(aux!=null && aux.get(i).getDestination()==fi.get(j).getId()) {
					if(fi.get(j).getStatus()==false) {
						fi.get(j).setUser(aux.get(i+1));
					}else {
						fi.get(j).setUser(aux.get(i));
						fi.get(j).setStatus(false);

						//office.replace(j, null, fi.get(j));
					}
				}
			}
		}
		printMoves(fi);
	}

	public void printMoves(ArrayList<Office> fi) {
		for(int i=0;i<fi.size();i++) {
			if(fi.get(i)!=null && fi.get(i).getUser()!= null && fi.get(i).getStatus()==false) {
				System.out.println(fi.get(i).getUser().getName()+" se movio a la oficina "+fi.get(i).getId());
			}

		}


	}

}

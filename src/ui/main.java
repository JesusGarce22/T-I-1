package ui;

import java.util.*;

import Exception.*;
import model.*;

public class main {

	public static Scanner sn=new Scanner(System.in);

	public static void main(String[] args) throws WrongEntriesException{

		System.out.println("Please enter the information for star the program");
		int cant=sn.nextInt();
		sn.nextLine();

		for(int i=0;i<cant;i++) {

			String info=sn.nextLine();
			String[] parts=info.split(" ");

			if(parts.length!=4 || Integer.parseInt(parts[1])<=0 || Integer.parseInt(parts[2])<=0 || Integer.parseInt(parts[3])<=0) {
				throw new WrongEntriesException();
			}else {
				String idEdifice=parts[0];
				int numUser=Integer.parseInt(parts[1]);
				int numFloors=Integer.parseInt(parts[2]);
				int numOfficeForFloor=Integer.parseInt(parts[3]);

				int contador=0;
				String[] user=new String[numUser];

				while(numUser!=0) {
					user[contador]=sn.nextLine();
					//System.out.println(user[contador]);
					numUser--;
					contador++;
				}

				createEdifice( idEdifice,  numUser, numFloors, numOfficeForFloor,user);
				//System.out.println(idEdifice+numUser+numFloors+numOfficeForFloor);
			}
		}


	}


	public static void createEdifice(String id, int numUser,int numFloors,int numOffice,String[] users) {
		Hashtable office=new Hashtable();
		Queue<Floor> cola=new LinkedList();
		ArrayList<Floor> flat = new ArrayList<Floor>();

		int totalOffice=numFloors*numOffice;

		

		for(int i=1;i<totalOffice+1;i++) {
			office.put(i, new Office(1, null, true));
		}

		for(int i=1;i<=numFloors;i++) {
			Floor n = new Floor(i,office);
			flat.add(n);
		}

		cola.addAll(flat);
		System.out.println(cola.size());
		Edifice m=new Edifice(id, office, null,cola);
		
		//m.printInfo();
	}
}

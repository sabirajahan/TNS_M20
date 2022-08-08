package session.collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

class Address 
{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;

	Address(String n, String s, String c, String st, String cd) 
	{
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
	}

	public String toString() {
		return name + "\n" + street + "\n" + city + " " + state + " " + code;
	}
}

public class MailList
{

	public static void main(String[] args) 
	{
	LinkedList<Address> ml = new LinkedList<Address>();
		
		// add nodes to the linked list
		ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
		
		ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahome", "IL","61853"));
		
		ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

		Iterator itr = ml.iterator();
		while (itr.hasNext()) 
		{
			Object element = itr.next();
			System.out.println(element + "\n");
		}
		System.out.println();
	}

}

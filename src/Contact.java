import java.util.Scanner;

public class Contact {
	
	String name;
	String street; 
	int building; 
	/*
	 * public Contact() {};
	 */

	public Contact(){
		System.out.println("Calling Constructor 1");
		name = "invalid";
		street = "invalid";
		building = -1;
	};
	
	public Contact(String j_name){
		name = j_name;
		street = "invalid";
		building = -1;
	};
	
	public Contact(String p_name, String p_street, int p_building){
		System.out.println("Calling Constructor 2");
		name = p_name;
		street = p_street;
		building = p_building;
	};
	
	}

	




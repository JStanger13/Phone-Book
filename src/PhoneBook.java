import java.util.*;


public class PhoneBook {
	@SuppressWarnings("resource")
	public static void main (String [] args){
		//test code
		//end test code
		
		
		LinkedList<Contact> phoneBook = new LinkedList<Contact>();
		
		System.out.println("Would you like to create a new contact?");
		System.out.println("Yes or No?");
		
		String answer = new Scanner(System.in).nextLine();
		
		while(!(answer.equals("yes") || answer.equals("Yes") || answer.equals("YES") || 
				answer.equals("no") || answer.equals("No") || answer.equals("NO"))){
			
			System.out.println("Did not understand answer. Please Type Yes or No.");
			System.out.println("Would you like to create a new contact?");
			System.out.println("Yes or No?");
			
			answer = new Scanner(System.in).nextLine();
		}
		
			
			while(answer.equals("yes") || answer.equals("Yes") || answer.equals("YES")){
			Contact user = new Contact();
			
			System.out.println("Please Input Name!");
			
			user.name = new Scanner(System.in).nextLine();	
			
			
			System.out.println("Please Input Street!");
			user.street = new Scanner(System.in).nextLine();	
		
			
			System.out.println("Please Input Building Number!");
			user.building = new Scanner(System.in).nextInt();	
			
			System.out.println("");
			System.out.println("Name: " + user.name);
			System.out.println("Street: " + user.street);
			System.out.println("Building Number: " + user.building);
			
			phoneBook.push(user);
			System.out.println("");
		
			System.out.println("Would you like to create a new contact?");
			System.out.println("Yes or No?");
		
			answer = new Scanner(System.in).next();
			//error checking... don't continue until valid input
		}
			if(answer.equals("No") || answer.equals("no") || answer.equals("NO")){
				System.out.println("Have a nice day!");
			}
		
		Iterator<Contact> i = phoneBook.iterator();
		while(i.hasNext()){
			Contact temp = i.next();
			System.out.println("Contact: " + temp.name);
			System.out.println("Street: " + temp.street);
			System.out.println("Building: " + temp.building);
			System.out.println();
		}
		answer = new Scanner(System.in).next();
			}
		}


		


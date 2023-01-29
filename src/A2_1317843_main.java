import java.util.Scanner;
/********************
 * Assignment 2
 * @author mosiklam
 * @1317843
 ********************/


public class A2_1317843_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice = 0;
		
		//Computer[] computer;
		//computer = new Computer[100];
		InventoryArray comp = new InventoryArray();
		
		
		Scanner s= new Scanner(System.in);
		//Computer computer = new Computer();
		System.out.println("=====Welcome to Computer Store=====");
		
		do {
			System.out.println("1. Enter new computers (password required)");
			System.out.println("2. Change information of a computer (password required)");
			System.out.println("3. Display all computers by a specific brand");
			System.out.println("4. Display all computers under a certain a price");
			System.out.println("5. Quit");
			System.out.println("Enter your choice");
			choice = comp.checkNumber();
			
			switch (choice) {
			
				case 1:
					password();
					comp.add();
					break;
				case 2:
					password();
					comp.update();
					break;
				case 3:
					//comp.display();
					comp.findComputersBy();
					break;
				case 4:
					comp.findCheaperThan();
					break;
				case 5:
					System.out.println("Bye");
					System.exit(100);
				default:
					System.out.println("wrong choice");
					break;
			}
				
		}while(choice!=5);
		
		s.close();
		
	}
	
	
	static void password() {
		String pw="";
		int tries = 1;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("enter password  "+ tries + " times");
			pw = s.nextLine();
			
			if(pw.matches("password")) {
				System.out.println("Login success");
				return;
			}
			else {
				tries = tries+1;
				if(tries <=2) {
					
				System.out.println("wrong password try again  " );
				}
				
			}
		
		}while(pw !="password"&& tries<4  );
		System.out.println("you out of try bye");
		System.exit(0);
		s.close();
	}
	


	

}

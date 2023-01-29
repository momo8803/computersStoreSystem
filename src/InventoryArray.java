import java.util.Scanner;


public class InventoryArray {
	private int count = 0 ;
	private Computer[] comp = null;
	
//	public InventoryArray() {
//		comp = new Computer[10];
//	}
	
	public void add() {
		Scanner s = new Scanner(System.in);
		
		if(count==0) {
			System.out.println("how many array you wanna add?");
			int x = s.nextInt();
			comp = new Computer[x];
			}

			String brand;
			String model;
			long SN;
			double price;
			
			System.out.println("how many computer you wanna add?");
			int x = s.nextInt();
			if (x + count > comp.length) {
				int space;
				space = comp.length - count;
				System.out.println("list is full, only " + space + " space left");
			}
			else {
			for (int i = 0; i < x; i++) {
				
			System.out.println("======Computer "+ count + "========");
			System.out.println("enter brand: ");
			brand = s.next();
			System.out.println("enter model: ");
			model = s.next();
//			try {
			System.out.println("enter sn: ");
			SN = checkNumber();
			System.out.println("enter price: ");
			price = checkDouble();
			Computer c = new Computer();
			c.setBrand(brand);
			c.setModel(model);
			c.setSN(SN);
			c.setPrice(price);
			
			comp[count++] = c;
			System.out.println("New computer has been added");
//				} catch (Exception e) {
//					// TODO: handle exception
//					System.out.println("wrong input");
//					}
				}
			}
		}
	
	
	
	
//	public void display() {
//		if(count == 0) {
//			System.out.println("no computer in store");
//			return;
//		}
//		else {
//			for (int i = 0; i < count; i++) {
//				System.out.println("======Computer "+i + "========");
//				System.out.println(comp[i]);
//				System.out.println("==============================");
//			}
//		}
//	}
	
	
	public int checkNumber() {
		Scanner s = new Scanner(System.in);
		int choice;
		do {
			if(s.hasNextInt()) {
				choice = s.nextInt();
			}
			else {
				choice = 0;
				s.next();
				System.out.println("wrong input, must be a number, try again :");
			} 
		}while (choice <= 0);
		
		return choice;
	}
	
	public double checkDouble() {
		Scanner s = new Scanner(System.in);
		double price;
		do {
			if(s.hasNextDouble()) {
				price = s.nextDouble();
			}
			else {
				price = 0;
				s.next();
				System.out.println("wrong input, must be a number, try again :");
			} 
		}while (price <= 0);
		
		return price;
	}
	
	public void findComputersBy() {
		Scanner s = new Scanner(System.in);
		String ans="";
		
		do{
		System.out.println("enter a brand name to search: ");
		String brandSearch = s.next();
		boolean flag = false;
		
		for (int i = 0; i < count; i++) {
			if (brandSearch.equals(comp[i].getBrand())) {
				System.out.println("======Computer "+i + "========");
				System.out.println(comp[i]);
				System.out.println("==============================");
				flag = true;
			}
		}
		if(flag == false) {
		System.out.println("cant find it");
		}
		System.out.println("search again? y/n");
		ans = s.next();
		
		} while(ans.equalsIgnoreCase("Y"));
	}
	
	
	
	public void findCheaperThan() {
		Scanner s = new Scanner(System.in);
		String ans="";
		do{
		System.out.println("enter a price to search: ");
		double priceSearch = checkDouble();
		boolean flag = false;
		for (int i = 0; i < count; i++) {
			if (priceSearch > (comp[i].getPrice())) {
				System.out.println("======Computer "+i + "========");
				System.out.println(comp[i]);
				System.out.println("==============================");
				flag = true;
			}
		}
		if(flag == false) {
		System.out.println("cant find it");
		}
		System.out.println("search again? y/n");
		ans = s.next();
		
		} while(ans.equalsIgnoreCase("Y"));
		
	}
	
	

	
	
	public void update() {
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the computer number to update");
		int number = s.nextInt();
		
		if(number < count) {
			
		System.out.println("======Computer "+number + "========");
			System.out.println(comp[number]);
			System.out.println("==============================");
			System.out.println("what information would you like to change?");
			System.out.println("1.brand\n2.model\n3.SN\n4.price\n5.Quit");
			System.out.println("Enter your choice: ");
			
			switch (choice = s.nextInt()) {
			case 1:
				System.out.println("enter the new brand: ");
				String newBrand = s.next();
				comp[number].setBrand(newBrand);
				System.out.println("Information updated");
				break;
			case 2:
				System.out.println("enter the new model: ");
				String newModel = s.next();
				comp[number].setModel(newModel);
				System.out.println("Information updated");
				break;
			case 3:
				System.out.println("enter the new SN: ");
				long newSN = checkNumber();
				comp[number].setSN(newSN);
				System.out.println("Information updated");
				break;
			case 4:
				System.out.println("enter the new price: ");
				double newPrice = checkDouble();
				comp[number].setPrice(newPrice);
				System.out.println("Information updated");
				break;
			case 5:
				System.out.println("Bye");
				System.exit(100);
			default:
				System.out.println("wrong choice");
				break;
			}
			}
		else {
			System.out.println("cant find it");
		}
			

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Facade {

	int userType;

	public static int value;

	String theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public void runFacade() throws IOException {

		System.out.println("Facade pattern initiated ");
		userType = login(new Login());
		if(userType==-1){
			System.exit(0);
		}
//		System.out.println(
//				"Select from available Course Menus \n 1. Meat:Beef \n 2. Meat:Pork \n 3. Meat:Mutton \n 4. Produce:Tomato \n 5. Produce:Onion \n ");
//		Scanner scan = new Scanner(System.in);
//		theSelectedProduct = scan.nextLine();

//		// pattern implemented (Bridge implementation and Factory implementation
//		if (theSelectedProduct.equalsIgnoreCase("Meat:Beef")) {
//			System.out.print(value);
//			SelectProduct(new MeatProductMenu(), value);
//		} else if (theSelectedProduct.equalsIgnoreCase("Meat:Pork")) {
//			System.out.print(value);
//			SelectProduct(new MeatProductMenu(), value);
//		} else if (theSelectedProduct.equalsIgnoreCase("Meat:Mutton")) {
//			System.out.print(value);
//			SelectProduct(new MeatProductMenu(), value);
//		} else if (theSelectedProduct.equalsIgnoreCase("Produce:Tomato")) {
//			System.out.print(value);
//			SelectProduct(new ProduceProductMenu(), value);
//		} else if (theSelectedProduct.equalsIgnoreCase("Produce:Onion")) {
//			System.out.print(value);
//			SelectProduct(new ProduceProductMenu(), value);
//		}
//		else {
//			System.out.println("Wrong Selection");
//			System.exit(-1);
//		}
//
//		scan.close();


		// Implementing iterator pattern

		//Traversing through the product list using the iterat	or pattern

		System.out.println("\nImplementing the iterator pattern and printing the product list:- \n");

		System.out.println("\nThe product list as follows\n");

		ArrayList<String> productMenuList= new ArrayList<>();
		productMenuList.add("Meat:Beef");
		productMenuList.add("Meat:Pork");
		productMenuList.add("Meat:Mutton");
		productMenuList.add("Produce:Tomato");
		productMenuList.add("Produce:Onion");

		Iterator iterator = productMenuList.iterator();
        ProductIterator productIterator = new ProductIterator();
		while(iterator.hasNext()) {
			System.out.println(productIterator.next(iterator));
		}

		System.out.println("\nThe user product list as follows\n");

		ArrayList<String> userProductMenuList= new ArrayList<>();
		userProductMenuList.add("tutu:Beef");
		userProductMenuList.add("tutu:Tomato");
		userProductMenuList.add("mimi:Beef");
		userProductMenuList.add("pepe:Beef");
		userProductMenuList.add("pepe:Tomato");
		userProductMenuList.add("pepe:Onion");


		iterator = userProductMenuList.iterator();
		OfferingIterator offeringIterator = new OfferingIterator();
		while(iterator.hasNext()) {
			System.out.println(offeringIterator.next(iterator));
		}

	}



	public int login(Login object) throws IOException {
		int x=object.login();
		return x;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public void SelectProduct(ProductMenu productmenu, int userType) {

	}

	public void productOperation() {

	}

}

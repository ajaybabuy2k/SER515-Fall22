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

		// Implementing iterator pattern

		//Traversing through the product list using the iterator pattern

		System.out.println("\nImplementing the iterator pattern \n");

		System.out.println("The product list as follows\n");

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

		System.out.println("The user product list as follows\n");

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

		// Implementing bridge pattern

		System.out.println("Implementing the bridge pattern");

		String userMenuOption="Not Avail";

		Scanner sc = new Scanner(System.in);

		while(!userMenuOption.equals("exit"))
		{
			System.out.println("Select from available Course Menus \n 1. Meat \n 2. Produce\n ");
			userMenuOption=sc.next();
			if(userMenuOption.equals("1") || userMenuOption.equals("2"))
			{
				ProductIterator productMenuIterator= new ProductIterator();
				productMenuIterator.displayUserChoice(userMenuOption);
			}

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

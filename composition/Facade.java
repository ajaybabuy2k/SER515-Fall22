import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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


		String userMenuOption="Not Avail";

		Scanner sc = new Scanner(System.in);

		while(!userMenuOption.equals("quit"))
		{
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

			Iterator iter = productMenuList.iterator();
			ProductIterator productIterator = new ProductIterator();
			while(iter.hasNext()) {
				System.out.println(productIterator.next(iter));
			}

			System.out.println("The user product list as follows\n");

			ArrayList<String> userProductMenuList= new ArrayList<>();
			userProductMenuList.add("tutu:Beef");
			userProductMenuList.add("tutu:Tomato");
			userProductMenuList.add("mimi:Beef");
			userProductMenuList.add("pepe:Beef");
			userProductMenuList.add("pepe:Tomato");
			userProductMenuList.add("pepe:Onion");


			iter = userProductMenuList.iterator();
			OfferingIterator offeringIterator = new OfferingIterator();
			while(iter.hasNext()) {
				System.out.println(offeringIterator.next(iter));
			}

			// Implementing bridge pattern

			System.out.println("\nImplementing the bridge pattern\n");

			System.out.println("\nSelect from Product Menu Type \nmeat or produce\nType meat for meat Product & produce for produce Product \n ");
			userMenuOption=sc.next();
			if(userMenuOption.equalsIgnoreCase("meat") || userMenuOption.equalsIgnoreCase("produce"))
			{
				ProductIterator productMenuIterator= new ProductIterator();
				productMenuIterator.displayUserChoice(userMenuOption);
			}

			System.out.println("Enter quit to order the dish");
			System.out.println("Do you want to quit yes or no");

			String input_user=sc.next();

			if(input_user.equalsIgnoreCase("yes"))
			{
				System.exit(0);
			}


		}


		System.out.println("Implementing the visitor pattern!!\n");

		int bidValue = addTrading(new Trading());



	}

	public int login(Login object) throws IOException {

		int x=object.login();
		return x;

	}

	public int addTrading(Trading object) throws IOException{

		int bidValue=object.bidTradingValue();

		System.out.println("bidValue");

		return 0;
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

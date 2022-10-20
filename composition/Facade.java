import java.io.IOException;
import java.util.Scanner;

public class Facade {

	boolean userType;

	public static int value;

	String theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public void startFacade() throws IOException {

		System.out.println("Facade pattern initiated ");
		userType = login(new Login());
		System.out.println(
				"Select from available Course Menus \n 1. Meat:Beef \n 2. Meat:Pork \n 3. Meat:Mutton \n 4. Produce:Tomato \n 5. Produce:Onion \n ");
		Scanner scan = new Scanner(System.in);
		theSelectedProduct = scan.nextLine();

		// pattern implemented (Bridge implementation and Factory implementation
		if (theSelectedProduct.equalsIgnoreCase("Meat:Beef")) {
			System.out.print(value);
			SelectProduct(new MeatProductMenu(), value);
		} else if (theSelectedProduct.equalsIgnoreCase("Meat:Pork")) {
			System.out.print(value);
			SelectProduct(new MeatProductMenu(), value);
		} else if (theSelectedProduct.equalsIgnoreCase("Meat:Mutton")) {
			System.out.print(value);
			SelectProduct(new MeatProductMenu(), value);
		} else if (theSelectedProduct.equalsIgnoreCase("Produce:Tomato")) {
			System.out.print(value);
			SelectProduct(new ProduceProductMenu(), value);
		} else if (theSelectedProduct.equalsIgnoreCase("Produce:Onion")) {
			System.out.print(value);
			SelectProduct(new ProduceProductMenu(), value);
		}
		else {
			System.out.println("Wrong Selection");
			System.exit(-1);
		}

		scan.close();
	}



	public boolean login(Login object) throws IOException {
		int x=object.login();

		value=x;

		if(x==0 || x==1)
		{
			return true;
		}
		else {
			return false;
		}

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

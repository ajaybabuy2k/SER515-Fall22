import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class Trading {

	private Product product;

	private OfferingList offeringList;

	public void accept(NodeVisitor visitor) {

	}

	public int bidTradingValue() throws FileNotFoundException {

		System.out.println("Order an item \n");

		System.out.println("Enter the item from the menu displayed above\n");

		Scanner sc = new Scanner(System.in);

		String orderName=sc.next();

		int tradingValue=0;

		File file = new File("resources/UserProduct.txt");

		Scanner tradingFile = new Scanner(file);

		while(tradingFile.hasNextLine())
		{
			String productArray[] = tradingFile.nextLine().split(":");
			if(productArray[1].equals(orderName))
			{
				System.out.println(productArray[0]);
				tradingValue++;
			}

		}


		System.out.println("no of users ordered that dish is " + tradingValue);

		return 0;
	}
}

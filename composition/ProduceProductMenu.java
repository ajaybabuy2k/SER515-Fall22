import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProduceProductMenu implements ProductMenu {

	public void showMenu() throws IOException {

		System.out.println("Implementing the factory pattern");

		File productInfoFile = new File("resources/ProductInfo.txt");
		BufferedReader br = new BufferedReader((new FileReader(productInfoFile)));
		String fileValue;
		System.out.println("Produce Product menu \n");

		while((fileValue=br.readLine())!=null)
		{
			String[] splitArray = fileValue.split(":");
			String beforeColon = splitArray[0];
			String afterColon=splitArray[1];
			if(beforeColon.equals("Produce"))
				System.out.println("Produce" + afterColon);
		}

	}

	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;


public class MeatProductMenu implements ProductMenu {

	public void showMenu() throws IOException {

		System.out.println("Implementing the factory pattern\n");

		String beforeColon;
		String afterColon;

		File productInfoFile = new File("resources/ProductInfo.txt");
		BufferedReader br = new BufferedReader((new FileReader(productInfoFile)));
		String fileValue;
		System.out.println("Meat Product menu \n");

		while((fileValue=br.readLine())!=null)
		{
			String[] splitArray = fileValue.split(":");
			beforeColon = splitArray[0];
			afterColon=splitArray[1];
			if(beforeColon.equals("Meat"))
				System.out.println("Meat" + afterColon);
		}
	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}




}

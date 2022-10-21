import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ProductIterator implements Iterator<Product> {

	private ClassProductList classProductList;
	private int position;


	public boolean hasNext() {
       return false;
	}

	@Override
	public Product next() {
										return classProductList.get(position++);
	}

	@Override
	public void remove() {
		Iterator.super.remove();
	}

	public String next(Iterator iterator) {
		if(iterator.hasNext())
		{
			return (String) iterator.next();
		}
		return null;
	}

	public void MoveToHead() {
		position = 0;
	}

	public void Remove() {

	}

	public void displayUserChoice(String menuCategorySelected) throws IOException {

		if(menuCategorySelected.equals("1"))
		{
			MeatProductMenu meatProduct= new MeatProductMenu();
			meatProduct.showMenu();
		}

		else if(menuCategorySelected.equals("2"))
		{
			ProduceProductMenu produceProduct = new ProduceProductMenu();
			produceProduct.showMenu();
		}
	}
}

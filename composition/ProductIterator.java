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

}

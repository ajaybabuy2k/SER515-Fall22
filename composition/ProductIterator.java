import java.util.Iterator;

public class ProductIterator implements Iterator<Product> {

	private ClassProductList classProductList;
	private int position;

	public boolean hasNext() {
		if(position >= classProductList.size())
			return false;
		return true;
	}

	@Override
	public Product next() {
		return classProductList.get(position++);
	}

	@Override
	public void remove() {
		Iterator.super.remove();
	}

	public Product Next() {
		return classProductList.get(position++);
	}

	public void MoveToHead() {
		position = 0;
	}

	public void Remove() {

	}

}

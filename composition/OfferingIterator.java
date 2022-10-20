import java.util.Iterator;

import java.util.Iterator;
public class OfferingIterator implements Iterator<Product> {

	private ClassProductList classProductList;

	private int position;

	public boolean hasNext() {
		return false;
	}

	@Override
	public Product next() {
		return classProductList.get(position++);
	}


	public String next(Iterator iterator) {
		if(iterator.hasNext())
		{
			return (String) iterator.next();
		}
		return null;
	}

	@Override
	public void remove() {

		Iterator.super.remove();

	}

	public Product Next() {
		return null;
	}

	public void MoveToHead() {
		position = 0;
	}

	public void Remove() {

	}

}

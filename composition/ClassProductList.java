import java.util.ArrayList;

public class ClassProductList extends ArrayList<Product> {

	private ReminderVisitor reminderVisitor;

	private Product[] product;

	private ProductIterator productIterator;

	public void accept(NodeVisitor visitor) {

	}

}

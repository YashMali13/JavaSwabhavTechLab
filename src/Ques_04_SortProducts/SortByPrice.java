package Ques_04;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		int categoryCompare = p1.getCategory().compareToIgnoreCase(p2.getCategory());
		if(categoryCompare != 0) {
			return categoryCompare;
		}
		return Integer.compare(p1.getPrice(), p2.getPrice());
	}
}
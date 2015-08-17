package designPatterns.ch13Builder;

/**
 * Created by Catherine on 15/2/3.
 */
public class ConcreteBuilder1 extends Builder {
	private Product product = new Product();
	@Override
	public void BuildePartA() {
		product.Add("partA");
	}

	@Override
	public void BuildePartB() {
		product.Add("partB");
	}

	@Override
	public Product GetRestult() {
		return product;
	}
}

package designPatterns.ch13Builder;

/**
 * Created by Catherine on 15/2/3.
 */
public class ConcreteBuilder2 extends Builder {
	private Product product = new Product();
	@Override
	public void BuildePartA() {
		product.Add("part1");
	}

	@Override
	public void BuildePartB() {
		product.Add("part2");
	}

	@Override
	public Product GetRestult() {
		return product;
	}
}

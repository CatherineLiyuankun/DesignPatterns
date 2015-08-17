package designPatterns.ch13Builder;

/**
 * Created by Catherine on 15/2/28.
 */
public class Program {
	public static void main(String[] args){
		Builder cb1 = new ConcreteBuilder1();
		Builder cb2 = new ConcreteBuilder2();
		Director director = new Director();


		director.Construct(cb1);
		director.Construct(cb2);

		Product product1 = cb1.GetRestult();
		Product product2 = cb2.GetRestult();
		product1.Show();
		product2.Show();

	}
}

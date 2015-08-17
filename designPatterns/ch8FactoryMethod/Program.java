package designPatterns.ch8FactoryMethod;

/**
 * Created by Catherine on 15/3/3.
 */
public class Program {
	public static void main(String[] args) {
		IFactory factory = new UndergraduateFactory();
		LeiFeng student = factory.CreateLeiFeng();
		student.BuyRice();
		student.Sweep();
		student.Wash();
	}
}

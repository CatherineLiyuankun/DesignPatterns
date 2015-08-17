package designPatterns.ch16State;

/**
 * Created by Catherine on 15/3/4.
 */
public class Program {
	public static void main(String[] args) {
		Context c = new Context(new ConcreteStateA());
		c.Request();
		c.Request();
		c.Request();
		c.Request();
	}

}

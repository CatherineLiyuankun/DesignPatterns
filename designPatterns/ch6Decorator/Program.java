package designPatterns.ch6Decorator;

/**
 * Created by Catherine on 15/1/30.
 */
public class Program {
	public static void main(String[] args) {
		Component c = new ConcreteComponent();
		ConcreteDecoratorA d1 = new ConcreteDecoratorA();
		ConcreteDecoratorB d2 = new ConcreteDecoratorB();

		d1.SetComponent(c);
		d2.SetComponent(d1);
		d2.Operation();
	}
}

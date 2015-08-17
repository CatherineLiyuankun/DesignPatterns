package designPatterns.ch6Decorator;

/**
 * Created by Catherine on 15/1/29.
 */
public class ConcreteDecoratorA extends Decorator {
	private String strA;

	public ConcreteDecoratorA() {
		this.strA = "a";
	}

	@Override
	public void Operation() {
		super.Operation();
		System.out.println("具体装饰对象A的操作");
	}
}

package designPatterns.ch6Decorator;

/**
 * Created by Catherine on 15/1/30.
 */
public class ConcreteDecoratorB extends Decorator {
	@Override
	public void Operation() {
		super.Operation();
		AddedBehavior();
		System.out.println("具体装饰对象B的操作");
	}

	private void AddedBehavior() {
		System.out.println("Blalalala");
	}
}

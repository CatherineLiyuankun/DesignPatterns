package designPatterns.ch2Strategy;

/**
 * Created by Catherine on 15/1/27.
 */
public class Program {
	public static void main(String[] args){
		Context context;
		context = new Context(new ConcreteStrategyA());
		context.ContextInterface();

		context = new Context(new ConcreteStrategyB());
		context.ContextInterface();

	}
}

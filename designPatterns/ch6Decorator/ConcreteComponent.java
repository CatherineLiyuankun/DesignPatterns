package designPatterns.ch6Decorator;

/**
 * Created by Catherine on 15/1/29.
 */
public class ConcreteComponent extends Component {
	@Override
	public void Operation() {
		System.out.println("具体对象的操作");
	}
}

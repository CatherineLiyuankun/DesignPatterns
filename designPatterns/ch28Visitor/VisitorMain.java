package designPatterns.ch28Visitor;

/**
 * Created by Catherine on 15/3/26.
 */
public class VisitorMain {
	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new Man());
		o.attach(new Woman());

		Action action = new Success();
		o.display(action);

		action = new Fail();
		o.display(action);

		action = new Love();
		o.display(action);
	}
}

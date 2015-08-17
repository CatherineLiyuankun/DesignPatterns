package designPatterns.ch20Iterator;

/**
 * Created by Catherine on 15/3/11.
 */
public class Program {
	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		a.setElement(0, "daniao");
		a.setElement(1, "xiaocai");
		a.setElement(2, "baggage");
		a.setElement(3, "foreigner");
		a.setElement(4, "staff");
		a.setElement(5, "thief");

		Iterator iterator = new ConcreteIterator(a);
		Object item = iterator.Fist();
		while (!iterator.IsDone()) {
			System.out.println(iterator.CurrentItem() + "buy ticket!");
			iterator.Next();
		}
	}
}

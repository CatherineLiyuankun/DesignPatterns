package designPatterns.ch20Iterator;

/**
 * Created by Catherine on 15/3/11.
 */
public class ConcreteIterator extends Iterator {
	private ConcreteAggregate aggregate;
	private int current = 0;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}
	@Override
	public Object Fist() {
		return aggregate.getElement(0);
	}

	@Override
	public Object Next() {
		Object result = null;
		current++;
		if(current < aggregate.getCount()) {
			result = aggregate.getElement(current);
		}
		return result;
	}

	@Override
	public boolean IsDone() {
		return (current >= aggregate.getCount()) ? true : false ;
	}

	@Override
	public Object CurrentItem() {
		return aggregate.getElement(current);
	}
}

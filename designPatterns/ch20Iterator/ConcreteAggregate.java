package designPatterns.ch20Iterator;

import java.util.ArrayList;

/**
 * Created by Catherine on 15/3/11.
 */
public class ConcreteAggregate extends Aggregate {
	private ArrayList<Object> items = new ArrayList<Object>();
	@Override
	public Iterator CreateIterator() {
		return new ConcreteIterator(this);
	}

	public int getCount() {
		return items.size();
	}

	public Object getElement(int index) {
		return items.get(index);
	}

	public void setElement(int index, Object value) {
		items.add(index, value);
	}
}

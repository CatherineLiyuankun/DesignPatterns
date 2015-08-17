package designPatterns.ch28Visitor;

import java.util.ArrayList;

/**
 * Created by Catherine on 15/3/26.
 */
public class ObjectStructure {
	private ArrayList<Person> elements = new ArrayList<Person>();

	public void attach(Person person) {
		elements.add(person);
	}

	public void detach(Person person) {
		elements.remove(person);
	}

	public void display(Action visitor) {
		for (Person p : elements) {
			p.accept(visitor);
		}
	}
}

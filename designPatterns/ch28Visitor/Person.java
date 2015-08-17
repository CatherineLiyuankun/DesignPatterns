package designPatterns.ch28Visitor;

/**
 * Created by Catherine on 15/3/26.
 */
public abstract class Person {
	public abstract void accept(Action visitor);
}

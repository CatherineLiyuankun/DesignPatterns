package designPatterns.ch17Adapter;

/**
 * Created by Catherine on 15/3/5.
 */
public class Adapter extends Target {
	private Adaptee adaptee = new Adaptee();
	@Override
	public void Request() {
		adaptee.SpecificRequest();
	}
}

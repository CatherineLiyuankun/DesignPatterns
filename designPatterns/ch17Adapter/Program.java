package designPatterns.ch17Adapter;

/**
 * Created by Catherine on 15/3/5.
 */
public class Program {
	public static void main(String[] args) {
		Target target = new Target();
		target.Request();

		Target adapter = new Adapter();
		adapter.Request();
	}
}

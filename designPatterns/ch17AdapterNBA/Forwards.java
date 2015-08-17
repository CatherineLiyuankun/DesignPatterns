package designPatterns.ch17AdapterNBA;

/**
 * Created by Catherine on 15/3/5.
 */
public class Forwards extends Player {
	public Forwards(String name) {
		super(name);
	}

	@Override
	public void Attack() {
		System.out.println("Forwards:" + name + "Attack");
	}

	@Override
	public void Defense() {
		System.out.println("Forwards:" + name + "Defense");
	}
}

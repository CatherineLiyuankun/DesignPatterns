package designPatterns.ch17AdapterNBA;

/**
 * Created by Catherine on 15/3/5.
 */
public class Guards extends Player {
	public Guards(String name) {
		super(name);
	}

	@Override
	public void Attack() {
		System.out.println("Guards:" + name + "Attack");
	}

	@Override
	public void Defense() {
		System.out.println("Guards:" + name + "Defense");
	}
}

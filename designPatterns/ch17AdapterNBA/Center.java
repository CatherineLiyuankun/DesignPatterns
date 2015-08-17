package designPatterns.ch17AdapterNBA;

/**
 * Created by Catherine on 15/3/5.
 */
public class Center extends Player {
	public Center(String name) {
		super(name);
	}

	@Override
	public void Attack() {
		System.out.println("Center:" + name + "Attack");
	}

	@Override
	public void Defense() {
		System.out.println("Center:" + name + "Defense");
	}
}

package designPatterns.ch17AdapterNBA;

/**
 * Created by Catherine on 15/3/5.
 */
public abstract class Player {
	protected String name;

	public Player(String name) {
		this.name = name;
	}
	public abstract void Attack();
	public abstract void Defense();
}

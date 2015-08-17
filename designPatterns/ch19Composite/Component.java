package designPatterns.ch19Composite;

/**
 * Created by Catherine on 15/3/6.
 */
public abstract class Component {
	protected String name;

	public Component(String name) {
		this.name = name;
	}

	public abstract void Add(Component c);
	public abstract void Remove(Component c);
	public abstract void Display(int depth);
}

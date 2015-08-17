package designPatterns.ch24chainOfResponsibility;

/**
 * Created by Catherine on 15/3/18.
 */
public abstract class Manager {
	protected String name;
	protected Manager superior;

	public Manager(String name) {
		this.name = name;
	}

	public void setsuperior(Manager superior) {
		this.superior = superior;
	}

	public abstract void requestApplication(Request request);
}

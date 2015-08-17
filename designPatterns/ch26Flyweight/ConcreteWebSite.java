package designPatterns.ch26Flyweight;

/**
 * Created by Catherine on 15/3/21.
 */
public class ConcreteWebSite extends Website {
	private String name;

	public ConcreteWebSite(String name) {
		this.name = name;
	}

	@Override
	public void use(User user) {
		System.out.println("website category:" + name + " User:" + user.getName());
	}
}

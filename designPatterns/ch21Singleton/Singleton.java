package designPatterns.ch21Singleton;

/**
 * Created by Catherine on 15/3/12.
 */
public class Singleton {
	private static Singleton instance = null;
	private Singleton(){}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

package designPatterns.ch21Singleton;

/**
 * Created by Catherine on 15/3/12.
 */
public class Program {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		if (singleton1 == singleton2) {
			System.out.println("两个对象是相同的实例");
		}
	}
}

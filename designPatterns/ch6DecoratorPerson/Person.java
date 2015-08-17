package designPatterns.ch6DecoratorPerson;

/**
 * Created by Catherine on 15/1/30.
 */
public class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public void Show() {
		System.out.println(this.name + "的装扮：");
	};
}

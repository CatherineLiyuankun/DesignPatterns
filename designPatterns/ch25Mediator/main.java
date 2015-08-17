package designPatterns.ch25Mediator;

/**
 * Created by Catherine on 15/3/18.
 */
public class main {
	public static void main(String[] args) {
		ConcreteMediator m = new ConcreteMediator();
		ConcreteColleague1 colleague1 = new ConcreteColleague1(m);
		ConcreteColleague2 colleague2 = new ConcreteColleague2(m);
		m.setColleague1(colleague1);
		m.setColleague2(colleague2);
		colleague1.send("do you have time?");
		colleague2.send("yes");
	}
}

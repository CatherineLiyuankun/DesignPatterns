package designPatterns.ch25Mediator;

/**
 * Created by Catherine on 15/3/18.
 */
public class ConcreteColleague1 extends Colleague {
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	public void send(String message) {
		mediator.send(message, this);
	}

	public void notifyC(String message) {
		System.out.println("同事1得到消息：" + message);
	}
}

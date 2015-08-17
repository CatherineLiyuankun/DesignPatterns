package designPatterns.ch25Mediator;

/**
 * Created by Catherine on 15/3/18.
 */
public class ConcreteColleague2 extends Colleague {
	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	public void send(String message) {
		mediator.send(message, this);
	}

	public void notifyC(String message) {
		System.out.println("同事2得到消息：" + message);
	}
}

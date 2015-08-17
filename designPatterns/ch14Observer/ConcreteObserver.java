package designPatterns.ch14Observer;

/**
 * Created by Catherine on 15/3/1.
 */
public class ConcreteObserver extends Observer {
	private String name;
	private String observerState;
	private ConcreteSubject subject;

	public ConcreteObserver(String name, ConcreteSubject subject) {
		this.name = name;
		this.subject = subject;
	}

	@Override
	public void Update() {
		observerState = subject.getSubjectState();
		System.out.println("观察者" + name + "的状态" + observerState);
	}
}

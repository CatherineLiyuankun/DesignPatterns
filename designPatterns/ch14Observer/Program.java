package designPatterns.ch14Observer;

/**
 * Created by Catherine on 15/3/1.
 */
public class Program {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		subject.Attach(new ConcreteObserver("ob1", subject));
		subject.Attach(new ConcreteObserver("ob2", subject));
		subject.setSubjectState("回去工作");
		subject.Notify();
	}
}

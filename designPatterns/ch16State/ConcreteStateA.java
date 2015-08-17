package designPatterns.ch16State;

/**
 * Created by Catherine on 15/3/4.
 */
public class ConcreteStateA extends State {
	@Override
	public void Handle(Context context) {
		context.SetState(new ConcreteStateB());
	}
}

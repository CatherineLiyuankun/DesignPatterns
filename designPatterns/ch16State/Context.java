package designPatterns.ch16State;

/**
 * Created by Catherine on 15/3/4.
 */
public class Context {
	private State state;

	public Context(State state) {
		this.state = state;
	}

	public void SetState(State state) {
		System.out.println("current state:" + state.getClass().getName());
		this.state = state;
	}

	public State GetState() {
		return state;
	}

	public void Request() {
		state.Handle(this);
	}
}

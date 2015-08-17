package designPatterns.ch18Memento;

/**
 * Created by Catherine on 15/3/5.
 */
public class Originator {
	private String state;

	public Memento CreateMemento() {
		return new Memento(state);
	}

	public void SetMemento(Memento memento) {
		this.state = memento.getState();
	}

	public void Show() {
		System.out.println("State: " + state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}

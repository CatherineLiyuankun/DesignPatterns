package designPatterns.ch18Memento;

/**
 * Created by Catherine on 15/3/5.
 */
public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}

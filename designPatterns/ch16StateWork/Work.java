package designPatterns.ch16StateWork;

/**
 * Created by Catherine on 15/3/4.
 */
public class Work {
	private State currentState;
	private double hour;
	private boolean finish = false;

	public Work(State state) {
		this.currentState = state;
	}
	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State state) {
		this.currentState = state;
	}

	public void WriteProgram() {
		currentState.WriteProgram(this);
	}
}

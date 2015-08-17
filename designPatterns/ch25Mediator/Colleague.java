package designPatterns.ch25Mediator;

/**
 * Created by Catherine on 15/3/18.
 */
public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
}

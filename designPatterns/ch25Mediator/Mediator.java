package designPatterns.ch25Mediator;

/**
 * Created by Catherine on 15/3/18.
 */
public abstract class Mediator {
	public abstract void send(String message, Colleague colleague);
}

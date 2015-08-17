package designPatterns.ch23Command;

/**
 * Created by Catherine on 15/3/18.
 */
public abstract class Command {
	protected Barbecuer barbecuer;
	public Command(Barbecuer barbecuer) {
		this.barbecuer = barbecuer;
	}
	public abstract void excuteCommand();
}

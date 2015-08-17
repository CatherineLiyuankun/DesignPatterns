package designPatterns.ch23Command;

/**
 * Created by Catherine on 15/3/18.
 */
public class BakeMuttonCommand extends Command {
	public BakeMuttonCommand(Barbecuer barbecuer) {
		super(barbecuer);
	}

	@Override
	public void excuteCommand() {
		barbecuer.BakeMutton();
	}
}

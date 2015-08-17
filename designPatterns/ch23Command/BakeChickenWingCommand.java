package designPatterns.ch23Command;

/**
 * Created by Catherine on 15/3/18.
 */
public class BakeChickenWingCommand extends Command {
	public BakeChickenWingCommand(Barbecuer barbecuer) {
		super(barbecuer);
	}

	@Override
	public void excuteCommand() {
		barbecuer.BakeChickenWing();
	}
}

package designPatterns.ch23Command;

/**
 * Created by Catherine on 15/3/18.
 */
public class Program {
	public static void main(String[] args) {
		Barbecuer barbecuer = new Barbecuer();
		Command commandChicken = new BakeChickenWingCommand(barbecuer);
		Command commandMutton1 = new BakeMuttonCommand(barbecuer);
		Command commandMutton2 = new BakeMuttonCommand(barbecuer);

		Waiter waiter = new Waiter();
		waiter.setOrder(commandChicken);
		waiter.setOrder(commandMutton1);
		waiter.setOrder(commandMutton2);

		waiter.notifyBaker();
		waiter.cancelOrder(commandChicken);
		waiter.notifyBaker();
	}
}

package designPatterns.ch23Command;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Catherine on 15/3/18.
 */
public class Waiter {
	ArrayList<Command> orders = new ArrayList<Command>();

	public void setOrder(Command command) {
		if (command.toString() == "Command Pattern.BakeChickenWingCommand") {
			System.out.println("服务员：鸡翅没有了，请点别的！");
		} else {
			orders.add(command);
			System.out.println("增加订单：" + command + "时间：" + new Date().toString());
		}
	}

	public void cancelOrder(Command command) {
		orders.remove(command);
		System.out.println("取消订单：" + command + "时间：" + new Date().toString());
	}

	public void notifyBaker() {
		for (Command command: orders ) {
			command.excuteCommand();
		}
	}
}

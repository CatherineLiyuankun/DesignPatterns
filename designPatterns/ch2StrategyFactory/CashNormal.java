package designPatterns.ch2StrategyFactory;

/**
 * Created by Catherine on 15/1/28.
 */
public class CashNormal extends CashSuper {
	@Override
	public double AcceptCash(double money) {
		System.out.println(money);
		return money;
	}

}

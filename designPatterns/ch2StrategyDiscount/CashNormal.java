package designPatterns.ch2StrategyDiscount;

/**
 * Created by Catherine on 15/1/27.
 */
public class CashNormal extends CashSuper {
	@Override
	public double AcceptCash(double money) {
		System.out.println(money);
		return money;
	}
}

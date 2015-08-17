package designPatterns.ch2StrategyFactory;

/**
 * Created by Catherine on 15/1/28.
 */
public class CashRebate extends CashSuper {
	private double rebate = 1;
	public CashRebate(double rebate) {
		this.rebate = rebate;
	}
	@Override
	public double AcceptCash(double money) {
		System.out.println("rebate:" + this.rebate + "total:" + money * rebate);
		return money * rebate;
	}
}

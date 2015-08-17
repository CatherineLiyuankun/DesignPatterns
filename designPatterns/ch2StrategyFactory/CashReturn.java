package designPatterns.ch2StrategyFactory;

/**
 * Created by Catherine on 15/1/28.
 */
public class CashReturn extends CashSuper {
	private double returnCondition = 0;
	private double returnMoney = 0;

	public CashReturn(double returnCondition, double returnMoney) {
		this.returnCondition = returnCondition;
		this.returnMoney = returnMoney;
	}
	@Override
	public double AcceptCash(double money) {
		double result = money - (money / returnCondition) * returnMoney;
		System.out.println("condition:" + this.returnCondition + "return money:" + this.returnMoney + "total:" + result);
		return result;
	}
}

package designPatterns.ch2StrategyDiscount;

/**
 * Created by Catherine on 15/1/27.
 */
public class CashContext {
	private CashSuper cashSuper;
	public CashContext(CashSuper cashSuper){
		this.cashSuper = cashSuper;
	}

	public double GetResult(double money){
		return this.cashSuper.AcceptCash(money);
	}
}

package designPatterns.ch2StrategyFactory;

/**
 * Created by Catherine on 15/1/28.
 */
public class CashFactory {
	CashSuper cashSuper = null;

	public CashFactory(String type) {
		char typeChar = type.charAt(0);
		switch (typeChar) {
			case 'n':
				this.cashSuper = new CashNormal();
				break;
			case 'b':
				this.cashSuper = new CashRebate(0.7);
				break;
			case 't':
				this.cashSuper = new CashReturn(100, 10);
				break;
		}
	}
	public void GetResult(double money) {
		this.cashSuper.AcceptCash(money);
	}
}

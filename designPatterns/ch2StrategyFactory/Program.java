package designPatterns.ch2StrategyFactory;

/**
 * Created by Catherine on 15/1/28.
 */
public class Program {
	public static void main(String[] args) {
		CashFactory cs = new CashFactory("normal");
		cs.GetResult(100);
		cs = new CashFactory("b");
		cs.GetResult(100);
		cs = new CashFactory("t");
		cs.GetResult(100);
	}
}

package designPatterns.ch2StrategyDiscount;

/**
 * Created by Catherine on 15/1/27.
 */
public class Program {
	public static void main(String[] args){
		CashContext cashContext;
		cashContext = new CashContext(new CashNormal());
		cashContext.GetResult(100);

		cashContext = new CashContext(new CashRebate(0.7));
		cashContext.GetResult(100);

		cashContext = new CashContext(new CashReturn(50, 10));
		cashContext.GetResult(100);

	}
}

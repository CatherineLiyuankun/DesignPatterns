package designPatterns.ch1SimpleFactory;

/**
 * Created by Catherine on 15/1/21.
 */
public class OperDiv extends Operation {
	public double GetResult()
	{
		if(numberB == 0) {
			try {
				throw new Exception("0 can not be a divisor");
			}  catch (Exception e) {
				e.printStackTrace();
			}
		}
		return numberA / numberB;
	}
}

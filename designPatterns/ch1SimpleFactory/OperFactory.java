package designPatterns.ch1SimpleFactory;

/**
 * Created by Catherine on 15/1/21.
 */
public class OperFactory {
	public static Operation createOperate(char operation) {
		Operation oper = null;

		switch (operation) {
			case '+':
				oper = new OperAdd();
				break;
			case '-':
				oper = new OperSub();
				break;
			case '*':
				oper = new OperMul();
				break;
			case '/':
				oper = new OperDiv();
				break;
		}
		return oper;
	}
}

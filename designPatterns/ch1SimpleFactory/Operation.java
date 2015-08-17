package designPatterns.ch1SimpleFactory;

/**
 * Created by Catherine on 15/1/20.
 */
public class Operation {
	protected double numberA;
	protected double numberB;

	public double getnumberA() {
		return numberA;
	}

	public double getnumberB() {
		return numberB;
	}

	public void setnumberA(double numberA) {
		this.numberA = numberA;
	}

	public void setnumberB(double numberB) {
		this.numberB = numberB;
	}

	public double GetResult() {
		return 0;
	}
}

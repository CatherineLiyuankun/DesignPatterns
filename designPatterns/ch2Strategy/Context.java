package designPatterns.ch2Strategy;

/**
 * Created by Catherine on 15/1/27.
 */
public class Context {
	private Strategy strategy;
	public Context(Strategy strategy){
		this.strategy = strategy;
	}

	public void ContextInterface(){
		this.strategy.AlgorithmInterface();
	}
}

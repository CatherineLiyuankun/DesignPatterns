package designPatterns.ch28Visitor;

/**
 * Created by Catherine on 15/3/26.
 */
public class Love extends Action {
	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println("When " + concreteElementA.getClass().getName()  + " " + this.getClass().getName() + ", he knows everything. ");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println("When " + concreteElementB.getClass().getName()  + " " + this.getClass().getName() + ", her knows nothing. ");
	}
}

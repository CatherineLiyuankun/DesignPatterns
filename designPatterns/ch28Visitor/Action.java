package designPatterns.ch28Visitor;

/**
 * Created by Catherine on 15/3/26.
 */
public abstract class Action {
	public abstract void getManConclusion(Man concreteElementA);
	public abstract void getWomanConclusion(Woman concreteElementB);
}

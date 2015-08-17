package designPatterns.ch28Visitor;

/**
 * Created by Catherine on 15/3/26.
 */
public class Woman extends Person {
	@Override
	public void accept(Action visitor) {
		visitor.getWomanConclusion(this);
	}
}

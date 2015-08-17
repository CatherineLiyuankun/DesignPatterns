package designPatterns.ch6Decorator;

/**
 * Created by Catherine on 15/1/29.
 */
public class Decorator extends Component{
	protected Component cp;

	public void SetComponent(Component cp) {
		this.cp = cp;
	}
	@Override
	public void Operation() {
		if(cp != null) {
			cp.Operation();
		}
	}
}

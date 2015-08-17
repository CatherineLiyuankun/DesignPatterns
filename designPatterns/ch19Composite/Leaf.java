package designPatterns.ch19Composite;

/**
 * Created by Catherine on 15/3/6.
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void Add(Component c) {
		System.out.println("Can not add to a leaf");
	}

	@Override
	public void Remove(Component c) {
		System.out.println("Can not remove from a leaf");
	}

	@Override
	public void Display(int depth) {
		System.out.println("-" + name);
	}
}

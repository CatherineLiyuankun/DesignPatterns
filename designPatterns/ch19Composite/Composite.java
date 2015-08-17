package designPatterns.ch19Composite;

import java.util.ArrayList;

/**
 * Created by Catherine on 15/3/6.
 */
public class Composite extends Component {
	private ArrayList<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void Add(Component c) {
		children.add(c);
	}

	@Override
	public void Remove(Component c) {
		children.remove(c);
	}

	@Override
	public void Display(int depth) {
		System.out.println("-" + name);
		for (Component component : children) {
			for(int i = 0; i < depth; i++) {
				System.out.print("--");
			}
			component.Display(depth + 1);
		}
	}
}

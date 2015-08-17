package designPatterns.ch27Interpreter;

import static java.lang.Integer.parseInt;

/**
 * Created by Catherine on 15/3/25.
 */
public class Scale extends Expression {
	@Override
	public void excute(String key, String value) {
		String scale = "";
		switch (parseInt(value)) {
			case 1:
				scale = "低音";
				break;
			case 2:
				scale = "中音";
				break;
			case 3:
				scale = "高音";
		}
		System.out.print(scale + " ");
	}
}

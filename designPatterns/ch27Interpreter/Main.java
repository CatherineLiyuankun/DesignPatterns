package designPatterns.ch27Interpreter;

/**
 * Created by Catherine on 15/3/25.
 */
public class Main {
	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		context.setText("O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
		Expression expression = null;
		while (context.getText().length() > 0) {
			String str = context.getText().substring(0, 1);
			switch (str.charAt(0)) {
				case 'O':
					expression = new Scale();
					break;
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'A':
				case 'B':
				case 'P':
					expression = new Note();
					break;
			}
			expression.Interpret(context);
		}
	}
}

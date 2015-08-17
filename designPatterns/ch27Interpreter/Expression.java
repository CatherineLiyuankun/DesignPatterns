package designPatterns.ch27Interpreter;

/**
 * Created by Catherine on 15/3/25.
 */
abstract public class Expression {
	public void Interpret(PlayContext context) {
		if (context.getText().length() == 0) {
			return;
		} else {
			String playKey = context.getText().substring(0, 1);
			context.setText(context.getText().substring(2));
			String playValue = context.getText().substring(0, context.getText().indexOf(" "));
			context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));

			excute(playKey, playValue);
		}
	}

	public abstract void excute(String key, String value);
}

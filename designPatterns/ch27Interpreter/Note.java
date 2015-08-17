package designPatterns.ch27Interpreter;

/**
 * Created by Catherine on 15/3/25.
 */
public class Note extends Expression {
	@Override
	public void excute(String key, String value) {
		String note = "";
		String meter = "";
		switch (key.charAt(0)) {
			case 'C':
				note = "1";
				break;
			case 'D':
				note = "2";
				break;
			case 'E':
				note = "3";
				break;
			case 'F':
				note = "4";
				break;
			case 'G':
				note = "5";
				break;
			case 'A':
				note = "6";
				break;
			case 'B':
				note = "7";
				break;
			case 'P':
				note = "0";
				break;
		}
		switch (value.charAt(0)) {
			case '0':
				switch (value.charAt(2)) {
					case '2':
						meter = "_";
						break;
					case '5':
						meter = "=";
						break;
				}
				break;
			case '1':
				meter = "-";
				break;
			case '2':
				meter = "--";
				break;

		}
		System.out.print(note + " "+ meter + " ");
	}
}

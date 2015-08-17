package designPatterns.ch16StateWork;

/**
 * Created by Catherine on 15/3/4.
 */
public class Program {
	public static void main(String[] args) {
		Work w = new Work(new ForenoonState());
		w.setHour(5);
		w.WriteProgram();
		w.setHour(13);
		w.WriteProgram();
	}
}

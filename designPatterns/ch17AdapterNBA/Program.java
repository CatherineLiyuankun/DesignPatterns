package designPatterns.ch17AdapterNBA;

/**
 * Created by Catherine on 15/3/5.
 */
public class Program {
	public static void main(String[] args) {
		Player forwards = new Forwards("lyk");
		forwards.Attack();

		Player guard = new Guards("g");
		guard.Attack();

		Player foreign = new Translator("姚明");
		foreign.Attack();
		foreign.Defense();
	}
}

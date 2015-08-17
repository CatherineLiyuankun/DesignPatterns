package designPatterns.ch18Memento;

/**
 * Created by Catherine on 15/3/5.
 */
public class Program {
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("state1");
		originator.Show();

//		Memento memento = originator.CreateMemento(); // when Caretaker class don't exist
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.CreateMemento());

		originator.setState("state2");
		originator.Show();
//		originator.SetMemento(memento);// when Caretaker class don't exist
		originator.SetMemento(caretaker.getMemento());
		originator.Show();
	}
}

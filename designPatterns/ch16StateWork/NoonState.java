package designPatterns.ch16StateWork;

/**
 * Created by Catherine on 15/3/4.
 */
public class NoonState extends State {
	@Override
	public void WriteProgram(Work work) {
		if (work.getHour() < 14) {
			System.out.println("Time:" + work.getHour() + " In the noon,Happy");
		} else {
			work.setCurrentState(new NoonState());
			work.WriteProgram();
		}
	}
}

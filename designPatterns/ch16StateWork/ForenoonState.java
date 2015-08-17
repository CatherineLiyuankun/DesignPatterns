package designPatterns.ch16StateWork;

/**
 * Created by Catherine on 15/3/4.
 */
public class ForenoonState extends State {
	@Override
	public void WriteProgram(Work work) {
		if (work.getHour() < 12) {
			System.out.println("Time:" + work.getHour() + " In the morning,Happy");
		} else {
			work.setCurrentState(new NoonState());
			work.WriteProgram();
		}
	}
}

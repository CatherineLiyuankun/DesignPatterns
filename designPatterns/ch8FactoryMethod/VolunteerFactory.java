package designPatterns.ch8FactoryMethod;

/**
 * Created by Catherine on 15/3/3.
 */
public class VolunteerFactory implements IFactory {
	@Override
	public LeiFeng CreateLeiFeng() {
		return new Volunteer();
	}
}

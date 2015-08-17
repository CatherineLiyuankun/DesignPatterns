package designPatterns.ch15AbstractFactory;

/**
 * Created by Catherine on 15/3/4.
 */
public class AccessUser implements IUser {
	@Override
	public void InsertUser(User user) {
		System.out.println("Insert a record for table User in Access ");
	}

	@Override
	public User GetUser(int id) {
		System.out.println("Get a record from table User in Access ");
		return null;
	}
}

package designPatterns.ch15AbstractFactory;
/**
 * Created by Catherine on 15/3/4.
 */
public class Program {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		User user = new User();
		Department department = new Department();

		IUser iUser = DataAccess.CreateUser();
		iUser.InsertUser(user);
		iUser.GetUser(1);

		IDepartment iDepartment = DataAccess.CreateDepartment();
		iDepartment.Insert(department);
		iDepartment.GetDepartment(1);
	}
}

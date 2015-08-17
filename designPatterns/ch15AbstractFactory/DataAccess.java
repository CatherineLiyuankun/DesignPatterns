package designPatterns.ch15AbstractFactory;

/**
 * Created by Catherine on 15/3/4.
 */
public class DataAccess {
	private static String db = "Sqlserver";
//	private static String db = "Access";

	public static IUser CreateUser() throws InstantiationException, IllegalAccessException{
		/*IUser result = null;
		switch (db.charAt(0)) {
			case 'S':
				result = new SqlserverUser();
				break;
			case 'A':
				result = new AccessUser();
				break;
		}
		return result;*/

		String className = "designPatterns.ch15AbstractFactory." + db + "User";
		IUser result = null;

		try {
			Class cls = Class.forName(className);
			Object object = cls.newInstance();
			result = (IUser) object;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static IDepartment CreateDepartment() throws InstantiationException, IllegalAccessException{
		/*IUser result = null;
		switch (db.charAt(0)) {
			case 'S':
				result = new SqlserverDepartment();
				break;
			case 'A':
				result = new AccessDepartment();
				break;
		}
		return result;*/

		String className = "designPatterns.ch15AbstractFactory." + db + "Department";
		IDepartment result = null;

		try {
			Class cls = Class.forName(className);
			Object object = cls.newInstance();
			result = (IDepartment) object;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
}

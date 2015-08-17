package designPatterns.ch26Flyweight;
import java.util.Hashtable;
/**
 * Created by Catherine on 15/3/21.
 */
public class WebsiteFactory {
	private Hashtable flyweight = new Hashtable();
	public Website getWebsiteCategory(String key) {
		if (!flyweight.containsKey(key)) {
			flyweight.put(key, new ConcreteWebSite(key));
		}
		return (Website)flyweight.get(key);
	}

	public int getCount(Hashtable flyweight) {
		return flyweight.size();
	}
}

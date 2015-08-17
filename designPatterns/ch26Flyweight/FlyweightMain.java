package designPatterns.ch26Flyweight;

/**
 * Created by Catherine on 15/3/21.
 */
public class FlyweightMain {
	public static void main(String[] args) {
		WebsiteFactory websiteFactory = new WebsiteFactory();
		Website w1 = websiteFactory.getWebsiteCategory("production");
		w1.use(new User("name1"));
		Website w2 = websiteFactory.getWebsiteCategory("production");
		w2.use(new User("name2"));
		Website w3 = websiteFactory.getWebsiteCategory("production");
		w3.use(new User("name3"));

		Website b1 = websiteFactory.getWebsiteCategory("blog");
		Website b2 = websiteFactory.getWebsiteCategory("blog");
		Website b3 = websiteFactory.getWebsiteCategory("blog");
		b1.use(new User("b1"));
		b2.use(new User("b2"));
		b3.use(new User("b3"));
	}
}

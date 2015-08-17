package designPatterns.ch22Bridge;

/**
 * Created by Catherine on 15/3/17.
 */
public class HadnsetBrandM extends HandsetBrand {
	@Override
	public void run() {
		System.out.println("M品牌：");
		soft.run();
	}
}

package designPatterns.ch22Bridge;

/**
 * Created by Catherine on 15/3/17.
 */
public class HadnsetBrandN extends HandsetBrand {
	@Override
	public void run() {
		System.out.println("N品牌：");
		soft.run();
	}
}

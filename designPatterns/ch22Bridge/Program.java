package designPatterns.ch22Bridge;

/**
 * Created by Catherine on 15/3/17.
 */
public class Program {
	public static void main(String[] args) {
		HandsetBrand handsetBrand = new HadnsetBrandM();
		handsetBrand.setSoft(new HandsetGame());
		handsetBrand.run();

		handsetBrand = new HadnsetBrandN();
		handsetBrand.setSoft(new HandsetAddressList());
		handsetBrand.run();
	}
}

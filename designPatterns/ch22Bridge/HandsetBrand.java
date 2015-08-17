package designPatterns.ch22Bridge;

/**
 * Created by Catherine on 15/3/17.
 */
public abstract class HandsetBrand {
	protected HandsetSoft soft;
	public void setSoft(HandsetSoft soft) {
		this.soft = soft;
	}
	public abstract void run();
}

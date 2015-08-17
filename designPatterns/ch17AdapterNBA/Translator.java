package designPatterns.ch17AdapterNBA;

/**
 * Created by Catherine on 15/3/5.
 */
public class Translator extends Player {
	private ForeignCenter foreignCenter = new ForeignCenter();

	@Override
	public void Attack() {
		foreignCenter.ForeignAttack();
	}

	@Override
	public void Defense() {
		foreignCenter.ForeignDefense();
	}

	public Translator(String name) {
		super(name);
		foreignCenter.setName(name);
	}
}

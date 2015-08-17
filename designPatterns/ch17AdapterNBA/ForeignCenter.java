package designPatterns.ch17AdapterNBA;

/**
 * Created by Catherine on 15/3/5.
 */
public class ForeignCenter {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void ForeignAttack() {
		System.out.println("ForeignCenter:" + name +"Attack");
	}
	public void ForeignDefense() {
		System.out.println("ForeignCenter:" + name +"Defense");
	}
}

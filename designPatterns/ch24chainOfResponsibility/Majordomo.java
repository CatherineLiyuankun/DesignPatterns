package designPatterns.ch24chainOfResponsibility;

/**
 * Created by Catherine on 15/3/18.
 */
public class Majordomo extends Manager {
	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void requestApplication(Request request) {
		if (request.getRequestType() == "请假" && (request.getNum() <= 5)) {
			System.out.println(name + ":" + request.getRequestType() + "数量" + request.getNum() + "被批准");
		}
		else if(superior != null) {
			superior.requestApplication(request);
		}

	}
}

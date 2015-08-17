package designPatterns.ch24chainOfResponsibility;

/**
 * Created by Catherine on 15/3/18.
 */
public class GeneralManager extends Manager {
	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void requestApplication(Request request) {
		if (request.getRequestType() == "请假") {
			System.out.println(name + ":" + request.getRequestType() + "数量" + request.getNum() + "被批准");
		}
		else if(request.getRequestType() == "加薪" && (request.getNum() < 500)) {
			System.out.println(name + ":" + request.getRequestType() + "数量" + request.getNum() + "被批准");
		}
		else if(request.getRequestType() == "加薪" && (request.getNum() >= 500)) {
			System.out.println(name + ":" + request.getRequestType() + "数量" + request.getNum() + "再说吧");
		}
		}
}

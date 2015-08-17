package designPatterns.ch24chainOfResponsibility;

/**
 * Created by Catherine on 15/3/18.
 */
public class Program {
	public static void main(String[] args) {
		CommonManager commonManager = new CommonManager("cm");
		Majordomo majordomo = new Majordomo("md");
		GeneralManager generalManager = new GeneralManager("gm");
		commonManager.setsuperior(majordomo);
		majordomo.setsuperior(generalManager);
		
		Request request = new Request();
		request.setRequestType("请假");
		request.setContent("小蔡请假");
		request.setNum(1);
		commonManager.requestApplication(request);

		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setContent("小里请假");
		request2.setNum(4);
		commonManager.requestApplication(request2);

		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setContent("小里加薪");
		request4.setNum(600);
		commonManager.requestApplication(request4);

		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setContent("小里加薪");
		request3.setNum(400);
		commonManager.requestApplication(request3);
	}
}

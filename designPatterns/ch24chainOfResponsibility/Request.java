package designPatterns.ch24chainOfResponsibility;

/**
 * Created by Catherine on 15/3/18.
 */
public class Request {
	private String requestType;
	private String content;
	private int num;

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

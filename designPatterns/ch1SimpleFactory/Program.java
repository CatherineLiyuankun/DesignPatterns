package designPatterns.ch1SimpleFactory;

import java.util.Scanner;

/**
 * Created by Catherine on 15/1/21.
 */
public class Program {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input number A:");
		String strNumA = scanner.nextLine();
		System.out.println("Please input operation:");
		char strOperation = scanner.nextLine().charAt(0);
		System.out.println("Please input number B:");
		String strNumB = scanner.nextLine();

		Operation oper = OperFactory.createOperate(strOperation);
		oper.setnumberA(Double.parseDouble(strNumA));
		oper.setnumberB(Double.parseDouble(strNumB));
		System.out.println("Result:");
		System.out.println(oper.GetResult());
	}
}

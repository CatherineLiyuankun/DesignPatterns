package designPatterns.ch13Builder;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Catherine on 15/2/3.
 */
public class Product {
	ArrayList<String> parts = new ArrayList<String>();

	public void Add(String part){
		parts.add(part);
	}

	public void Show(){
		System.out.println("\n 产品 创建 －－－－");
		Iterator it = parts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

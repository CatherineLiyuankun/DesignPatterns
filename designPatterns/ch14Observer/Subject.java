package designPatterns.ch14Observer;

import java.util.ArrayList;

/**
 * Created by Catherine on 15/3/1.
 */
public abstract class Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	public void Attach(Observer observer){
		observers.add(observer);
	};

	public void Detach(Observer observer){
		observers.remove(observer);
	};

	public void Notify(){
		/*Iterator it = observers.iterator();
		while(it.hasNext()){
			it.next().Update();
		}*/
		for(int i = 0; i < observers.size(); i++){
			observers.get(i).Update();
		}
	}
}

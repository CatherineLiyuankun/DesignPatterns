package designPatterns.ch13Builder;

/**
 * Created by Catherine on 15/2/28.
 */
public class Director {
	public void Construct(Builder builder){
		builder.BuildePartA();
		builder.BuildePartB();
	}
}

package designPatterns.ch19Composite;

/**
 * Created by Catherine on 15/3/6.
 */
public class Program {
	public static void main(String [] args) {
		Composite root = new Composite("root");
		root.Add(new Leaf("LeafA"));
		root.Add(new Leaf("LeafB"));

		Composite branchA = new Composite("BranchA");
		branchA.Add(new Leaf("LeafAA"));
		branchA.Add(new Leaf("LeafAB"));

		root.Add(branchA);

		Composite branchAB = new Composite("BranchAB");
		branchAB.Add(new Leaf("LeafABA"));
		branchAB.Add(new Leaf("LeafABB"));

		branchA.Add(branchAB);

		Leaf leafC = new Leaf("LeafC");
		root.Add(leafC);
		root.Remove(leafC);

		root.Display(1);
	}
}

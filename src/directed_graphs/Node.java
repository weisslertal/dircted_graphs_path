package directed_graphs;

import java.util.ArrayList;

public class Node {
	ArrayList<Arrow> arrow;
	
	Node(String name){
		this.name = name;
		this.arrow = new ArrayList<>();
	}
	
	public Node addArrow(Arrow newArrow)
    {
        this.arrow.add(newArrow);
        return this;
    }
	
	String name;

}

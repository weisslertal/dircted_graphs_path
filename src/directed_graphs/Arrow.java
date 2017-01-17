package directed_graphs;

public class Arrow {
	Arrow(double weight, String nextNodeName){
		this.weight = weight;
		this.nextNodeName = nextNodeName;
		this.visited=false;
	}
	
	public void setVisited()
    {
		this.visited=true;
    }
	
	public void setUnVisited()
    {
		this.visited=false;
    }
	
	double weight;
	String nextNodeName;
	boolean visited;
}

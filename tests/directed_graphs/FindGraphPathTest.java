package directed_graphs;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import org.junit.Test;

public class FindGraphPathTest {
	
	//this test only works for input file "words.txt".

	@Test
	public void test() {
		File file = new File("words.txt");
		FindGraphPath.fileAddress = file.getAbsolutePath();
		FindGraphPath.createGraph();
		
		String inputWord = "boom";
		FindGraphPath.findTerminationNodes(FindGraphPath.nodesList.get(FindGraphPath.searchListNodes(inputWord,FindGraphPath.nodesList)),1.0);
		
		ArrayList<TerNode> expected = new ArrayList<>();
		expected.add(new TerNode("alimentary",16.666666666666664));
		expected.add(new TerNode("littoral", 6.25));
		expected.add(new TerNode("minibus",18.749999999999996));
		expected.add(new TerNode("shellfish",8.333333333333332));
		expected.add(new TerNode("gesture",38.46153846153847));
		expected.add(new TerNode("turn",11.538461538461538));

		for(int i=0;i<expected.size();i++){
			assertEquals(expected.get(i).name,FindGraphPath.terminationNodes.get(i).name);
			assertEquals(expected.get(i).chance,FindGraphPath.terminationNodes.get(i).chance);
		}

	}

}

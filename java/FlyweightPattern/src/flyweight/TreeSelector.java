package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeSelector {
	private static Map<String,Tree> treeBySpec= new HashMap<String,Tree>();
	public static Tree getTree(String treeType){
		if(treeBySpec.containsKey(treeType))
			return treeBySpec.get(treeType);
		else{
			Tree tree = null;
			if(treeType.equals("Oak Tree")){
				tree = new OakTree();
				treeBySpec.put(treeType, tree);
			}
			else if(treeType.equals("Flowering Cherry")){
				tree = new FloweringCherry();
				treeBySpec.put(treeType, tree);
			}
			else{
				System.out.println(treeType+" not found ");
			}
			return tree;
				
		}
		
	}

}

package flyweight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestTree {
	
	public static void main(String[] args){
		List<Tree> myTreeList= new ArrayList<Tree>();
		
		for(int i=1; i<=5; i++){
			OakTree myTree;
			
			myTree =(OakTree)TreeSelector.getTree("Oak Tree");
			myTree.setRootDepth(7);
			myTreeList.add(myTree);						
			}
		
		for(int i=1; i<=5; i++){
			FloweringCherry myTree;
			
			myTree =(FloweringCherry)TreeSelector.getTree("Flowering Cherry");
			myTreeList.add(myTree);
		}

		Iterator<Tree> it= myTreeList.iterator();
		while(it.hasNext()){
			Tree t = it.next();
			if(t instanceof OakTree){
				OakTree o = (OakTree)t;
				System.out.println("Height= "+o.getHeight()+" Has Flowers= "+o.hasFlowers()+" Has Fruits= "+o.hasFruits()+" Root Depth= "+o.getRootDepth()+" Forest Type= "+o.getForestType());
			}
			else if(t instanceof FloweringCherry){
				FloweringCherry f = (FloweringCherry)t;
				System.out.println("Height= "+f.getHeight()+" Has Flowers= "+f.hasFlowers()+" Has Fruits= "+f.hasFruits()+" Flower Color= "+f.getFlowerColor());
			}
		}
	    		
		it = myTreeList.iterator();
		if(it.hasNext()){
			Tree t = it.next();
			if(t instanceof OakTree){
				OakTree o = (OakTree)t;
				o.setForestType("Evergreen");
			}
			else
			{
				FloweringCherry f = (FloweringCherry)t;
				f.setFlowerColor("Voilet");
			}
		}
		
		it = myTreeList.iterator();
		while(it.hasNext()){
			Tree t = it.next();
			if(t instanceof OakTree){
				OakTree o = (OakTree)t;
				System.out.println("Height= "+o.getHeight()+" Has Flowers= "+o.hasFlowers()+" Has Fruits= "+o.hasFruits()+" Root Depth= "+o.getRootDepth()+" Forest Type= "+o.getForestType());
			}
			else if(t instanceof FloweringCherry){
				FloweringCherry f = (FloweringCherry)t;
				System.out.println("Height= "+f.getHeight()+" Has Flowers= "+f.hasFlowers()+" Has Fruits= "+f.hasFruits()+" Flower Color= "+f.getFlowerColor());
			}
		}
								
	}

}

package flyweight;

public class OakTree extends Tree {
	private int rootDepth;
	private String forestType;
	public OakTree() {
		super(false,false,70);
		// TODO Auto-generated constructor stub
		this.forestType="Deciduous";
	}
	public int getRootDepth() {
		return rootDepth;
	}

	public void setRootDepth(int rootDepth) {
		this.rootDepth = rootDepth;
	}

	public String getForestType() {
		return forestType;
	}

	public void setForestType(String forestType) {
		this.forestType = forestType;
	}

	

	

}

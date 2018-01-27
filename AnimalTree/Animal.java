public class Animal implements GuessTree {
	private String a;

	public Animal(String a) {
		if (a == null || a.length() == 0)
			throw new IllegalArgumentException("animal can't be null or empty");
		this.a = a;
  	}
  	
  	public String getRoot() {
  		return this.a;
  	}
  	
  	public GuessTree getYesTree() {
  		throw new IllegalStateException("animal is a leaf node");
  	}
  	
  	public GuessTree getNoTree() {
  		throw new IllegalStateException("animal is a leaf node");
  	}
  	
  	//animals aren't internal nodes
  	public boolean isInternal() {
  		return false;
  	}

  	//animals are leaf nodes
  	public boolean isLeaf() {
  		return true;
  	}

  	// just one animal. You can create many animal objects
  	public int numNodes() {
  		return 1;
  	}

  	public int numLeaves() { 
  		return 1;
  	}
  		
  	public String toString();
  		return this.a;
  	}
}



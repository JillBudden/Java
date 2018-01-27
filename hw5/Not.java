public class Not implements BoolExp {
	private BoolExp n;  
	
	public Not(BoolExp n) {
		if (n == null) 
			throw new IllegalArgumentException("true must be non-null");
		this.n = n;
	}
	
	//left subtree (actually just straight down)
	public BoolExp e1() {
		return this.n;
	}
	
	//there is no right subtree
	public BoolExp e2() {
		throw new IllegalStateException("not");
	}
	
	//remember to add 1 for the node
	//recursive
	public int size() {
		return 1 + this.n.size();
	}
	
	//is either NOT true or NOT false
	public boolean isConstant() {
		return false;
	}
	
	//recursive
	//.evaluate() turns this.n into a boolean
	public boolean evaluate() {
		return !this.n.evaluate();
	}
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof BoolExp)) {
			return false;
		}
		return true; //need a final return statement
		//BoolExp that = (BoolExp) o; //downcast		
	}
		
	public String toString() {
		return "" + this.n;
	}
}



	
	


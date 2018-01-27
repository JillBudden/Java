public class Or implements BoolExp {
	private BoolExp t;
	private BoolExp f;
	
	public Or(BoolExp t, BoolExp f) {
		if (t == null || f == null)
			throw new IllegalArgumentException("true must be non-null");
		this.t = t;
		this.f = f;
	}
	
	//left side of tree
	public BoolExp e1() {
		return this.t;
	}
	
	//right side of tree
	public BoolExp e2() {
		return this.f;
	}
	
	//left + right side of tree + 1 (i.e., the node)
	//recursive
	public int size() {
		return 1 + this.t.size() + this.f.size();
	}
	
	//is either true OR false
	public boolean isConstant() {
		return false;
	}
	
	//evaluate the values of true OR false
	//Recursive
	public boolean evaluate() {
		return (this.t.evaluate() || this.f.evaluate());
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
		return "leftTree: " + this.t.toString() + "; " + "rightTree: " + this.f.toString();
	}
}

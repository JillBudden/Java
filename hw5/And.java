public class And implements BoolExp {
	private BoolExp t;
	private BoolExp f;
	
	public And(BoolExp t, BoolExp f) {
		if (t == null) 
			throw new IllegalArgumentException("true must be non-null");
		if (f == null)
			throw new IllegalArgumentException("false must be non-null");
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
	
	//size of left and right tree + the node (i.e., + 1)
	//recursive
	public int size() {
		return 1 + this.t.size() + this.f.size();
	}
	
	//could be false false or true false
	public boolean isConstant() {
		return false;
	}
	
	//evaluate the values of true AND false
	//can call .evaluate() on this.t because it is a BoolExp
	//recursive: class the evalaute() method within the evaluate() method; can do this becuase t and f are of type BoolExp
	public boolean evaluate() {
		return this.t.evaluate() && this.f.evaluate();
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
		return "leftTree: " + this.t.toString() + "; " + "rightTree: " + this.f.toString();  //call toString recursively, can call .toString on this.t and this.f because of type BoolExp
	}
}


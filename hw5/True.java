/*self note: one node of True */

public class True implements BoolExp {
	
	//don't need a constructor (or can have an empty constructor)
	
	public BoolExp e1() {
		throw new IllegalStateException("True");
	}
	
	public BoolExp e2() {
		throw new IllegalStateException("True");
	}
	
	//one True
	public int size() {
		return 1;
	}
	
	public boolean isConstant() {
		return true;
	}
	
	//evaluates to true
	public boolean evaluate() {
		return true;
	}
	
	public boolean equals(Object o) {
		return (o!=null && o instanceof True);
	}
	
	public String toString() {
		return "true";
	}
}
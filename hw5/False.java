/* self notes: one node of False */

public class False implements BoolExp {
	
	//don't need a constructor
	
	public BoolExp e1() {
		throw new IllegalStateException("False");
	}
	
	public BoolExp e2() {
		throw new IllegalStateException("False");
	}
	
	//one false
	public int size() {
		return 1;
	}
	
	//it is always false
	public boolean isConstant() {
		return true;
	}
	
	//evaluates to false
	public boolean evaluate() {
		return false;
	}
	
	public boolean equals(Object o) {
		return (o!=null && o instanceof False);
	}
	
	public String toString() {
		return "false";
	}
}
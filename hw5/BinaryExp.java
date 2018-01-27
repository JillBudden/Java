/* public enum BinaryOperator {
	ADD, SUBTRACT, MULTIPLY, RAISE
}*/

public class BinaryExp implements ArithExp {
	private BinaryOperator binop; //an enum
	private ArithExp e1;
	private ArithExp e2;
  
  	public BinaryExp(BinaryOperator binop, ArithExp e1, ArithExp e2) {
  		if (binop == null || e1 == null || e2 == null)
  			throw new IllegalArgumentException("binop, e1, and e2  must be non-null");
		this.binop = binop;
		this.e1 = e1;
		this.e2 = e2;
	}
	
	public boolean isNum() {
		return false;
	}
	
	public boolean isUnary() {
		return false;
	}
	
	public boolean isBinary() {
		return true;
	}
	
	//left subtree
	//there is only 1 arithmetic expression
	public ArithExp e1() {
		return this.e1;
	}
	
	//right subtree
	//there is only 1 arithmetic expression
	public ArithExp e2() {
		return this.e2;
	}

	//.evaluate() turns e1 and e2 into ints, can call this because e1 and e2 are of type ArithExp
	//recursive; that is, call the evalaute() method within the evaluate() method
	public int evaluate() {
		if (this.binop.equals(BinaryOperator.ADD))           //using .equals on the same type
			return this.e1.evaluate() + this.e2.evaluate();  

		if (this.binop.equals(BinaryOperator.SUBTRACT)) 
			return this.e1.evaluate() - this.e2.evaluate(); 

		if (this.binop.equals(BinaryOperator.MULTIPLY)) 
			return this.e1.evaluate() * this.e2.evaluate();

		if (this.binop.equals(BinaryOperator.RAISE)) 
			return (int)Math.pow((double)this.e1.evaluate(), (double)this.e2.evaluate());  //using Math.pow takes a double
		
		else
			return 0;  //need a final return statement
	}
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof ArithExp)) {
			return false;
		}
		return true; //need  final return statement
		//ArithExp that = (ArithExp) o; //downcast -- safe to call the ArithExp methods on o	
	}

	public String toString() {
		return this.e1.toString() + " " + this.binop + " " + this.e2.toString(); 
	}
}







	

	

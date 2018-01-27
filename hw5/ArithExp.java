public interface ArithExp {
	public boolean isNum();
	public boolean isUnary();
	public boolean isBinary();
	public ArithExp e1();
	public ArithExp e2();
	public int evaluate();
}
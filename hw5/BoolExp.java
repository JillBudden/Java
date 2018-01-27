public interface BoolExp {
	public BoolExp e1();
	public BoolExp e2();
	public int size();
	public boolean isConstant();
	public boolean evaluate();
}
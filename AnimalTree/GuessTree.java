public interface GuessTree {
	public String getRoot();
	public GuessTree getYesTree();
	public GuessTree getNoTree();
	public boolean isInternal();
	public boolean isLeaf();
	public int numNodes();
	public int numLeaves();
}
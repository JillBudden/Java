public interface BST {

	public String root();
	public BST lsub();
	public BST rsub();

	public boolean isEmpty();
	public int size();
	public int height();

	public boolean contains(String t);
	//public BST insert(String t); //skip for now

	public String minItem();
	public String maxItem();

}
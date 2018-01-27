public interface BST {

	public String root();
	public BST lsub();
	public BST rsub();

	public boolean isEmpty();
	public int size();
	public int height();

	public boolean contains(String t);

	public String minItem();
	public String maxItem();
	
	/* new methods follow ===> */
	/* We will discuss insertion and removal algorithms when we meet. 
	Please note that you should put the BST files in the same directory as the 
	MList files so that the former may make use of the latter. */
	public BST insert(String s);
	public MList<String> inorder();
	public BST noMin();
	public BST noMax();
	public BST remove(String s); /* challenging! */

}
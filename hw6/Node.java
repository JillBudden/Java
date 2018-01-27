public class Node implements BST {
	private String root;
	private BST leftTree;
	private BST rightTree;
	
	public Node(String root, BST leftTree, BST rightTree) {
		if (root == null || root.length() == 0)
			throw new IllegalArgumentException("node can't be null nor empty");
		if (leftTree == null || rightTree == null)
			throw new IllegalArgumentException("leftTree or rightTree can't be null");
		this.root = root;
		this.leftTree = leftTree;
		this.rightTree = rightTree;
	}
	
	public String root() {
		return this.root;
	}
	
	//the left subtree
	public BST lsub() {
		return this.leftTree;
	}
	
	//the right subtree
	public BST rsub() {
		return this.rightTree;
	}

	public boolean isEmpty() {
		return false;
	}
	
	//size of the leftTree and rightTree plus the node (i.e., 1)
	//recursive
	public int size() {
		return 1 + this.leftTree.size() + this.rightTree.size();
	}
	
	//check the height of the left tree and the height of the right tree + the node
	//note: the one at the beginning is counting the node
	//if no left tree or right tree height is one (use the .isEmpty() method
	//else return the max of the left or the right (whichever is taller)
	public int height() {		
		int heightLeft = this.leftTree.height();
		int heightRight = this.rightTree.height();
		
		if (this.leftTree.isEmpty() && this.rightTree.isEmpty())
			return 1;
		else
			return 1 + Math.max(heightLeft, heightRight);
	}

	//recursive
	//use comparTo method of the string class
	//The method compareTo() is used for comparing two strings lexicographically. Each character of both the strings is 
	//converted into a Unicode value for comparison. If both the strings are equal then this method returns 0 else it returns 
	//positive or negative value 
	//use a.compareTo(b) if it returns an int 0 they are the same, a negative number if a is less than b, and a positive number if a is greater than b
	//if a.compareTo(b) == 0
	//if a.compareTo(b) < 0
	//if a.compareTo(b) > 0
	public boolean contains(String t) {
		int cmp = t.compareTo(this.root);  //returns a negative number if s is before the root, returns a positive number if s is after the root
		
		if (cmp < 0)
			return this.leftTree.contains(t);
		else if (cmp > 0)
			return this.rightTree.contains(t);
		else
			return true;	
    }

	//Note: the left tree will always be less than the root in a binary search tree (start of alpha - a)
	//Note: the right tree will always be greater than the root in a binary search tree (end of alpha - z)
	//return min(root, minLeft, minRight);
	//recursive
	public String minItem() {
		if (this.leftTree.isEmpty())
			return this.root;
		else
			return this.leftTree.minItem();	
	}
	
	//same as above, recurseve
	//max(root, maxLeft, maxRight)
	public String maxItem() {
		if (this.rightTree.isEmpty())
			return this.root;
		else 
			return this.rightTree.maxItem();	
	}
	
	//if s is at the root, walk away
	//if s is on the left put it on the left
	//if s is on the right put it on the right
	public BST insert(String s) {
		int cmp = s.compareTo(this.root);
		
		if (cmp == 0)
			return this; //the tree as it is
		else if (cmp < 0)
			return new Node(this.root, this.leftTree.insert(s), this.rightTree);
		else if (cmp > 0)
			return new Node(this.root, this.leftTree, this.rightTree.insert(s));
		else
			return null;
	}
	
	//Return all the items in the tree in alphabetical order.
	public MList<String> inorder() {
		return this.leftTree.inorder().putLast(this.root).append(this.rsub.inorder());
	}
	
	/* return the tree without its max or min. It is used in the implementation of remove. 
	Note, if the tree is a singleton, return an empty tree, and, likewise, if the tree is empty, return an empty tree. */
	public BST noMin() {
		if (this.leftTree.isEmpty())
			return this.rightTree; //return the right tree with no root (because the root is the minimum item
		else
			return new Node(this.root, this.leftTree.noMin(), this.rightTree);
	}
	
	public BST noMax() {
		if (this.leftTree.isEmpty() && this.rightTree.isEmpty())
			return new Empty();
		else if (this.rightTree.isEmpty())
			return this.leftTree;
		else
			return new Node(this.root, this.leftTree, this.rightTree.noMax());
	}
	
	//challenging, leave till last
	public BST remove(String s) { 
		int c = s.compareTo(this.root);
		if (c < 0)
			return new Node(this.root, this.leftTree.remove(s), this.rightTree);
		else if (c > 0)
			return new Node(this.root, this.leftTree, this.rightTree.remove(s);
		else if (this.leftTree.isEmpty())
			return this.rightTree;
		else
			return new Node(this.left.maxItem(), this.leftTree.noMax(), this.rightTree);
	}
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof BST)) {
			return false;
		}
		BST that = (BST) o; //downcast
		return this.root.equals(that) &&     //using the .equals() of the String class for "this.root"
			   this.leftTree.equals(that) &&      //using .equals() in this method
			   this.rightTree.equals(that);  
	}
	
	public String toString() {	
		return "root: " + this.root + "; left tree: " + this.leftTree.toString() + "; right tree: " + this.rightTree.toString();   //.toString() is a recursive call
	}
	
}
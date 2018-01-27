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

	public boolean contains(String t) {
		if (this.root.equals(t))       {return true;}
		if (this.leftTree.equals(t))   {return true;}
		if (this.rightTree.equals(t))  {return true;}
		else
			return false;
		
		/* //recursive
		int cmp = t.compareTo(this.root);  //returns a negative number if s is before the root, returns a positive number if s is after the root
		if (cmp < 0)
			return this.leftTree.contains(t);
		else if (cmp > 0)
			return this.rightTree.contains(t);
		else
			return true;  //it is at the root
		*/
		
		
    }

    
	/* public BST insert(String t); */  //can skip this


	//use comparTo method of the string class
	//The method compareTo() is used for comparing two strings lexicographically. Each character of both the strings is 
	//converted into a Unicode value for comparison. If both the strings are equal then this method returns 0 else it returns 
	//positive or negative value 
	//use a.compareTo(b) if it returns an int 0 they are the same, a negative number if a is less than b, and a positive number if a is greater than b
	//if a.compareTo(b) = 0
	//if a.compareTo(b) < 0
	//if a.compareTo(b) > 0
	//CAN'T USE comparteTo without the insert method
	/////////////////////////////////////////////////
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
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof BST)) {
			return false;
		}
		BST that = (BST) o; //downcast
		return this.root.equals(that.root) &&     //using the .equals() of the String class for "this.root"
				  this.leftTree.equals(that.leftTree) &&      //using .equals() in this method... can use because this.leftTree is type BST
				  this.rightTree.equals(that.rightTree);  
		//return this.equals(that);
	}
	
	public String toString() {	
		return "root: " + this.root + "; left tree: " + this.leftTree.toString() + "; right tree: " + this.rightTree.toString();   //.toString() is a recursive call
	}
	
}
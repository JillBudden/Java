public class Empty implements BST {
	
	//empty constructor, could leave out
	public Empty() {	   
	}
	
	public String root() {
		throw new IllegalStateException("empty");
	}
	
	public BST lsub() {
		throw new IllegalStateException("empty");
	}
	
	public BST rsub() {
		throw new IllegalStateException("empty");
	}

	public boolean isEmpty() {
		return true;
	}
	
	//is empty
	public int size() {  
		return 0;
	}
	
	public int height() {
		return 0;
	}

	public boolean contains(String t) {
		return false;
	}

	public String minItem() {
		throw new IllegalStateException("empty");
	}
	
	public String maxItem() {
		throw new IllegalStateException("empty");
	}
	
	public BST insert(String s) {
		throw new IllegalStateException("empty");
	}
	
	//Return all the items in the tree in alphabetical order.
	public MList<String> inorder() {
		return new Nil<string>();
	}
	
	/* return the tree without its max or min. It is used in the implementation of remove. 
	Note, if the tree is a singleton, return an empty tree, and, likewise, if the tree is empty, return an empty tree.*/
	public BST noMin() {
		return new Empty();
	}
	
	public BST noMax() {
		return new Empty();
	}
	
	public BST remove(String s) { 
		throw new IllegalStateException("empty");
	}
	
	public boolean equals(Object o) {
		return (o!=null && o instanceof Empty);
	}
	
	public String toString() {
		return "empty";
	}
	
}
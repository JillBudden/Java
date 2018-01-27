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
	
	//public BST insert(String t); // don't have to do this right now

	public String minItem() {
		throw new IllegalStateException("empty");
	}
	
	public String maxItem() {
		throw new IllegalStateException("empty");
	}
	
	public boolean equals(Object o) {
		return (o!=null && o instanceof Empty);
	}
	
	public String toString() {
		return "empty";
	}
	
}
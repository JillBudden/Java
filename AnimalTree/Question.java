public class Question implements GuessTree {

	private String q; /* text of the question */
	private GuessTree yes;
	private GuessTree no;

	public Question(String q, GuessTree y, GuessTree n) {
		if (q==null || q.length()==0)
			throw new IllegalArgumentException("question text must be non-null and non-empty");
		if (y==null)
			throw new IllegalArgumentException("yes tree must be non-null");
		if (n==null)
			throw new IllegalArgumentException("no tree must be non-null");
		this.q   = q;
		this.yes = y;
		this.no  = n;
	}
  
	public String getRoot() {
		return this.q;
	}
	
	//left subtree
	public GuessTree getYesTree() {
		return this.yes;            //note: don't need the "this" becuase the yes vs y are different
	}
	
	//right subtree
	public GuessTree getNoTree() {
		return this.no;
	}
	
	//only questions are internal (note: questions can be: "is it a dragon?")
	public boolean isInternal() {
		return true;
	}
	
	//a question node will never be a leaf (animals are leaves)
	public boolean isLeaf() {
		return false;
	}
	
	////Number of internal nodes on left, number of internal nodes on right + 1 (the root)
	//recursive (i.e., call the current method within the current method); can do this because yes and no are of type GuessTree
	public int numNodes() {
		return 1 + this.yes.numNodes() + this.no.numNodes();
	}
	
	//recursive
	public int numLeaves() {
		return this.yes.numLeaves() + this.no.numLeaves();
	}
		
	public String toString() {
		return this.q + "(" + this.yes.toString() + "," + this.no.toString() + ")";
	}
}






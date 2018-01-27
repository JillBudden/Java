public class TestBST {
	
	public static void main(String[] args) {
		BST b1 = new Empty();
		BST b2 = new Node("B", new Empty(), new Empty());
		
		BST b3 = new Node("B", new Empty(), new Empty()); 

		System.out.println(b1.toString());

		System.out.println("b2.root(): " + b2.root());
		System.out.println("b2.lsub(): " + b2.lsub());
		System.out.println("b2.rsub(): " + b2.rsub());
		System.out.println("b2.isEmpty(): " + b2.isEmpty());
		System.out.println("b2.size(): " + b2.size());
		System.out.println("b2.height(): " + b2.height());
		System.out.println("b2.contains(): true " + b2.contains("B"));
		System.out.println("b2.minItem(): " + b2.minItem());
		System.out.println("b2.maxItem(): " + b2.maxItem());
		//System.out.println("b2.inorder(): " + b2.inorder());
		System.out.println("b2.noMin(): " + b2.noMin());
		System.out.println("b2.noMax(): " + b2.noMax());
		
		
		System.out.println("b3.insert(): " + b3.insert("c"));
		b3.insert("d");
		b3.insert("a");
		b3.insert("e");
		//System.out.println("b3.inorder(): " + b3.inorder());
		System.out.println("b3.noMin(): " + b3.noMin());
		System.out.println("b3.noMax(): " + b3.noMax());
		//System.out.println("b3.remove(): " + b3.remove('d');
	}

}

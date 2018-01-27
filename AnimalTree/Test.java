public class Test {
	public static void main (String[] args) {

		//note: are played out in order
		GuessTree pelican = new Animal("pelican");
		GuessTree sloth = new Animal("sloth");
		GuessTree whale = new Animal("blue whale");
		GuessTree otter = new Animal("sea otter");
		
		GuessTree canFly = new Question("Can it fly?", pelican, sloth);
		GuessTree huge = new Question("is it huge?", whale, otter);
		
		GuessTree sea = new Question("Is it a sea creature?", huge, canFly);  //can use canFly and huge becuase they are type GuessTree... builds the tree
		
		System.out.println("canFly is " + canFly);
		System.out.println("huge is " + huge);
		System.out.println("sea is " + sea);
		
		///////////////////////////////////////////////////////////
		//loop example
		private void testTree(GuessTree t) {
			System.out.println("the current tree is " + t);
			System.out.println(" .numNodes is " + t.numNodes());
			System.out.println(" .numLeaves is " + t.numLeaves());
			System.out.println(" .isInternal is " + t.isInternal());
			System.out.println(" .isLeaf is " + t.isLeaf());
			System.lut.println();
		}
		
		public statis void main(String[] args) {
			GuessTree pelican = new Animal("pelican");
			GuessTree sloth = new Animal("sloth");
			GuessTree whale = new Animal("blue whale");
			GuessTree otter = new Animal("sea otter");
			GuessTree canFly = new Question("Can it fly?", pelican, sloth);
			GuessTree huge = new Question("is it huge?", whale, otter);
			GuessTree sea = new Question("Is it a sea creature?", huge, canFly);
			System.out.println("canFly is " + canFly);
			System.out.println("huge is " + huge);
			System.out.println("sea is " + sea);
		
			//test all
			GuessTree[] allTrees = new GuessTree[] {pelican, sloth, whale, otter, canFly, huge, sea};
			for (GuessTree t : allTrees)
				testTree(t);
			
			//or one at a time
			testTree(pelican);
			testTree(sloth);
		}
		
		//////////////////////////////////////////////////////////////
			
	}
}







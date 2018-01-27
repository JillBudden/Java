import java.util.Scanner;

public class PlayGame {
	
	//return true for yes and false for no
	private static boolean yesOrNo(Scanner scanner) {
		String response = scanner.nextLine();
		if (response.equals("yes"))
			return true;
		if (response.equals("no"))
			return false;
		System.out.println("(Please answer \'yes\' or \'no\'.....") //need to finish this
	}

	public static void main(String[] args) {
		//building the tree
		GuessTree pelican = new Animal("pelican");
		GuessTree sloth = new Animal("sloth");
		GuessTree whale = new Animal("blue whale");
		GuessTree otter = new Animal("sea otter");
		GuessTree canFly = new Question("Can it fly?", pelican, sloth);
		GuessTree huge = new Question("is it huge?", whale, otter);
		GuessTree sea = new Question("Is it a sea creature?", huge, canFly);
			
		GuessTree current = sea;
		
		while (true) {
			if (current.isInternal()) {
				//present question to the user
				System.out.println(current.getRoot());
				//boolean userSaysYes = yesOrNo(scanner);
				current = yesOrNo(scanner ? current.getYesTree() : current.getNoTree();
				String response = scanner.nextLine();
				if (response.equals("yes")) {
					current = current.getYesTree():
				} else (response.equals("no)) {
					current = current.getNoTree();
				}
				//} else {
					//System.out.println("I have no idea wha tyou are talking about.");
					//return;
				}
			} else {
				//present animal guess to the player
				System.out.println("I have a guess!");
				System.out.println("Is it a/an " + current.getRoot() + "?");
				System.out.println(yesOrNo(scanner) ? "Hooray!" : "D'oh!");
				return;
				//String response = scanner.nextLine();
				//if (response.equals("yes")) {
					//System.out.pringln("Hooray! you won!";
				//} else if {response.equals("no")) {
					System.out.println("sorry, that's not right");
				//} else {
					//System.out.println("I have no idea wha tyou are talking about.");
					//return;
						
			}
		}
		
}



//////////////July 24 instructor provided class notes///////////////////


import java.util.Scanner;

public class PlayGame {

    /* return true for "yes" and false for "no" */
    private static boolean yesOrNo(Scanner scanner) {
        String response = scanner.nextLine();
        if (response.equals("yes"))
            return true;
        if (response.equals("no"))
            return false;
        System.out.println("(Please answer \"yes\" or \"no\".)");
        return yesOrNo(scanner);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GuessTree pelican = new Animal("pelican");
        GuessTree sloth   = new Animal("sloth");
        GuessTree whale   = new Animal("blue whale");
        GuessTree otter   = new Animal("sea otter");
        GuessTree canFly  = new Question("Can it fly?",pelican,sloth);
        GuessTree huge    = new Question("Is it huge?",whale,otter);
        GuessTree sea     = new Question("Is it a sea creature?",huge,canFly);

        GuessTree current = sea;

        while (true) {
            if (current.isInternal()) {
                // present question to the player                                                              System.out.println(current.getRoot());
                current = yesOrNo(scanner) ? current.getYesTree() : current.getNoTree();
            } else {
                // present animal guess to the player                                                          System.out.println("I have a guess!");
                System.out.println("Is it a/an " + current.getRoot() + "?");
                System.out.println(yesOrNo(scanner) ? "Hooray!" : "D'oh!");
                return;
            }
        }

    }

}

/////////////////////////////////////////////////////



/* Monday July 24 self class notes

aside:
-a static method belongs to a class; a non static method belongs to objects in the class, rather than the whole class.
-square root is a static method of the math class.

//Computer programs are trees
//Databases are trees (sometimes)
//Compiler takes your code and turns it into a tree
//ex: boolean expressions: True is a tree that is just a leaf node
//tree && false: put and at the root; then put true on the left and false on the right





///improving the game: build a new tree and hook it in at the end (chimp and sloth example in class)
///problem, when quit the program the data goes away... the enitre heap is washed away and gone
///the tree is getting rebuilt every time
/* if tree is permanetly smarter need to resume from the disk. There is an interface called 
"seriesaliable" (sp?) -- to serialize and save it to disk and read it from the disk */




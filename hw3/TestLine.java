public class TestLine {
	public static void main (String[] args) {		
		LineObj p1 = new LineObj(.50, 1.5);
		System.out.println("p1 is y = .50x + 1.5");
		System.out.println("p1.getSlope(): " + p1.getSlope());
		System.out.println(p1.toString());
		
		LineObj p2 = new LineObj(.2, 2);
		System.out.println(p2.toString());
		System.out.println("p2.getYIntercept(): " + p2.getYIntercept());
	}
    
}



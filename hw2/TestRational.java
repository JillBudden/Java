public class TestRational {
	public static void main (String[] args) {
		RationalObject p1 = new RationalObject(4, 2);
		System.out.println("p1 is '2'");
		
		RationalObject p2 = new RationalObject(8, 4);
		System.out.println(p2.toString());
		
		RationalObject p3 = new RationalObject(8, 0);
		System.out.println("denominator can not be 0");
	}
}


//TestRational is missing tests for everything except toString


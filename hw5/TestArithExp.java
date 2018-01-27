public class TestArithExp {
	
	public static void main(String[] args) {
		ArithExp a3 = new Num(5);
		
		ArithExp a4 = new UnaryExp(UnaryOperator.NEGATE, new Num(5));  //self note: bring Num in here, Num is of tpe ArithExp
		ArithExp a5 = new UnaryExp(UnaryOperator.ABS, new Num(-4));
		ArithExp a6 = new UnaryExp(UnaryOperator.SQUARE, new Num(2));
		
		ArithExp a7 = new BinaryExp(BinaryOperator.ADD, new Num(2), new Num(2));
		ArithExp a8 = new BinaryExp(BinaryOperator.SUBTRACT, new Num(2), new Num(2));
		ArithExp a9 = new BinaryExp(BinaryOperator.MULTIPLY, a3, a3);
		ArithExp a10 = new BinaryExp(BinaryOperator.RAISE, new Num(2), new Num(3));
		

		System.out.println(a3.toString());
		System.out.println(a4.toString());
		System.out.println(a7.toString());

		System.out.println("a3.isNum(): true: " + a3.isNum());
		System.out.println("a4.isUnary(): true: " + a4.isUnary());
		System.out.println("a7.isBinary(): true: " + a7.isBinary());
		//System.out.println("a6.e2(): throws exception" + a6.e2());  //throws exception
		System.out.println("a10.e1: 2: " + a10.e1());
		System.out.println("a10.e2: 3: " + a10.e2());

		System.out.println("a4.evaluate (negate 5 = -5): " + a4.evaluate());
		System.out.println("a5.evaluate (abs = -4 = 4): " + a5.evaluate());
		System.out.println("a6.evaluate (square 2 = 4): " + a6.evaluate());
		System.out.println("a7.evaluate (2 + 2 = 4): " + a7.evaluate());
		System.out.println("a8.evaluate (5 - 2 = 3): " + a8.evaluate());
		System.out.println("a9.evaluate (5 * 5 = 25): " + a9.evaluate());
		System.out.println("a10.evaluate (2^3 = 8): " + a10.evaluate());
		
	}

}



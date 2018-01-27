public class TestBool {
	public static void main (String[] args) {

		BoolExp b3 = new True();
		BoolExp b4 = new False();
		
		BoolExp b5 = new And(b3, b4);
		BoolExp b6 = new Or(b4, b4);
		BoolExp b7 = new Not(b3);
		BoolExp b8 = new And(new True(), new False());
		BoolExp b9 = new And(new True(), b7);  

		System.out.println(b3.toString());
		System.out.println(b4.toString());
		System.out.println(b5.toString());
		System.out.println(b6.toString());
		System.out.println(b7.toString());
		System.out.println(b8.toString());
		System.out.println(b9.toString());
		
		//True
		System.out.println("b3.size() " + b3.size());
		System.out.println("b3.isConstant() " + b3.isConstant());
		System.out.println("b3.evaluate() " + b3.evaluate());
		System.out.println("b3.e1() " + b3.e1());
		System.out.println("b3.e1() " + b3.e2());

		//False
		System.out.println("b4.size() " + b4.size());
		System.out.println("b4.isConstant() " + b4.isConstant());
		System.out.println("b4.evaluate() " + b4.evaluate());
		System.out.println("b4.e1() " + b4.e1());
		System.out.println("b4.e1() " + b4.e2());
		
		//and
		System.out.println("b5.size() " + b5.size());
		System.out.println("b5.isConstant() " + b5.isConstant());
		System.out.println("b8.evaluate() " + b8.evaluate());
		System.out.println("b9.e1() " + b9.e1());
		System.out.println("b9.e1() " + b9.e2());
		
		//or
		System.out.println("b6.size() " + b6.size());
		System.out.println("b6.isConstant() " + b6.isConstant());
		System.out.println("b6.evaluate() " + b6.evaluate());
		System.out.println("b6.e1() " + b6.e1());
		System.out.println("b6.e1() " + b6.e2());
		
		//not
		System.out.println("b7.size() " + b7.size());
		System.out.println("b7.isConstant() " + b7.isConstant());
		System.out.println("b7.evaluate() " + b7.evaluate());
		System.out.println("b7.e1() " + b7.e1());
		System.out.println("b7.e1() " + b7.e2());
		
	}
}





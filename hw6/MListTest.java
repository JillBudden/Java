public class MListTest {
	
	public static void main(String[] args) {
		
		MList m1 = new Nil();
		
		MList m2 = new Cons('b', new Nil());
		MList m3 = new Cons('a', m2);
		MList m4 = new Cons('c', m3);
		
		//T[] test = (T[])(new Object[] {'a', 'b', 'c', 'd', 'e'});
		
		MList m5 = new MArrayList();
	
		System.out.println(m1.toString());
		System.out.println(m4.toString());
		System.out.println(m5.toString());

		
		System.out.println("m1.isEmpty(): " + m1.isEmpty());
		//System.out.println("m1.first(): " + m1.first());
		//System.out.println("m1.last(): " + m1.last());
		//System.out.println("m1.rest(): " + m1.rest());
		//System.out.println("m1.nth(int n): " + m1.nth(3));
		//System.out.println("m1.length(): " + m1.length());
		System.out.println("m1.putLast(T t): " + m1.putLast('t'));
		System.out.println("m1.append(MList<T> that): " + m1.append(m4));
		//System.out.println("m1.contains(T t): " + m1.contains('t'));
		
		
		System.out.println("m4.isEmpty(): " + m4.isEmpty());
		System.out.println("m2.first(): " + m2.first());
		System.out.println("m4.last(): " + m4.last());
		System.out.println("m4.rest(): " + m4.rest());
		System.out.println("m4.nth(int n): " + m4.nth(1));
		System.out.println("m4.length(): " + m4.length());
		System.out.println("m4.putLast(T t): " + m4.putLast('t'));
		System.out.println("m4.append(MList<T> that): " + m4.append(m3));
		System.out.println("m4.contains(T t): " + m4.contains('t'));
		
		
		System.out.println("m5.isEmpty(): " + m5.isEmpty());
		//System.out.println("m5.first(): " + m5.first());
		//System.out.println("m5.last(): " + m5.last());
		//System.out.println("m5.rest(): " + m5.rest());
		//System.out.println("m5.nth(int n): " + m5.nth(1));
		//System.out.println("m5.length(): " + m5.length());
		//System.out.println("m5.putLast(T t): " + m5.putLast('t'));
		//System.out.println("m5.append(MList<T> that): " + m5.append(m4));
		//System.out.println("m5.contains(T t): " + m5.contains('t'));	
	}

}
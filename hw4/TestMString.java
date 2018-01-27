public class TestMString {
	public static void main (String[] args) {	
		char[] test = new char[] {'a', 'b', 'c', 'd'};			
		MString m1 = new MStringObject(test);
		MString m2 = new MStringObject(test);
		System.out.println(m1.toString());
		System.out.println("m1.length " + m1.length());
		System.out.println("m1.contains() " + m1.contains('c'));
		System.out.println("m1.count('a') " + m1.count('a'));
		System.out.println("m1.isAllDigits() " + m1.isAllDigits());
		System.out.println("m1.isAllLetters() " + m1.isAllLetters());
		System.out.println("m1.isAllUppers() " + m1.isAllUppers());
		System.out.println("m1.isAllLowers() " + m1.isAllLowers());
		System.out.println("m1.charAt(0) " + m1.charAt(0));
		System.out.println("m1.same(m2) " + m1.same(m2));
		System.out.println("m1.append() " + m1.append(m2));
		System.out.println("m1.reverse() " + m1.reverse());
		System.out.println("m1.isPalindrome() " + m1.isPalindrome());
		System.out.println("m1.indexOfFirst() " + m1.indexofFirst());
	}
}




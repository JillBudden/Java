public class TestMString {
	public static void main (String[] args) {	
		char[] test = new char[] {'p', 'r', 'e', 'c', 'c', 's', 'u', 'f'};		//' ' = whitespace
		char[] test2 = new char[] {'a', 'b', 'c', 'd'};
		MString m1 = new MStringObject(test);
		MString m2 = new MStringObject(test);
		MString m3 = new MStringObject(test2);
		
		System.out.println(m1.toString());
		
		System.out.println("m1.length " + m1.length());
		System.out.println("m1.contains() " + m1.contains('b'));
		System.out.println("m1.count('a') " + m1.count('b'));
		System.out.println("m1.isAllDigits() " + m1.isAllDigits());
		System.out.println("m1.isAllLetters() " + m1.isAllLetters());
		System.out.println("m1.isAllUppers() " + m1.isAllUppers());
		System.out.println("m1.isAllLowers() " + m1.isAllLowers());
		System.out.println("m1.charAt(0) " + m1.charAt(1));
		System.out.println("m1.same(m2) " + m1.same(m2));
		System.out.println("m1.append() " + m1.append(m2));
		System.out.println("m1.reverse() " + m1.reverse());
		System.out.println("m1.isPalindrome() " + m1.isPalindrome());
		System.out.println("m1.indexOfFirst() " + m1.indexOfFirst('c'));
		System.out.println("m1.startsWith(pre): false: " + m1.startsWith(m3));  //need MString object as input
		System.out.println("m1.endsWith(suf): true: " + m1.endsWith(m3));       //need MString object as input
		System.out.println("m1.trim(): " + m1.trim()); 
		System.out.println("m1.substring(int start, int len): " + m1.substring(1, 3));
		System.out.println("m1.delete(char c): " + m1.delete('c'));
		System.out.println("m1.substitute(char c1, char c2): " + m1.substitute('c', 'a'));
	}
}



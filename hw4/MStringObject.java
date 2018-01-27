/* Instructions:
- Provide two constructors for MStringObject, one with no arguments, and one with a char[] argument. The no-arguments constructor 
should construct an empty string object. In the constructor that takes a char[], make sure that array is not the special value null; 
raise an IllegalArgumentException if it is. Note there will be two ways to construct an empty string object: namely, by using the 
no-arguments constructor, and by passing a zero-length array to the constructor that consumes a char[].

- To test whether a char represents a digit, you may use the built-in method Character.isDigit 
(see http://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isDigit(char)). Similarly, you may use Character.isLetter, 
Character.isUpperCase and Character.isLowerCase to test for letters, uppercase letters, and lowercase letters respectively.

- For charAt, either return the individual character at that position (with 0 the index of the first character), or, if the index 
is out of bounds (like asking for the 10th character of "foo"), throw an IllegalArgumentException.

- For reverse, return a freshly-constructed MString that contains the characters of the original string in reverse order. That is, 
if the current object represents "abc", the reverse should return a new object representing "cba".

- For isPalindrome, return true if the string is the same backwards and forwards, and false otherwise. "ABBA" and "racecar" are 
palindromes, "ABBa" is not, and "foo" is (obviously) not. Note that judicious use of existing methods can make this easy to implement.

- For indexOfFirst, return an Integer object representing the index of the first occurrence of the char c, or the special value 
null if the character doesn't appear. For example, in the MString representing "abac", the index of the first 'a' is 0, the index of 
the first 'b' is 1, the index of the first 'c' is 3, and the index of the first 'x' is null. You construct an Integer object with 
the standard "new" syntax and an int argument, as in new Integer(1).

*/

public class MStringObject implements MString {
	private char[] ch;
	
	public MStringObject() {
		this.ch = new char[0];
	}
	
	public MStringObject(char[] ch) {
		if (ch == null) {
			throw new IllegalArgumentException("char is null");
		}
		this.ch = ch;
	}
	
    public int length() {
    	return this.ch.length;
    }
    
    /*
    public boolean contains(char c) {
    	int count = 0;
    	for (int i = 0; i < this.ch.length; i++) {
    		if (this.ch[i] == c) {
    			count += 1; 
    		}
    	}
    	return count >= 1;  //true or false
    } */
    
    public boolean contains(char c) {
    	for (char d : this.ch) 
    		if (d == c) 
    			return true;
		return false;
    }

    public int count(char c) {
    	int count = 0;
    	for (int i = 0; i < this.ch.length; i++) {
    		if (this.ch[i] == c) {
    			count += 1;
    		}
    	}
    	return count;	
   	}	
    
    //Use Character.isDigit
    public boolean isAllDigits() {
    	for (int i = 0; i < this.ch.length; i++) 
    		if (!Character.isDigit(this.ch[i]))
    			return false;
    	
    	return true;
    }
 
    //Use Character.isLetter
    //alternative loop code
    public boolean isAllLetters() {	
		for (char c : this.ch)           //loop through this.ch and check if each item is a letter/character
	    	if (!Character.isLetter(c))
				return false;
		
		return true;
    }
    
    //Use Character.isUpperCase
    public boolean isAllUppers() {
		for (char c : this.ch) 
			if (!Character.isUpperCase(c))
				return false;

		return true;
    }
    
    //Use Character.isLowerCase
    public boolean isAllLowers() {
		for (char c : this.ch) 
	    	if (!Character.isLowerCase(c))
				return false;
			
		return true;
    }

    /* either return the individual character at that position (with 0 the index of the first character), or, if the index 
        is out of bounds (like asking for the 10th character of "foo"), throw an IllegalArgumentException. */
    public char charAt(int i) {
    	if (i > this.ch.length) {
    		throw new IllegalArgumentException("array index is out of bounds");
    	}
    	return this.ch[i];
    }
    
    public boolean same(MString s) {
    	if (s == null) {
			throw new IllegalArgumentException("MString s is null");
		}
    	return this.ch.equals(s); 
    }
    
    public boolean equals(Object o) {
    	if (o == null) {
			return false;
		}
		if (!(o instanceof MString)) {
			return false;
		}
		MString that = (MString) o; //dc for "Downcast"
		return this.equas(that);  //drop "ch" because .same belongs to the MString class, not to the array "this.ch"

		//MString s1 = new MStringObject(this.ch);   //these two lines work as well, what I originally turned in
		//return s1.same(dc);  //used .equals in the same() method	
    }

    // if you have a string "a", and append "b" to it, you get "ab"
    /* Create a new character array that is long enough to hold all the characters in both strings. Then fill that array 
    with the characters from the first, then the second. Then construct an MStringObjects from that array. */
	public MString append(MString s) {
    	if (s == null) {
    		throw new IllegalArgumentException("MString s is null");
    	}
    	
    	int x = this.ch.length + s.length(); // Note, use .length with arrays (a read-only instance variable) 
    	char[] app = new char[x];
    	int count = 0;
    	//adding characters from the first array
    	for (int i = 0; i < this.ch.length; i++) { 
    		app[i] = this.ch[i];
    		count += 1;
    	}
    	//adding characters from the second array
    	for (int i = 0; i < s.length(); i++) {
    		app[y] = s.charAt(i);    //i is an int in the charAt() method
    		count += 1;
    	}
    	return new MStringObject(app);
    }
    	
    /* For reverse, return a freshly-constructed MString that contains the characters of the original string in reverse order. 
    That is, if the current object represents "abc", the reverse should return a new object representing "cba". */
	public MString reverse() {
		int x = this.ch.length;
    	char[] rev = new char[x];
    	for (int i = x - 1; i >= 0; i--) { // Note 0 index, hence x - 1 to start
    		rev[i] = this.ch[i];
        }    
    	MString mm2 = new MStringObject(rev);
    	return mm2;
    }

    /* For isPalindrome, return true if the string is the same backwards and forwards, and false otherwise. 
       "ABBA" and "racecar" are palindromes, "ABBa" is not, and "foo" is (obviously) not. Note that judicious 
       use of existing methods can make this easy to implement. */
    public boolean isPalindrome() {
    	return this.equals(this.reverse()); //need to remove "ch" after "this" because .equals and .reverse belong to the MString class, not the array "this.ch". 
    
    /* For indexOfFirst, return an Integer object representing the index of the first occurrence of the char c, or the special value 
	null if the character doesn't appear. For example, in the MString representing "abac", the index of the first 'a' is 0, the index of 
	the first 'b' is 1, the index of the first 'c' is 3, and the index of the first 'x' is null. You construct an Integer object with 
	the standard "new" syntax and an int argument, as in new Integer(1) */
    public Integer indexOfFirst(char c) {
    	//if (c == null) {
    		//throw new IllegalArgumentException("Integer is null");
    	//} 
    	int index = 0;
    	for (int i = 0; i < this.ch.length; i++) {
    		if (this.ch[i] != c) {
    			index += 1; 
    		}
    		if (this.ch[i] == c) {
    			index -= 1; // -1 because of zero index
    			break; // break out of the loop - we want to stop here
    		}
    		if (index == this.ch.length) {
    		return null;
    		}
    	}
    	Integer iof = new Integer(i); //create Integer object //output of indexOfFirst is always 1, regardless of input
    	return iof;
    }
    
    /* or this
      public Integer indexOfFirst(char c) {
		for (int i = 0; i < this.ch.length; i++)
	    	if (ch[i] == c)
				return new Integer(i);
		return null;
    } */
    
    
    public String toString() {
    	return new String(this.ch);
	}   
}

 
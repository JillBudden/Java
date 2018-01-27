public interface MString {
    public int length();
    public boolean contains(char c);
    public int count(char c);
    public boolean isAllDigits();
    public boolean isAllLetters();
    public boolean isAllUppers();
    public boolean isAllLowers();
    public char charAt(int i);
    public boolean same(MString s);
    public boolean equals(Object o);
  
    // if you have a string "a", and append "b" to it, you get "ab"
    public MString append(MString s);  

    public MString reverse();
    public boolean isPalindrome();
    public Integer indexOfFirst(char c);
    
    ///////////////New Methods//////////////////////////////
    public boolean startsWith(MString pre);

    public boolean endsWith(MString suf);

    /* trim: return a new string without either leading or trailing whitespace */
    /* use Character.isWhitespace to determine what is whitespace */
    public MString trim(); 

    /* substring: the substring starting at position "start" and length "len" */
    /* if the substring goes past the end, throw an IndexOutOfBoundsException */
    public MString substring(int start, int len); 
    
    /* delete: remove all occurrences of the given character */
    /* ex: deleting 'x' from "axbxcx" should produce a new MString "abc" */
    public MString delete(char c);

    /* substitute: replace every occurrence of c1 with c2 */
    /* ex: given "axbxcx", if c1 is 'x' and c2 is 'y', the result is "aybycy" */
    public MString substitute(char c1, char c2); 
    
    public String toString();
}

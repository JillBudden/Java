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
    public String toString();
}

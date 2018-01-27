public interface DateInterface {
    public int getMonth(); // on [1,12]
    public int getDay();   // on [1,31]
    public int getYear();  // on [1900,2100)
    public boolean same(DateInterface that);   // true if this represents same date as "that"
    public boolean before(DateInterface that); // true if this is before "that"
    public boolean after(DateInterface that);  // true if this is after "that"
    public String toString();
}


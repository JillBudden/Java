public interface TimeInterface {
    public int getHour();   // on interval [0,24)
    public int getMinute(); // on [0,60)
    public int getSecond(); // on [0,60)
    public boolean same(TimeInterface that);   // true if this represents same time as "that"
    public boolean before(TimeInterface that); // true if this is before "that"
    public boolean after(TimeInterface that);  // true is this is after "that"
    public String toString(); // like "9:04:23" or "13:00:01"
    
}
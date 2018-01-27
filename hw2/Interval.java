public interface Interval {
    public double width();
    public boolean isEmpty();
    public double getLeft();
    public double getRight();
    public boolean contains(double x);
    public boolean overlaps(Interval i);
    public String toString();
}
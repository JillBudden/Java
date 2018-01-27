public class TestInterval {
    public static void main (String[] args) {
    	EmptyIntervalObject p1 = new EmptyIntervalObject();
    	System.out.println("EmptyInterval is: empty");
    	System.out.println(p1.toString());
    	System.out.println("p1.width() " + p1.width());
    	System.out.println("p1.isEmpty() " + p1.isEmpty());
    	System.out.println("p1.getLeft() " + p1.getLeft());
    	System.out.println("p1.getRight() " + p1.getRight());
    	System.out.println("p1.contains(double x) " + p1.contains(2.1) );
    	// System.out.println("p1.overlaps(Interval i) " + p1.overlaps(Interval i)); 
    	   	
    	CCIntervalObject p2 = new CCIntervalObject(1.2, 4.5);
    	System.out.println("CCInterval is: [1.2, 4.5]");
    	System.out.println(p2.toString());
    	System.out.println("p2.width() " + p2.width());
    	System.out.println("p2.isEmpty() " + p2.isEmpty());
    	System.out.println("p2.getLeft() " + p2.getLeft());
    	System.out.println("p2.getRight() " + p2.getRight());
    	System.out.println("p2.contains(double x) " + p2.contains(2.1));
    	// System.out.println("p2.overlaps(Interval i) " + p2.overlaps(Interval i));
    	
    	COIntervalObject p3 = new COIntervalObject(1.2, 4.5);
    	System.out.println("COInterval is: [1.2, 4.5)");
    	System.out.println(p3.toString());
    	System.out.println("p3.width() " + p3.width());
    	System.out.println("p3.isEmpty() " + p3.isEmpty());
    	System.out.println("p3.getLeft() " + p3.getLeft());
    	System.out.println("p3.getRight() " + p3.getRight());
    	System.out.println("p3.contains(double x) " + p3.contains(2.1));
    	// System.out.println("p3.overlaps(Interval i) " + p3.overlaps(Interval i));
    	 
    	OCIntervalObject p4 = new OCIntervalObject(1.2, 4.5);
    	System.out.println("OCInterval is: (1.2, 4.5]");
    	System.out.println(p4.toString());
    	System.out.println("p4.width() " + p4.width());
    	System.out.println("p4.isEmpty() " + p4.isEmpty());
    	System.out.println("p4.getLeft() " + p4.getLeft());
    	System.out.println("p4.getRight() " + p4.getRight());
    	System.out.println("p4.contains(double x) " + p4.contains(2.1));
    	// System.out.println("p4.overlaps(Interval i) " + p4.overlaps(Interval i));
    	
    	OOIntervalObject p5 = new OOIntervalObject(1.2, 4.5);
    	System.out.println("OCInterval is: (1.2, 4.5)");
    	System.out.println(p5.toString());
    	System.out.println("p5.width() " + p5.width());
    	System.out.println("p5.isEmpty() " + p5.isEmpty());
    	System.out.println("p5.getLeft() " + p5.getLeft());
    	System.out.println("p5.getRight() " + p5.getRight());
    	System.out.println("p5.contains(double x) " + p5.contains(2.1));
    	// System.out.println("p5.overlaps(Interval i) " + p5.overlaps(Interval i));
	}
	
}


// TestInterval.java is missing testing for impossible cases. (-0.5 coverage)
/* interval test from instructor notes: 
i.contains(this.r)
i.contains(this.l)
either of the two previous tests suffices
either this.contains(i.getLeft()) or this.contains(i.getRight()) suffices E: this.l==that.getLeft() && this.r==that.getRight()
*/

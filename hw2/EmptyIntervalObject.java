/*
This is to represent either the empty interval, which contains nothing and has 0 width, or non-empty intervals that are either open or closed on either side. 

In mathematics, we write a closed interval like this:

[1.2,4.5]

This interval is closed on the left and right, so it includes 1.2, 4.5 and all numbers in between. A similar open interval is

(1.2, 4.5)

which contains all numbers strictly between 1.2 and 4.5, but neither 1.2 nor 4.5 itself.

An interval can be closed on one side and open on the other, written like so:

[1.2,4.5) (this contains 1.2 but not 4.5)
(1.2,4.5] (this contains 4.5 but not 1.2)

Please note that all four of these intervals, despite their differences at the endpoints, have the same width, which is (4.5-1.2) = 3.3.

You are to provide five different interval implementations of the interface Interval, with the following names:

EmptyInterval
OOInterval
OCInterval
COInterval
CCInterval

These represent, in order, the empty interval; an interval open on both sides (open-open interval, which is what "OO" stands for); 
an interval open on the left, closed on the right; an interval closed on the left, open on the right; and a closed-closed interval ("CC"). 

All intervals except the EmptyInterval must not be allowed to be empty. The constructors for the other four Interval implementations 
should consume two doubles, representing a left bound and a right bound, respectively. If the value of the left bound equals or 
exceeds the right bound at construction time, then your code should throw an IllegalArgumentException and complain about the left bound.

The constructor for EmptyInterval should take no arguments. As a String, the empty interval can simply be written "empty".

The EmptyInterval should throw an IllegalStateException if either method getLeft() or getRight() is called on it.

Please note: the empty interval overlaps no other intervals.

Write one tester class TestInterval to test all five kinds of intervals.
*/


public class EmptyIntervalObject implements Interval { //empty interval

    public EmptyIntervalObject() {
    }
    
    // return 0.0
    public double width() {
    	double w = 0.0;
    	return  w;
    }
    
    // return true
	public boolean isEmpty() {
		return true;
	}
	
	public double getLeft() {
		throw new IllegalStateException("can not call getLeft() on empty interval"); 
	}
	
    public double getRight() {
    	throw new IllegalStateException("can not call getRight() on empty interval");
    }

	// return false
 	public boolean contains(double x) {
 		return false;
 	}
 	
 	//overlaps with no other intervals: returns false
 	public boolean overlaps(Interval i) {
 		return false;
 	}
 	
 	public String toString() {
 		return "empty";
 	}
 	
}


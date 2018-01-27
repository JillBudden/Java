/* Instructions:

A Line is a representation of a line in the familiar point/slope form. In the present case we will not concern ourselves 
with vertical lines, which have different characteristics; you may simply overlook vertical lines for the time being.

A nonvertical line can be expressed as y = mx + b for slope m and y-intercept b. Therefore your private instance variables 
for a LineObject should be two doubles, one for each of these.

Please note I have dropped Interface in this name, and I am using just Line. You will need to get used to interface names not 
explicitly saying what they are.

interface contents:
    public double getSlope();
    public double getYIntercept();
    public String toString();

*/

public class LineObj implements Line {
    private double m;  //slope
    private double b;  //intercept

    public LineObj (double m, double b) {
    	this.m = m;
    	this.b = b;
    }
    
    public double getSlope() {
    	return this.m;
    }
    
    public double getYIntercept() {
    	return this.b;
    }

    //what if the intercept is negative? -1
    public String toString() {
    	return "y = " + this.m + "x + " + this.b;
    }
}


//cd to working directory
//compile: javac PointObject.java 
//run: java PointObject
//Set class path if needed for java to work

public class PointObject{
    private double x;
    private double y;

    public PointObject(double x, double y){
    	this.x = x;
    	this.y = y;
    }

    /* return the x coordinate of the current point object */
    public double getX(){
		return this.x;
    }

    /* return the y coordinate of the current point object */
    public double getY(){
		return this.y;
    }

    /* return true if the point is located on the x-axis, otherwise false */
    /* A point is on the X-axis when the y-coordinate = 0 */
    public boolean onXAxis(){
		return (this.y == 0);
    }

    /* return true if the point is locat3ed on the y-axis, otherwise false */
    public boolean onYAxis(){
		return (this.x == 0);
    }

    /* return true if the point is located in quadrant I */
    /* (this is the region of the plan where x and y are both positive) */
    public boolean inQ1(){
		return (this.x == 0) && (this.y > 0);
    }

    /* return true if the point is located in quadrant II */
    /* (negative x, positive y) */
    public boolean inQ2(){
		return (this.x == 0) && (this.y > 0);
    }

    /* return true if the point is lcoated in quadrant III */
    /* (negative x, positive y) */
    public boolean inQ3(){
		return (this.x == 0) && (this.y > 0);
    }

    /* return true if the point is located in quadrant IV */
    /* (positive x, negative y) */
    public boolean inQ4(){
		return (this.x < 0) && (this.y < 0);
    }

    /* return true if the other point is located in the same quadrant as the current point */
    //NOTE the use of just "this" when using the method inQ1(), for example
    public boolean sameQ(PointObject that){
    	if (this.inQ1() == true) {
	    	return that.inQ1();
		}
		else if (this.inQ2() == true) {
	    	return that.inQ2();
		}
		else if (this.inQ3() == true) {
	    	return that.inQ3();
		}
		else {
	    	return that.inQ4();
		}
    }

    /* compute the distance from the current point to the origin (0,0) (use Math.sqrt for sqaure root) */
    /* self note: distance = the square root of x2 + y2 */
    public double distOrigin(){
    	double distance = Math.sqrt((this.x)(this.x) + (this.y)(this.y));
    	return distance;
    }
  
    /* compute the distance from the current point to the x-axis (use Math.abs for absolute value) */
    /* self note: horizontal line equation = y = -c/b. The distance from (x0, y0) to this line
        is measured along a vertical line segment of length |y0 - (-c/b)| = |by0 + c| / |b|    */
    public double distX(){
    	double distance = Math.abs(this.y);
    	return distance;
    }
    	
    /* compute the distance from the current point to the y-axis (use Math.abs for absolute value) */
    /* self note: for vertical lines (b = 0) the distance between the same point and the line 
        is |ax0 + c| / |a|, as measured along a horizontal line segment */
    public double distY(){
    	double distance = Math.abs(this.x);
    	return distance;
    }

    /* compute the distance from the current point to the other point */
    /* self note: distance = the square root of x2 + y2 */
    public double distance(PointObject that){
    	double a = this.x - that.getX();
    	double b = this.y - that.getY();
    	double distance = Math.sqrt(a*a + b*b);
    	return distance;
    }

	public PointObject projX() {
        PointObject pointprojX = new PointObject(this.x, 0);   // need because need a return type of PointObject
		return pointprojX;    
    }

    /* return the projection of the current point on to the y-axis (a new object) */
    public PointObject projY(){
    	PointObject projection = new PointObject(0, this.y);
    	return projection;
    }
        
    /* return the point (a new object) that is moved to the right of the current point by dx */
    /* (note: dx can be negative; moving "to the right" by a negative is equiv. to "moving left" */
    public PointObject moveX(double dx){
    	double moveX = this.x + dx;
    	PointObject point = new PointObject(moveX, this.y);
    	return point;
    }

    /* return the point (a new object) that is moved above the current point by dy */
    public PointObject moveY(double dy){
    	double moveY = this.y + dy;
    	PointObject point = new PointObject(this.x, moveY);
    	return point;
    }

    /* return the point (a new object) at the midpoint between this and that */
    /* self note: midpoint formula: ( (x1+x2)/2 , (y1 + y2)/2 ) */
    public PointObject midpoint(PointObject that){
    	double a = (that.getX() + this.x)/2;
    	double b = (that.getY() + this.y)/2;
    	PointObject point = new PointObject(a, b);
    	return point;
    }
    
    

    


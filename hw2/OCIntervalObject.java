public class OCIntervalObject implements Interval {  //open-closed interval (1.2, 4.5]
    private double left;    
    private double right;
		
    public OCIntervalObject(double left, double right) {
    	if (Math.abs(left) < 0.0001 && Math.abs(right) < 0.0001) {
    		throw new IllegalArgumentException("Interval can not be empty");
    	}
    	if (left >= right) {
    		throw new IllegalArgumentException("Left bound can not be greater than or equal to right bound");
    	}
    	this.left = left;
    	this.right = right;
    }
    	
    public double width() {
    	double width = this.left - this.right; 
    	return width;
    }
    
	public boolean isEmpty() {
		return (Math.abs(left) < 0.0001 && Math.abs(right) < 0.0001);
	}
	
	public double getLeft() {
		return this.left; 
	}
	
    public double getRight() {
    	return this.right;  
    }

 	public boolean contains(double x) {
 		return (this.left >= x && this.right <= x); 
 	}
 	
 	public boolean overlaps(Interval i) {
  		if (i.isEmpty()) {
    		return false;
  		}
  		return i.contains(this.right) ||
        	i.contains(this.left) ||
         	this.contains(i.getLeft()) ||
         	(this.left==that.getLeft() && this.right==that.getRight());
	}
 	 	
 	public String toString() {
 		return "OCInterval: " + "(" + this.left + this.right + "]"; 
 	}
 	
}
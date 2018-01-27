/* Notes:

- The TimeObject constructor must take three arguments: an hour, a number of minutes, and a number of seconds, in that order.

- These will be 24-hour times (no AM/PM). Therefore the hour must inhabit the interval [0,24), and the minute and second must 
inhabit [0,60). You may use Intervals from the previous part of this assignment to facilitate checking in the constructor.

- You must disallow nonsensical times like "25 o'clock" or "1:02:88".

*/

public class TimeObject implements TimeInterface {
    private int hour;
    private int minute;
    private int second;

    public TimeObject(int hour, int minute, int second) {
    	if (hour < 0 || hour > 23) {
    		throw new IllegalArgumentException("hour out of range: " + hour);
    	}
   		if (minute < 0 || minute > 59) {
        	throw new IllegalArgumentException("minute out of range: " + minute);
    	}
    	if (second < 0 || second > 59) {
        	throw new IllegalArgumentException("second out of range: " + second);
    	}
    	this.hour = hour;
    	this.minute = minute;
    	this.second = second;
    }

    public int getHour() {
    	return this.hour;
    }

    public int getMinute() {
    	return this.minute;
    }

    public int getSecond() {
    	return this.second;
    }

	/* For the function after(...), you can just use functions same(...) and before(...) to remove the redundant lines in code. */
    public boolean same(TimeInterface that) {
    	return (this.hour == that.getHour()) && (this.minute == that.getMinute()) && (this.second == that.getMinute());
    }

    public boolean before(TimeInterface that) {
    	return (this.hour < that.getHour()) || (this.hour == that.getHour() && this.minute < that.getMinute()) ||
        (this.hour == that.getHour() && this.minute == that.getMinute() && this.second < that.getSecond());
    }

    public boolean after(TimeInterface that) {
    	return (this.hour > that.getHour()) || (this.hour == that.getHour() && this.minute > that.getMinute()) ||
        (this.hour == that.getHour() && this.minute == that.getMinute() && this.second > that.getSecond());
    }
    
	/* Helper function for toString() */
	private String pad0(int n){
		if (n < 10) {
			return "0" + n;
		} else {
			return "" + n;
		}
	}

    public String toString() {
    	return this.hour + ":" + pad0(this.minute) + ":" + pad0(this.second);
    }
}


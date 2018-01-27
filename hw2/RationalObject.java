/*
A RationalInterface is an exact rational number, with an integer numerator and an integer denominator. The RationalInterface specifies a number of common 
arithmetic operations for rational numbers.

The constructor of RationalObject must consume two integers: a numerator and a denominator, in that order. It must then check for a zero denominator, 
in which case it should throw an IllegalArgumentException as usual. If the denominator is nonzero, it must then arrange to canonicalize the representation 
(that is, standardize the representation according to some rules). We define a canonical rational number to have the following characteristics:

* if the numerator is 0, the denominator is 1 (this standardizes the representation of 0),

* the rational is fully reduced; that is, the numerator and the denominator have a greatest common divisor of 1, 

* if the rational is positive, then both its numerator and denominator are positive, and

* if the rational is negative, then its numerator is negative and its denominator is positive.

NOTE: you will need to implement a greatest common divisor algorithm to reduce the fraction in the constructor; you will learn how 
to do so at the next lecture.

By having the constructor perform this canonicalization, many of the other routines will be made much easier to implement. 

Please note that a canonical rational number never has a negative denominator. This does not mean a programmer cannot pass a negative denominator 
to the RationalObject constructor, just that once the number is canonicalized the denominator will definitely be positive.

For the recip method, an attempt to take the reciprocal of 0 must result in an IllegalStateException.

In dividedBy, an attempt to divide by zero must result in an IllegalArgumentException.
*/

public class RationalObject implements RationalInterface {

    private int numerator;
    private int denominator;

	// helper function: returns greatest common divisor of two ints
	private int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a%b);
		}	
	}
	
	// helper function: return the absolute value of an int
	private int abs(int a) {
		if (a < 0) {
			return -a;
		} else {
			return a;
		}
	}

	/* Your constructor does not account for the fact that if the rational is negative, the numerator is negative and the 
    denominator is positive and also if the rational is positive, then both its numerator and denominator are positive. (-4 constructor) */
    public RationalObject(int numerator, int denominator) {
    	if (denominator == 0) {
    		throw new IllegalArgumentException("denominator can not be zero");
    	}
    	int divisor = gcd(numerator, denominator);
    	this.numerator = numerator / divisor;
    	this.denominator = denominator / divisor;	
    }
    
    public int getNum() {
   		return this.numerator;
    }

    public int getDenom() {
    	return this.denominator;
    }

	// Return a double
    public double numApprox() {
    	return ((double)this.numerator) / ((double)this.denominator);
    }

	// For the recip method, an attempt to take the reciprocal of 0 must result in an IllegalStateException.
	// The reciprocal of a number is 1 divided by the number.
    public RationalInterface recip() {
    	if ( (this.numerator == 0) || (this.denominator == 0) ) {
    		throw new IllegalStateException("cannot take the reciprocal of 0");
    	}
    	RationalInterface recip_rational = new RationalObject(this.denominator, this.numerator);
    	return recip_rational;
    }

	/* Negate() is incorrect. You are taking a reciprocal and then multiplying by -1, but that is not what you need to do for negate. (-3)*/
    public RationalInterface negate() {
 		//int n = -( this.numerator() / this.denominator() );
 		int aa = -(1 / this.numerator);
    	int bb = -(1 / this.denominator);
    	RationalInterface p = new RationalObject(aa, bb);
    	return p;
    }

	/* Plus, minus, and times all are incorrect. If you create one object 1/2 and another 3/4, you get the wrong answer for these functions. 
	This is because in plus and minus, you only account for one denominator. You also only account for one denominator in times and ignore 
	that.getDenom(). (-10) */
    public RationalInterface plus(RationalInterface that) {
    	int aa = (this.numerator) + (that.getNum());
    	int bb = (this.denominator);
    	RationalInterface p = new RationalObject(aa, bb);
    	return p;
    }

    public RationalInterface minus(RationalInterface that) {
    	int aa = (this.numerator) - (that.getNum());
    	int bb = this.denominator;
    	RationalInterface m = new RationalObject(aa, bb);
    	return m;
    }
    
    public RationalInterface times(RationalInterface that) {
    	int aa = (this.numerator) * (that.getNum());
    	int bb = (this.denominator) * (that.getNum());
    	RationalInterface t = new RationalObject(aa, bb);
    	return t;
    }

	//In dividedBy, an attempt to divide by zero must result in an IllegalArgumentException.
	// note: turn second upside down, then multiply
    public RationalInterface dividedBy(RationalInterface that) {
    	if ( (this.getNum() == 0) || (that.getDenom() == 0) ) {
    		throw new IllegalStateException("cannot divide by zero");
    	}
    	int aa = (this.numerator) * (that.getDenom());
    	int bb = (this.denominator) * (that.getNum());
    	RationalInterface d = new RationalObject(aa, bb);
    	return d;
    }

    public boolean same(RationalInterface that) {
    	return (this.numerator == that.getNum()) && (this.denominator == that.getDenom());
    }

    // lessThan: return true if this is less than that
    /* For lessThan(...) and greaterThan(...) you can use the numApprox() to simplify. (-1 clarity)*/
    public boolean lessThan(RationalInterface that) {
    	int aa = (this.numerator / this.denominator);
    	int bb = (that.getNum() / that.getDenom());
    	return (aa < bb);
    
    }

    // greaterThan: return true if this is greater than that
    public boolean greaterThan(RationalInterface that) {
    	int aa = (this.numerator / this.denominator);
    	int bb = (that.getNum()) / (that.getDenom());
    	return (aa > bb);
    }
    
    // max: return the larger of this and that
    public RationalInterface max(RationalInterface that) {
    	throw new RuntimeException("unable to finish max in RationalObject");
    }       

    // min: return the smaller of this and that
    public RationalInterface min(RationalInterface that) {
    	throw new RuntimeException("unable to finish min in RationalObject");
    }
	
    public boolean isWhole() {
    	return this.denominator == 1; 	
    }

    public String toString() {
    	return "Rational: " + this.numerator + " / " + this.denominator;
    
    }
}
//LinkedList, with Generic Type

import java.util.*;

public class Cons<T> implements MList<T> {
	private T first;
	private MList<T> rest;
	
	public Cons(T first, MList<T> rest) {  //note syntax: cons
		if(first == null || rest == null)
			throw new IllegalArgumentException("first or rest can not be null");
		this.first = first;
		this.rest = rest;
	}
	
	public Cons(T f) {
		if (f == null)
			throw new IllegalArgumentException("null");
		this.first = f;
		this.rest = new Nil<T>();
	}
	
	public boolean isEmpty() {
		return false;
	} 
	
	public T first() {
		return this.first;
	} 
	
	//recursive, .last() turns this.rest into type T
	public T last() {
		if (this.rest.isEmpty())
			return this.first;
		else 
			return this.rest.last();
	}
	
	public MList<T> rest() {
		return this.rest;
	}
	
	//recursive
	public T nth(int n) {
		if (n == 0)
			return this.first;
		if (n > 0)
			return this.rest.nth(n - 1);  //zero index, each time at top of rest is index 0; go down the rest of the tree; next becomes 0
		else
			throw new IndexOutOfBoundsException("n out of bounds");
	}
	
	//recursive
	public int length() {
		return 1 + this.rest.length();  // 1 is adding the first
	}
	
	//recursive
	public MList<T> putLast(T t) {
		return new Cons<T>(this.first, this.rest.putLast(t));
	}
	
	public MList<T> append(MList<T> that) {
		MList<T> x = this.rest.append(that);   //recursive
		return new Cons<T>(this.first, x);
	}
	
	public boolean contains(T t) {
		boolean cmp = this.first.equals(t);
	
		if (cmp == true)   
			return true;
		else  //if t is in the rest, recursive
			return this.rest.contains(t); //at one point rest will be nil and returns false (see this method in the Nil class)
	}
	
	//need equals method
	
	public String toString() {
		return this.first.toString() + ":" + this.rest.toString();
	}

}
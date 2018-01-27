/* MArrayList must include a no-args constructor which builds an empty array list. 
Java does not allow you to build arrays of a type variable like T, so you will need to 
use the following technique: 

That is, you build an array of type Object, which is allowed, and then cast that Object array 
to the appropriate generic type, which is also allowed. new T[0] is not allowed. I will discuss 
this point when we meet tonight (Wed 8/2). */

//Make a second constructor that consumes an array of T, so you can plug it into your instance variable and keep going
//ArrayList = fix in size from the beginning

public class MArrayList<T> implements MList<T> {
	private T[] alist;
	
	public MArrayList(T[] list) {
		if (alist == null)
			throw new IllegalArgumentException("array can't be null");
		this.alist = list;
	}

	public MArrayList() {
		this.alist = (T[])(new Object[0]);  //this casting will throw an error and it's okay it does this
	}
	
	public boolean isEmpty() {
		return this.alist.length == 0;
	}
	
	//return the first item in the array
	public T first() {
		if (this.alist.length == 0)
			throw new IllegalStateException("list is empty");
		
		return this.alist[0];
	}
	
	//return the last item in the array
	public T last() {
		if (this.alist.length == 0)
			throw new IllegalStateException("list is empty");
		
		T lastItem = this.alist[alist.length - 1];
		return lastItem;
	}
	
	//return "the rest" in the array - everything after the first
	public MList<T> rest() {
		if (this.alist.length == 0)
			throw new IllegalStateException("this is empty");
		
		T[] array = (T[])(new Object[this.alist.length - 1]); //-1 because it won't have the first item
		for (int i = 1; i < this.alist.length; i++) //starting at i = 1 because don't want to include the item at the zero index
			array[i - 1] = this.alist[i];

		return new MArrayList<T>(array); //return the array
	}
	
	//return item at index n
	public T nth(int n) {
		if (n < 0 || n > this.alist.length) 
			throw new IllegalArgumentException("array index is out of bounds");
		return this.alist[n];
	}
	
	public int length() {
		return this.alist.length;
	}
	
	public MList<T> putLast(T t) {
		int lastindex = this.alist.length + 1; //getting the index after alist ends.
		
		T[] array = (T[])(new Object[this.alist.length + 1]); //the size of the new array is the length of alist + 1 (for the append)
		
		//putting all of alist items into a new array
		for (int i = 0; i < this.alist.length; i++) 
			array[i] = this.alist[i];
		
		//adding t to the end of the new array
		array[lastindex] = t;
		
		//returning MList<T> object
		return new MArrayList<T>(array);
	}
	
	public MList<T> append(MList<T> that) {
		if (that == null) 
			throw new IllegalArgumentException("MList<T> that is null");
		
		int x = this.alist.length + that.length();
		T[] array = (T[])(new Object[x]);
		
		//adding items from the first array into the new array
		for (int i = 0; i < this.alist.length; i++) 
			array[i] = this.alist[i];
			
		//addint items from that
		for (int i = 0; i < this.alist.length; i++)
			array[this.alist.length + i] = that.nth(i);
			
		return new MArrayList<T>(array);
	}
	
	public boolean contains(T t) {
		int count = 0;
		for (int i = 0; i < this.alist.length; i++) 
			if (this.alist[i].equals(t))
				count += 1;
			
		return count >= 1;  //if it is 0, the array does not contain t
	}
	
		/* or
		for (T c : this.alist)
			if (c.equals(t))   //or maybe have to use .equals?
				return true
		return false;
		*/
	
	//for loop that runs through the array, and at each step, I added the value at the i-th index to a string. Then just return the string.
	public String toString() {
		String r = " ";
		for (int i = 0; i < this.alist.length; i++)
			r = this.alist[i].toString() + ", ";
		
		return r;
		
	}

}
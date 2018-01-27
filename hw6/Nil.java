//Nil = Empty

public class Nil<T> implements MList<T> {
	
	//no constructor needed
	
	public boolean isEmpty() {
		return true;
	}
	
	public T first() {
		throw new IllegalStateException("Nil is empty");
	}
	
	public T last() {
		throw new IllegalStateException("Nil is empty");
	}
	
	public MList<T> rest() {
		throw new IllegalStateException("Nil is empty");
	}
	
	public T nth(int n) {
		throw new IndexOutOfBoundsException("Nil is empty");
	}
	
	public int length() {
		return 0;
	}
	
	public MList<T> putLast(T t) {
		return new Cons<T>(t, new Nil<T>());
		//retunr new Cons<T>(t)  //adam's answer
	}
	
	public MList<T> append(MList<T> that) {
		return new Cons<T>(that.first(), that.rest());
		//return that; // adam's answer
	}
	
	public boolean contains(T t) {
		return false;
	}
	
	public String toString() {
		return "Nil";
	}
}
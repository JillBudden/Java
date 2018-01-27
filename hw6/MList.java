// implement MList in two different ways; once as a linked list, and once as an array list.

public interface MList<T> {
	public boolean isEmpty();
	public T first();
	public T last();
	public MList<T> rest();
	public T nth(int n);
	public int length();
	public MList<T> putLast(T t);
	public MList<T> append(MList<T> that);
	public boolean contains(T t);
}
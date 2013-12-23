import java.util.Iterator;

/* 
 * Available implementations include IntegerFibIterator , LongFibIter, BigIntFib...
 * and so on
 */

public interface FibonacciIterator<E>  extends Iterator<E>  {
	public boolean hasNext();
	public E next();
	void remove() ;
	
	
}
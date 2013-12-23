import java.util.NoSuchElementException;


public abstract class  AbstractFibonacciIterator<E> implements FibonacciIterator<E> {

	public boolean hasNext() { return false; }
	public  E next() throws NoSuchElementException { throw new NoSuchElementException(" Unimplemented method") ;};
	public void remove() { };
	


	public static FibonacciIterator<?> createFibInstace(Class<?> c) throws Exception {
		if ( c == Integer.class) {
			return new IntegerFibonacciIterator(0);
		}
		else if ( c == Long.class) {
			// this class isn't implemented yet
			return new LongFibonacciIterator();
		} // more stmts as needed 
		throw new Exception ( " Unknown class instance passed " + c.toString());
	}
	
}
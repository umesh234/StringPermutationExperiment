

public class IntegerFibonacciIterator extends AbstractFibonacciIterator<Integer> {

	
	//fib_0 = 1 , fib_1 = 1 , 
	int prev = 0;
	int cur = 1 ;
	boolean hasNext = true;
	public IntegerFibonacciIterator() { }
	
	public IntegerFibonacciIterator(int start) {
		if ( start < 0 ) {
			hasNext = false;
		}
		for( int i=0;i<start;i++) {
			next();
		}
	}
	
	@Override
	public boolean hasNext() {
		boolean oldHasNext = hasNext ;
		//not perfect detection 
		if ( cur > Integer.MAX_VALUE/2 ) {
			hasNext = false; 
		}
		return oldHasNext;
	}
	
	@Override
	public Integer next() {
		int temp = cur + prev;
		prev = cur ;
		cur = temp ;
		
		return temp;
	}
	

}

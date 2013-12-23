import java.math.BigInteger;
import java.util.NoSuchElementException;



/* not trying to optimize by using int/long for smaller fibs for two reason
 * 1) we dont know the perf impact/issue
 * 2) i vaguely think big integer actually uses int when possible underneath
 */
public class UnendingFibonacciIterator extends AbstractFibonacciIterator<BigInteger> {

	
	//fib_0 = 1 , fib_1 = 1 ,
	BigInteger prev = BigInteger.valueOf(0L);
	BigInteger cur = BigInteger.valueOf(1L);
	boolean hasNext = true;
	
	public UnendingFibonacciIterator(int start) {
		if ( start < 0 ) {
			hasNext = false;
		}
		for( int i=0;i<start;i++) {
			next();
		}
	}
	
	@Override
	public boolean hasNext() {
		return 	hasNext ;
	}
	
	@Override
	public BigInteger next() throws NoSuchElementException {
		BigInteger temp = cur.add( prev);
		prev = cur ;
		cur = temp ;
		return temp;
	}
	

}

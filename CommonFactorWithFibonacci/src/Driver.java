
public class Driver {

	public static void main(String args[]) {
		FibonacciIterator<? extends Number> fg = fibIterFactory();
		int counter=0;
		while(fg.hasNext() && counter++ < 100){
		System.out.print(  " " + fg.next());
		}
		System.out.println( "\n" + Integer.MAX_VALUE/2);
	
	
	}
	
	public static FibonacciIterator<? extends Number> fibIterFactory() {
		//return new IntegerFibonacciIterator(1);
		return new UnendingFibonacciIterator(1);
	}
	
}

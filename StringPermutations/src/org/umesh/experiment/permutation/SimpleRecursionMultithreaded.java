package org.umesh.experiment.permutation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SimpleRecursionMultithreaded extends PermutationMethod{


	@Override
	public void permHelper(String str) {
		if(str == null)
			return;
		final ExecutorService es = Executors.newFixedThreadPool(100);
		printPermsHelper3("" , str, es);
		es.shutdown();
		while(!es.isTerminated()) {
			try {
				es.awaitTermination(1, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void printPermsHelper3(String prefix , String remain, final ExecutorService es) {
		if( "".equals(remain)) {
			//System.out.println(prefix);
			return;
		}
		
		for( int i=0;i<remain.length();i++) {
			final String newPrefix = prefix + remain.charAt(i);
			final String newRemain = remain.substring(0,i) + remain.substring(i+1);
			es.submit(new Runnable() { 
				@Override 
				public void run() { 
					printPermsHelper3(newPrefix, newRemain,es);
				}
				
			});
			}
		}

}

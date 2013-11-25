package org.umesh.experiment.permutation;

public abstract class PermutationMethod {
	static int TRIALS =10;
	public void generatePerms(String str) {
		long beginTime = System.currentTimeMillis();
		for( int i=0;i<TRIALS;i++) 
			permHelper(str);
		System.out.println( "MethodClassName:" + this.getClass().getCanonicalName() +
				"String : " + str +
				" Time taken:" + (System.currentTimeMillis() - beginTime)*1.0/TRIALS);
	}
	
	public abstract void permHelper(String str);
	
}

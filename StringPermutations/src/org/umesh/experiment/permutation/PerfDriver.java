package org.umesh.experiment.permutation;

public class PerfDriver {

	public static void main(String args[]) {
		PermutationMethod pm1 = new SimpleRecursionBased();
		PermutationMethod pm2 = new RecursionOptimized();
		PermutationMethod pm3 = new SimpleRecursionMultithreaded();

		String[] testCases = { "potato" , "potato23", "potato2323" ,"potato23232334"};

		for ( int i=0;i<testCases.length;i++) { 
			String str = testCases[i];
			pm1.generatePerms(str);
			pm2.generatePerms(str);
			pm3.generatePerms(str);
		}
	}

}

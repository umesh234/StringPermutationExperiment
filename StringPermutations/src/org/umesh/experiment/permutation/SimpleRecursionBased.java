package org.umesh.experiment.permutation;

public class SimpleRecursionBased extends PermutationMethod{

	public void printPerms (String str) {
		if(str == null)
			return;
		printPermsHelper("" , str);
	}
	
	public void printPermsHelper(String prefix , String remain) {
		if( "".equals(remain)) {
			//System.out.println(prefix);
			return;
		}
		
		for( int i=0;i<remain.length();i++) {
			String newPrefix = prefix + remain.charAt(i);
			String newRemain = remain.substring(0,i) + remain.substring(i+1);
			printPermsHelper(newPrefix, newRemain);
		}
	}

	@Override
	public void permHelper(String str) {
		printPerms(str);
		
	}
}

package org.umesh.experiment.permutation;

public class RecursionOptimized extends PermutationMethod{
	public  void printPerms (String str) {
		if(str == null)
			return;
		printPermsHelper2( new StringBuilder("") , new StringBuilder(str));
	}
	
	//we are avoiding creation of the new String objects - not very good from multi threading perspective
	public  void printPermsHelper2(StringBuilder prefix , StringBuilder remain) {
		if( remain.length() ==0)  {
		 	//System.out.println(prefix);
			return;
		}
		
		for( int i=0;i<remain.length();i++) {
			char c = remain.charAt(i);
			prefix.append(c);
			printPermsHelper2(prefix, remain.deleteCharAt(i));
			remain.insert(i, c);
			prefix.deleteCharAt(prefix.length()-1);
		}
	}
	
	@Override
	public void permHelper(String str) {
		printPerms(str);
		
	}
}

package algorithms;
import java.util.*;
public class LongestCommonSubsequence {
	public List<Integer> match(String P,String T){
		int n=T.length();
		int m=P.length();
		List<Integer> shifts=new ArrayList<>();
		for(int i=0;i<n-m+1;i++) {   //acaabc
			boolean hasMatch=true;
			for(int j=0;j<m;j++) {   //aab
				if(P.charAt(j) != T.charAt(i+j)) {
					hasMatch=false;
					break;
				}
			}
			if (hasMatch) {
				shifts.add(i);
			}
		}
		return shifts;
	}
	public static void main(String[] args) {
		LongestCommonSubsequence  lcs=new LongestCommonSubsequence();
		List<Integer> matches=lcs.match("AABA", "AABAACAADAABAAABAA");
		for(Integer i: matches) {
			System.out.println(i);
		}
	}

}

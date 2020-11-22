package algorithms;
import java.util.*;
public class NaiveStringMatching {
	public List<Integer> matches(String txt,String pat){
		int n=txt.length();
		int m=pat.length();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n-m+1;i++) {
			boolean hasMatch=true;
			for(int j=0;j<m;j++) {
				if(pat.charAt(j)!=txt.charAt(i+j))
					hasMatch=false;
				break;
			}
			if(hasMatch) {
			list.add(i);	
			}
		}
		return list;
	}
	public static void main(String[] args) {
		NaiveStringMatching nsm=new NaiveStringMatching();
		
		String txt="AABAACAA";
		String pat="AA";
		List<Integer> match=nsm.matches(txt,pat);
		for(int i:match) {
			System.out.println(i);
		}
	}

}

package PalindromePartitioning;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args){
		String s = "aab";
		ArrayList<ArrayList<String>> ret = partition(s);
		for(int i = 0;i < ret.size();i++){
			ArrayList<String> r = ret.get(i);
			for(int j=0;j < r.size();j++){
				System.out.println(r.get(j));
			}
		}
	}
	
	public static ArrayList<ArrayList<String>> partition(String s){
		ArrayList<String> output = new ArrayList<String>();
		ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
		DFS(s,0,output,ret);
		return ret;
	}
	
	public static void DFS(String s, int start , ArrayList<String> output,ArrayList<ArrayList<String>> ret){
		if(s.length() == start){
			ret.add(output);
			return;
		}
		
		for(int i = start;i < s.length();i++){
			if(isPalindrome(s, start, i)){
				output.add(s.substring(start, i - start + 1));
				DFS(s,i+1,output,ret);
				output.remove(output.size() - 1);
			}
		}
	}
	
	public static boolean isPalindrome(String s,int start,int end){
		while(start < end){
			if(s.charAt(start) != s.charAt(end))
				return false;
			start++;
			end--;
		}
		
		return true;
	}
	
}

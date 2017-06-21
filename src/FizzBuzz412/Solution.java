package FizzBuzz412;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);

	}
	
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        if(n <= 0 )
        	return list;
        for(int i = n ;i >= 1;i--){
        	int tmp = n;
        	if(tmp % 15 == 0){
        		list.add("FizzBuzz");
        		continue;
        	}
        	if(tmp % 5 == 0){
        		list.add("Buzz");
        		continue;
        	}
        	if(tmp % 3 == 0){
        		list.add("Fizz");
        		continue;
        	}
        	list.add(String.valueOf(i));
        }
        return list;
    }

}

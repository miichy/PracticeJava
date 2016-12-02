package FractiontoRecurringDecimal;

import java.math.BigInteger;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		int numerator = -1;
		int denominator = -2147483648;
		
		System.out.println(fractionToDecimal(numerator, denominator));
		
	}
	
    public static  String fractionToDecimal(int numerator, int denominator) {
        
//        String whole = String.valueOf(numerator / denominator);
//        numerator = numerator % denominator;
//        double ret ;
//        ret = (double)numerator / denominator;
//        String s = String.valueOf(ret).substring(0,3);
//    	
//        return String.valueOf(Integer.parseInt(whole) + Double.parseDouble(s));
    	
    	 if(numerator == 0)
    		 return "0";
    	 if(denominator == 0)
    		 return "";
    	 
    	 String result = "";
    	 
    	 if((numerator < 0)^(denominator < 0)){
    		 result += "-";
    	 }
    	 
    	 long num = Math.abs((long)numerator);
    	 long den = Math.abs((long)denominator);
    	 
    	 //quotient
    	 long res = num / den;
    	 result += String.valueOf(res);
    	 
    	 long remainder = (num % den ) * 10;
    	 if(remainder == 0)
    		 return result;
    	 
    	 HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    	 result += ".";
    	 
    	 while (remainder != 0){
    		 if (map.containsKey(remainder)){
    			 int beg = map.get(remainder);
    			 String part1 = result.substring(0,beg);
    			 String part2 = result.substring(beg,result.length());
    			 result = part1 + "(" + part2 + ")";
    			 return result;
    		 }
    		 
    		 map.put(remainder, result.length());
    		 res = remainder / den;
    		 result += String.valueOf(res);
    		 remainder = (remainder % den) * 10;
    	 }
    	 return result;
    }

}

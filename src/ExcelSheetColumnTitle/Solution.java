package ExcelSheetColumnTitle;

public class Solution {

	public static void main(String[] args) {
		//  65 is A   ;  97 is a;
		System.out.println(convertToTitle(1));
		System.out.println(convertToTitle(26));
		System.out.println(convertToTitle(27));
		System.out.println(convertToTitle(52));
		System.out.println(convertToTitle(53));
		System.out.println(convertToTitle(78));
		System.out.println(convertToTitle(702));
		System.out.println(convertToTitle(27*27*26));

	}
	
    public static String convertToTitle(int n) {
    	
    	if(n <= 0){
            throw new IllegalArgumentException("Input is not valid!");
        }
     
        StringBuilder sb = new StringBuilder();
     
        while(n > 0){
            n--;
            char ch = (char) (n % 26 + 'A');
            n /= 26;
            sb.append(ch);
        }
     
        sb.reverse();
        return sb.toString();
        
//    	if(n <= 0)
//    		throw new IllegalArgumentException("Wrong input!");
//    	StringBuffer sb = new StringBuffer();
//    	
//    	while(n > 0){
//    		n--;
//    		char ch = (char) (n % 26 + 'A');
//    		n /= 26;
//    		sb.append(ch);
//    	}
//    	
//    	sb.reverse();
//    	return sb.toString();
        	
    }

}

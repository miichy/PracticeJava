package IntegerReplacement;

public class Solution {

	public static void main(String[] args) {
		System.out.println(integerReplacement(8));
	}
	
	public static int integerReplacement(int n ){
		if (n <= 1)
            return 0;
		int result = 0;
        while (n != 0){
            if( (n & 65534) % 2 == 0 ){
                result += 1;
                n = n >> 1;
            }else{
                n += 1;
                result += 1;
                n = n >> 1;
            }
        }
        
		return result;
	}

}

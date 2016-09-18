package GuessNumberHigherOrLower;

public class GuessGame {
	
	public int  guess(int num){
		if(num == 10)
			return 0;
		else if(num > 0)
			return 1;
		else
			return -1;
	}

}

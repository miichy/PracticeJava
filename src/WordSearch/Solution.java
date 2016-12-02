package WordSearch;

public class Solution {

	public static void main(String[] args) {
		char[][] board = {{'a'}};//{{'A','B','C'},{'A','B','C'},{'A','B','C'}};
		String word = "A";
		Solution s = new Solution();
		if (s.exist(board, word)) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}
	
    public boolean exist(char[][] board, String word) {
        int[] chter = new int[26];
        int col = board.length;
        int row = board[0].length;
        for(int  i = 0; i < col ;i++){
        	for(int j = 0;j < board[i].length;j++){
        		char index = board[i][j];
        		index = Character.toUpperCase(index);
        		System.out.println(index);
        		chter[index - 'A']++;
        	}
        }
        
        int len = word.length();
        for(int i = 0; i < len;i++){
        	chter[word.charAt(i) - 'A']--;
        	if(chter[word.charAt(i) - 'A'] < 0)
        		return false;
        }
        
    	return true;
    }

}

package WordLadder127;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log","cog"]
 */

public class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        Set<String> reached = new HashSet<String>();
        reached.add(beginWord);
        wordList.add(endWord);
        int distance = 1;
        while (!reached.contains(endWord)){
            Set<String> toAdd = new HashSet<String>();
            for (String each:reached){
                for (int i = 0; i < each.length() ; i++){
                    char[] chars = each.toCharArray();
                    for (char ch = 'a';ch <= 'z' ; ch++){
                        chars[i] = ch;
                        String word = new String(chars);
                        if (wordList.contains(word)){
                            toAdd.add(word);
                            wordList.remove(word);
                        }
                    }
                }
            }
            distance++;
            if (toAdd.size() == 0)
                return 0;
            reached =  toAdd;
        }
        return  distance;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> wordList = new ArrayList<String>();
        // "hot","dot","dog","lot","log","cog"
        String beginWord = "hit";
        String endWord = "cog";
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("cog");
        System.out.println(s.ladderLength(beginWord,endWord,wordList));
    }

}

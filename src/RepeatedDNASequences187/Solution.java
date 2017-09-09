package RepeatedDNASequences187;

import com.sun.tracing.dtrace.ArgsAttributes;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public List<String> findRepeatedDnaSequences(String s){
        Set seen = new HashSet();
        Set repeated = new HashSet();

        for (int i = 0 ; i + 9 < s.length(); i++){
            String ten = s.substring(i,i + 10);
            if (!seen.add(ten)){
                repeated.add(ten);
            }
        }
        return new ArrayList(repeated);

    }

    public static void main(String[]  args){
        Solution s = new Solution();
        List<String> ls = s.findRepeatedDnaSequences("AAAACCCCAAAACCCCAAAAA");
        System.out.println(ls.get(0));
    }

}

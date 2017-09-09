package LargestNumber179;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public String largestNumber(int[] nums){
        if (nums == null || nums.length == 0)
            return "";
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                String s1 = i + j;
                String s2 = j + i;
                return s1.compareTo(s2);
            }
        });
        if (strs[strs.length - 1].charAt(0) == '0')
            return "0";
        String res = new String();
        for (int i = 0;i < strs.length ; i++){
            res = strs[i] + res;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,30,34,5,9};
        System.out.println(s.largestNumber(nums));
    }

}

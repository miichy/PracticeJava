package majorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums =  {2,2,1,1,1,2,2};
        System.out.println(s.majorityElement(nums));

    }


    public int majorityElement(int[] nums) {
        int len = nums.length;

        if (len <= 0)
            return -1;
        if (len == 1)
            return nums[0];

        if (len == 2  ){
            if (nums[0] == nums[1] ){
                return nums[0];
            } else {
                return -1;
            }
        }

        Map<Integer,Integer> map =  new HashMap<>();

        for (int i = 0 ; i < len; i++){
            int temp = nums[i];
            if (map.containsKey(temp)){
                int count = map.get(temp) + 1;
                map.put(nums[i],count);
                if (count > len / 2) {
                    return temp;
                }
            } else {
                map.put(temp,1);
            }

        }

        return -1;
    }

}

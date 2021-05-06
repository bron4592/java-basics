package com.company.leetcode;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> res = new HashMap<Integer, Integer>();
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            if (res.containsKey(nums[i])){
                ans[0] = res.get(nums[i]);
                ans[1] = i;
                return ans;
            }
            else{
                res.put(target-nums[i], i);
            }
        }
        return ans;
    }


}


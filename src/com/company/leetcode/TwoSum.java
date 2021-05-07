package com.company.leetcode;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> res = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if (res.containsKey(nums[i])){
                return new int[] {res.get(nums[i]), i};
            }
            else{
                res.put(target-nums[i], i);
            }
        }
        throw new IllegalStateException("No pair found for given target.");
    }


}


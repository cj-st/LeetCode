/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2]; 
        for( int i = 0 ; i < nums.length; i ++ ) {
            //if(nums[i] < target){
                for ( int j = 1; i + j < nums.length; j ++ ){
                    if (nums[i]+nums[i+j]==target) {
                        result[0]= i;
                        result[1]=j+i;
                        
                    }     
                }
            //}
        }
        return result;
    }
    
}

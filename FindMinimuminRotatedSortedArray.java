import java.util.*;
class Solution {
    public int findMin(int[] nums) {
       int smallest = nums[0];
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]<smallest)
                smallest=nums[i];
        }
        return smallest;
        
    }
}

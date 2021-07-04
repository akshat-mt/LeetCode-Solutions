class Solution {
    public int findPeakElement(int[] nums) {
        int peak =0;
        if(nums.length==1)
        {
            return 0;
        }
        else if(nums.length==2)
        {
            if(nums[1]>nums[0])
            {
                return 1;
            }
            else
                return 0;
        }
        
        else
        {
        for(int i=0;i<nums.length;i++)
        {   
            if(i==0)
            {
                if(nums[0]>nums[i+1])
                    peak = i;
            }
            else if(i==nums.length-1)
            {
                if(nums[i]>nums[i-1])
                { peak = i;
                   
                }
                 break;
            }
            else
            {
                if(nums[i]>nums[i+1]&&nums[i]>nums[i-1])
                    peak = i;
            }
                
       
    }
    }
         return peak;
        
    }
    
}

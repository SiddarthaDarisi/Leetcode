class Solution {
    public int removeElement(int[] nums, int val) {
        int element=0;
        for(int i=0;i<nums.length;i++){
          
            if(nums[i]!=val)
            { nums[element]=nums[i];
            element++;
            }           
            
        }
        return element;
        
    }
}
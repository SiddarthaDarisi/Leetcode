class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer,Integer> s = new HashMap<>();
     int opp;
     for(int i=0;i<nums.length;i++){
        opp=target-nums[i];
        if(s.containsKey(opp))
        {
           return new int[]{s.get(opp), i};
        }else{
            s.put(nums[i],i);
        }

     }
     return nums;     
    }
}
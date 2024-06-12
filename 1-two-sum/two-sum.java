class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        int complement;
        for(int i=0;i<nums.length;i++){
            complement=target-nums[i];
            if(ans.containsKey(complement)){
                return new int[]{i,ans.get(complement)};
            }
            ans.put(nums[i],i);
        }
     
        return new int[]{0,0};
    }
}
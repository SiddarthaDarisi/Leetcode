class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(count.containsKey(nums[i]))
             {count.put(nums[i],count.get(nums[i]+1));
             return true;}
            else{
                count.put(nums[i],1);
            }}
            return false;

    }
}
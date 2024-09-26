class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> empty= new HashSet<>();
      for(int i=0;i<nums.length;i++){
            if(empty.contains(nums[i])){
                return true;
            }
            else{
                empty.add(nums[i]);
            }
      }
      return false;
    }
}
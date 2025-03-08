class Solution {
    public int removeDuplicates(int[] nums) {
        int uniq=1;
        int s=1;
        int r=0;
        for(int i=1;i<nums.length;i++){
            if(nums[r]!=nums[i]){
                r=i;
                uniq++;
                nums[s]=nums[r];
                s++;
            }
          
        }
        System.out.print(uniq);
        return uniq;
    }
}
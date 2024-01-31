class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int a,b;
       int i=0,j=numbers.length-1;
       while(i<j){
           a=numbers[i];
           b=numbers[j];
           if(a+b==target){
               break;
           }
           else if(a+b>target){
               j--;
           }
           else if(a+b<target){
               i++;
           }
       } 
        
        int[] result = new int[]{i+1, j+1};
       return result;
    }
}
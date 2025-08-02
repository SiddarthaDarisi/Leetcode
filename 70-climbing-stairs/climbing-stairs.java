class Solution {
    public int climbStairs(int n) {
       if (n == 1) {
            return 1;
        }
        int[] arr = new int[n + 1];
        arr[1] = 1;// one jump
        arr[2] = 2;// two or one 

        for(int i = 3; i <= n; i++) { 
            arr[i] = arr[i-1] + arr[i-2];
            // the number of ways to reach the n th level is the sum of two previos levels
        }
        return arr[n];
    }
}
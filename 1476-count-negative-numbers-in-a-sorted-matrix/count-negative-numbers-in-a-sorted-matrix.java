class Solution {
    public int countNegatives(int[][] grid) {
        int a=0;
        for(int i=0;i<grid.length;i++){
             for(int j=grid[0].length-1;j>=0;j--){
                 if(grid[i][j]>=0){
                        j=-1;
                 }
                 else{
                     a++;
                 }
        }
       
    }
     return a;
}}
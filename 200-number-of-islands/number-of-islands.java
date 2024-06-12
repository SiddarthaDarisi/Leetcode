class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        HashMap<Integer,Integer> visit=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                boolean check=dfs(grid,i,j,visit);
                if(check==true)count++;
             }
            }
        }
        return count;
    }
    public boolean dfs(char[][] grid,int i,int j,HashMap<Integer,Integer> visit){
       if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
    return false;
}
        if(grid[i][j]=='1'){
            visit.put(i,j);
            grid[i][j]='0';
            dfs(grid,i+1,j,visit);
            dfs(grid,i-1,j,visit);
            dfs(grid,i,j+1,visit);
            dfs(grid,i,j-1,visit);
            
            if(visit.isEmpty())
                return true;
        }
        
        return true;
    }
}
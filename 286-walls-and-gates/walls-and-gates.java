class Solution {
    public void wallsAndGates(int[][] rooms) {
        int WALL = -1;
        int GATE = 0;
        int EMPTY = 2147483647;
        int notFilled = 0;
        int distance = 0;
        Deque<int[]> queue = new ArrayDeque<>();
        
        // Count the number of empty rooms and add gate coordinates to the queue
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                if (rooms[i][j] == GATE) {
                    queue.offer(new int[]{i, j});
                } else if (rooms[i][j] == EMPTY) {
                    notFilled++;
                }
            }
        }
        
        int[][] directions = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        
        while (notFilled > 0 && !queue.isEmpty()) {
            int length = queue.size();
            distance++;
            
            for (int i = 0; i < length; i++) {
                int[] c = queue.poll();
                int r = c[0];
                int s = c[1];
                
                for (int[] dir : directions) {
                    int row = r + dir[0];
                    int col = s + dir[1]; // Changed from r + dir[1] to s + dir[1]
                    
                    // Changed the bounds check conditions
                    if (row >= 0 && col >= 0 && row < rooms.length && col < rooms[0].length && rooms[row][col] == EMPTY) {
                        rooms[row][col] = distance;
                        notFilled--;
                        queue.offer(new int[]{row, col}); // Add the current cell to the queue
                    }
                }
            }
        }
    }
}
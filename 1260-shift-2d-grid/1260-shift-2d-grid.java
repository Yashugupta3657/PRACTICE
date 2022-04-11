class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
      //   List<List<Integer>> list=new ArrayList<>();
      //   while(k-->0){
      //       int ending=grid[grid.length-1][grid[0].length-1];
      //   for(int i=0;i<grid.length;i++){
      //        int end=grid[i][grid[0].length-1];
      //       for(int j=grid[i].length-1;j>0;j--){
      //           grid[i][j]=grid[i][j-1];
      //       }
      //       if(i<grid.length-1)
      //        grid[i+1][0]=end;
      //   }
      //    grid[0][0]=ending;   
      // }
      //   for(int i=0;i<grid.length;i++){
      //       List<Integer> m=new ArrayList<>();
      //       for(int j=0;j<grid[i].length;j++){
      //         m.add(grid[i][j]);
      //       }
      //       list.add(m);
      //   }
      //   return list;
           while(k-->0){
            
            int temp=grid[0][0];
            for(int i=0; i<grid.length; i++){
                for(int j=0; j<grid[i].length; j++){
                    if(i==0 && j==0) continue;
                    
                    int prev = grid[i][j];
                    grid[i][j] = temp;
                    temp = prev;
                    
                    if(i==grid.length-1 && j==grid[i].length-1){
                        grid[0][0] = temp;
                    }
                }
            }
        }
        
        return new ArrayList(Arrays.asList(grid));
    }
}
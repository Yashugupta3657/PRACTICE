class pair{
int i,j,v;
public pair(int i,int j,int v)
{
this.i=i;
this.j=j;
this.v=v;
}

}
class Solution {
public int minimumEffortPath(int[][] heights) {

    PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.v-b.v);
    pq.add(new pair(0,0,0));
    int  vis[][]=new int[heights.length][heights[0].length];
    int ans=0;
    int res=Integer.MAX_VALUE;
    for(int i=0;i<vis.length;i++)
    {
        for(int j=0;j<vis[0].length;j++)
            vis[i][j]=res;
    }
    vis[0][0]=heights[0][0];
    while(pq.size()>0)
    {
        pair p=pq.poll();
        int i=p.i,j=p.j,v=p.v;
        if(i==heights.length-1 && j==heights[0].length-1)
        {
            res=Math.min(res,v);
            return res;
        }
        if(i-1>=0  && vis[i-1][j]>v)
        {
            ans=Math.max(v,Math.abs(heights[i][j]-heights[i-1][j]));
            vis[i-1][j]=ans;
            pq.offer(new pair(i-1,j,ans));
        }
        if(j+1<heights[0].length && vis[i][j+1]>v)
        {
            ans=Math.max(v,Math.abs(heights[i][j]-heights[i][j+1]));
            vis[i][j+1]=ans;
             pq.offer(new pair(i,j+1,ans));

        }
        if(i+1<heights.length && vis[i+1][j]>v)
        {
             ans=Math.max(v,Math.abs(heights[i][j]-heights[i+1][j]));
             vis[i+1][j]=ans;
              pq.offer(new pair(i+1,j,ans));

         }
        if(j-1>=0 && vis[i][j-1]>v)
        {
                                                                                                                ans=Math.max(v,Math.abs(heights[i][j]-heights[i][j-1]));
               vis[i][j-1]=ans;
               pq.offer(new pair(i,j-1,ans));

         }
                                 
                    
        
    }
   return res;
    
}
}
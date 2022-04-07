class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> m=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            m.add(stones[i]);
        }
        int a=0,b=0;
        while(m.size()>1){
            a=m.poll();
            b=m.poll();
            if(a!=b) m.add(a-b); //bcs due to sorting a willbe always greater
        }
         if(m.size()==1)
       return m.poll();
        return 0;
    }
}
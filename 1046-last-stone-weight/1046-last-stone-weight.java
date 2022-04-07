class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> m=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            m.add(stones[i]);
        }
        int a=0,b=0;
        while(!m.isEmpty()){
            a=m.poll();
            if(!m.isEmpty())
            b=m.poll();
            if(a!=b&&b>a) m.add(b-a);
            else if(a!=b&&a>b) m.add(a-b);
            if(m.size()==1)
                return m.poll();
        }
        return 0;
    }
}
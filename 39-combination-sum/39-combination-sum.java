class Solution {
    List<List<Integer>> maa=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        find(candidates,target,0,new ArrayList<Integer>());
        return maa;
    }
    public void find(int[] can,int target,int ind,List<Integer> m){
        if(target<0||ind==can.length){
            return;
        }
        else if(target==0){
            maa.add(new ArrayList<Integer>(m));
            return;
        }
        else{
            m.add(can[ind]);
            find(can,target-can[ind],ind,m);
            m.remove(m.size()-1);
            find(can,target,ind+1,m);
        }
    }
    public int check(List<Integer> m){
        int sum=0;
        for(int i=0;i<m.size();i++)
            sum+=m.get(i);
        return sum;
    }
}

// class Solution {
//     List<List<Integer>> maa=new ArrayList<>();
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         find(candidates,target,0,new ArrayList<Integer>());
//         return maa;
//     }
//     public void find(int[] can,int target,int ind,List<Integer> m){
//         if(check(m)>target||ind==can.length){
//             return;
//         }
//         else if(m.size()!=0&&check(m)==target){
//             maa.add(new ArrayList<Integer>(m));
//             return;
//         }
//         else{
//             m.add(can[ind]);
//             find(can,target,ind,m);
//             m.remove(m.size()-1);
//             find(can,target,ind+1,m);
//         }
//     }
//     public int check(List<Integer> m){
//         int sum=0;
//         for(int i=0;i<m.size();i++)
//             sum+=m.get(i);
//         return sum;
//     }
// }
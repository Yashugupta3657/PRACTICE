class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        find(nums,0,new HashSet<Integer>(),new ArrayList<Integer>());
        return list;
    }
    public void find(int[] nums,int ind,HashSet<Integer> m,List<Integer> found){
        if(found.size()==nums.length){
            list.add(new ArrayList<Integer>(found));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!m.contains(nums[i])){
                m.add(nums[i]);
                found.add(nums[i]);
                find(nums,ind,m,found);
                found.remove(found.size()-1);
                m.remove(nums[i]);
            }
        }
    }
}
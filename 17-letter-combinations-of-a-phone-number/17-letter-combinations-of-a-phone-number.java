class Solution {
    List<String> list=new ArrayList<String>(); 
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return list;
        }
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        StringBuilder sb=new StringBuilder();
        find(sb,digits,0,map);
        return list;
    }
    public void find(StringBuilder sb,String digits,int ind,Map<Character,String> map){
        if(ind>=digits.length()){
            list.add(sb.toString());
            return;
        }
        char m[]=(map.get(digits.charAt(ind))).toCharArray();
        for(char t:m){
            sb.append(t);
            find(sb,digits,ind+1,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
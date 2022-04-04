class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character> ans=new HashMap<>();
        HashMap<Character,String> ans1=new HashMap<>();
        String str[]=s.split(" ");
        char patt[]=pattern.toCharArray();
        if(str.length!=patt.length)
            return false;
        for(int i=0;i<str.length;i++){
            if(ans.containsKey(str[i])){
                if(ans.get(str[i]).equals(patt[i])){
                            continue;
                }
                return false;
            }
            else{
                ans.put(str[i],patt[i]);
            }
        }
        for(int i=0;i<str.length;i++){
            if(ans1.containsKey(patt[i])){
                if(ans1.get(patt[i]).equals(str[i])){
                            continue;
                }
                return false;
            }
            else{
                ans1.put(patt[i],str[i]);
            }
        }
        return true;
    }
}
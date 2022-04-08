class Solution {
    public char findTheDifference(String s, String t) {
        char c1[]=new char[26];
        char c2[]=new char[26];
        for(int i=0;i<s.length();i++)
            c1[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();i++)
            c2[t.charAt(i)-'a']++;
       for(int i=0;i<26;i++){
           if(c2[i]-c1[i]==1)
               return (char)(i+'a');
       }    
        return 'z';
    }
}
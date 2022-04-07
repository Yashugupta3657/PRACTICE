class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char str[]=s.toCharArray();
        while(i<j){
            if(isVowel(str[i])&&isVowel(str[j])){
                char temp=str[j];
                str[j]=str[i];
                str[i]=temp;
                i++;
                j--;
            }
            else if(!isVowel(str[i])&&!isVowel(str[j])){
                   i++;
                   j--;
               }
            else if(!isVowel(str[i])){
                           i++;
              }
                    else j--;
        }
                    return String.valueOf(str);
    }
    public boolean isVowel(char a){
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
            return true;
        return false;
    }
}
// class Solution {
//     public String reverseVowels(String s) {
//                 if(s.length()==1)
//                     return s;
//         int i=0;
//         int j=s.length()-1;
//         while(i<j){
//             if((s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U')&&(s.charAt(j)=='a'||s.charAt(j)=='A'||s.charAt(j)=='e'||s.charAt(j)=='E'||s.charAt(j)=='i'||s.charAt(j)=='I'||s.charAt(j)=='o'||s.charAt(j)=='O'||s.charAt(j)=='u'||s.charAt(j)=='U')){
//                s=s.substring(0,i)+s.charAt(j)+s.substring(i+1,j)+s.charAt(i)+s.substring(j+1);
//                 i++;
//                 j--;
//             }
//             else if((s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u'&&s.charAt(i)!='A'&&s.charAt(i)!='E'&&s.charAt(i)!='I'&&s.charAt(i)!='O'&&s.charAt(i)!='U')&&(s.charAt(j)!='a'&&s.charAt(j)!='e'&&s.charAt(j)!='i'&&s.charAt(j)!='o'&&s.charAt(j)!='u'&&s.charAt(j)!='A'&&s.charAt(j)!='E'&&s.charAt(j)!='I'&&s.charAt(j)!='O'&&s.charAt(j)!='U')){
//                 i++;
//                 j--;
//             }
//             else if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u'&&s.charAt(i)!='A'&&s.charAt(i)!='E'&&s.charAt(i)!='I'&&s.charAt(i)!='O'&&s.charAt(i)!='U'){
//                 i++;
//             }
//             else j--;
//         }
//         return s;
//     }
// }
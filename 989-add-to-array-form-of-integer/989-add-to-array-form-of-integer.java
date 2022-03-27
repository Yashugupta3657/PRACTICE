import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> mt=new ArrayList<>();
        String str="";
        for(int i=0;i<num.length;i++){
            str+=num[i];
        }
        BigInteger n=new BigInteger(str);
        BigInteger ans=n.add(new BigInteger(String.valueOf(k)));
        String str2=String.valueOf(ans);
        for(int i=0;i<str2.length();i++)
        {
            mt.add(Integer.parseInt(str2.charAt(i)+""));
        }
        return mt;
    }
}
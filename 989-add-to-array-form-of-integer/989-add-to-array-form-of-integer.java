import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] A, int k) {
          int N = A.length;
        int cur = k;
        List<Integer> ans = new ArrayList();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += A[i];
            ans.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(ans);
        return ans;
        // List<Integer> mt=new ArrayList<>();
        // String str="";
        // for(int i=0;i<num.length;i++){
        //     str+=num[i];
        // }
        // BigInteger n=new BigInteger(str);
        // BigInteger ans=n.add(new BigInteger(String.valueOf(k)));
        // String str2=String.valueOf(ans);
        // for(int i=0;i<str2.length();i++)
        // {
        //     mt.add(Integer.parseInt(str2.charAt(i)+""));
        // }
        // return mt;
    }
}
import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        String str="";
        for(int i=0;i<digits.length;i++){
            str+=digits[i];
        }
        BigInteger total;
        BigInteger a = new BigInteger(str);
        total=a.add(new BigInteger("1"));
        String str1=String.valueOf(total);
        int arr[]=new int[str1.length()];
        for(int i=0;i<str1.length();i++){
            arr[i]=Integer.parseInt(str1.charAt(i)+"");
        }
        return arr;
    }
}
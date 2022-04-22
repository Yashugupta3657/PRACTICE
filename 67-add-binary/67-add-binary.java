
// Java program to find large factorials using BigInteger
import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) { 
        BigInteger aa=new BigInteger(a,2); // binary to decimal
        BigInteger bb=new BigInteger(b,2); // binary to decimal
        BigInteger cc=aa.add(bb); // adding both in deci form
        String ans=cc.toString(2); //converting to binary string 
        return ans;
        // int n=0;
        // long decimal1=0,decimal2=0;
        // for(int i=a.length()-1;i>=0;i--){
        //      int temp=Integer.parseInt(a.charAt(i)+"");
        //     decimal1+=temp*Math.pow(2,n);
        //     n++;
        // }
        // n=0;
        // for(int i=b.length()-1;i>=0;i--){
        //      int temp=Integer.parseInt(b.charAt(i)+"");
        //     decimal2+=temp*Math.pow(2,n);
        //     n++;
        // }
        // return Long.toBinaryString(decimal1+decimal2);
        // BigInteger m=new BigInteger("1");
        // m=BigInteger.valueOf(Integer.parseInt(a,2)).add(BigInteger.valueOf(Integer.parseInt(b,2)));
        // long mm=m.longValue();
        // return Long.toBinaryString(mm);
    }
}
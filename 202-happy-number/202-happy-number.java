class Solution {
    public boolean isHappy(int n) {
        while(n!=1){
            int temp=0;
            while(n>0){
             int b=n%10;
             temp+=(b*b);
             n/=10;
          }
            n=temp;
            if(n==4){  //every non happy number will contain loop of 4;
                return false;
            }
        }
        return true;
    }
}
// class Solution {
//     public boolean isHappy(int n) {
//         HashSet<Integer> checked=new HashSet<Integer>();
//         while(n!=1&&!checked.contains(n)){
//             checked.add(n);
//             n=check(n);
//         }
//         if(n==1) return true;
//         return false;
//     }
//     public int check(int a){
//         int sum=0;
//         while(a>0){
//             int b=a%10;
//             sum+=(b*b);
//             a/=10;
//         }
//         return sum;
//     }
// }
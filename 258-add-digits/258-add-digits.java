// class Solution {
//     public int addDigits(int num) {
//         if(num<10)
//             return num;
//         while(num>=10){
//             num=check(num);
//         }
//         return num;
//     }
//     public int check(int num){
//         int sum=0;
//       while(num>0){
//           int a=num%10;
//         sum+=a;
//         num/=10;
//       }
//         return sum;
//    }
// }
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
}
//재귀함수
class Solution {
    public int solution(int n) {
       int result = 1;
       int a = 1;
        
       int i = 1;
       while(true) {
             result *= (i + 1);
            if(result > n) {
                return i;
            }
        i++;
       }
       
       
       
       
       // for(int i=1; i<=n; i++) {
       //      result *= i;
       //      if(result <= n) {
       //          return i;
       //      }
       // }
       
    }
}


//재귀함수
// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//        if(n <= 0) {
//            System.out.println("error");
//            return -1;
//        } else if(n==1) {
//            return 1;
//        } else {
//            return n * solution(n-1);
//        }
//     }
// }
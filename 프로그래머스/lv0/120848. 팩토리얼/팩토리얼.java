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
    }
}

// class Solution {
//     public int solution(int n) {
//         int fac = 1;
//         int i = 0;
//         while(true){
//             if(fac <= n){
//                 fac *= i + 1;
//                 i++;
//             }else break;
//         }
//         return i-1;
//     }
// }


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
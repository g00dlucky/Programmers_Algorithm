class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        //문자열을 이용한 방법
        for(int a=i; a<=j; a++) {
            String aStr = String.valueOf(a);
            String kStr = String.valueOf(k);
            
            String[] parts = aStr.split(kStr, -1); 
            answer += parts.length - 1; 
        }
        return answer;
    }
}

// //자릿수를 이용한 방법(k가 두자리수 이상일 때는 쓰기 어려움)
// class Solution {
//     public int solution(int i, int j, int k) {
//         int answer = 0;

//         for (int num = i; num <= j; num++){
//             int tmp = num;
//             while (tmp != 0){
//                 //1의 자리 확인
//                 if (tmp % 10 == k)
//                     answer++;
//                 //10의 자리 확인
//                 //tmp가 1일 경우에는 int형식으로 인해 0이 되기 때문에 루프가 종료됨.
//                 tmp /= 10;
//             }
//         }
//         return answer;
//     }
// }

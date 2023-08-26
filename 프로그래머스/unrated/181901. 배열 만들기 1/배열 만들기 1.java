class Solution {
    public int[] solution(int n, int k) {
        int a = n / k;
        int[] answer = new int[a];
        
        for(int i = 1 ; i <= a; i++) {
            answer[i-1] = k * i;
        }
        return answer;
    }
}

// import java.util.*;

// class Solution {
//     public int[] solution(int n, int k) {
//         List<Integer> resultList = new ArrayList<>();
        
//         for (int i = k; i <= n; i += k) {
//             resultList.add(i);
//         }
        
//         int[] resultArray = new int[resultList.size()];
//         for (int i = 0; i < resultList.size(); i++) {
//             resultArray[i] = resultList.get(i);
//         }
        
//         return resultArray;
//     }
// }

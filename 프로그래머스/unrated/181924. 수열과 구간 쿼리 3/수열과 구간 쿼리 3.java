import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOfRange(arr,0,arr.length);
        int[] answer2 = {};
        for(int i=0; i<queries.length; i++){
            int[] group = queries[i];
            //answer배열의 현재상태를 그대로 복사해오는 배열을 하나 더 선언.
            //동일 상태의 index의 value를 가져오기 위해서.
            answer2= Arrays.copyOfRange(answer,0,answer.length);
            answer[group[0]] = answer2[group[1]];
            answer[group[1]] = answer2[group[0]];
        }
        return answer;
    }
}

// import java.util.Arrays;

// class Solution {
//     public int[] solution(int[] arr, int[][] queries) {
//         int[] answer = Arrays.copyOf(arr, arr.length);

//         for (int[] query : queries) {
//             int i = query[0];
//             int j = query[1];

//             int temp = answer[i];
//             answer[i] = answer[j];
//             answer[j] = temp;
//         }

//         return answer;
//     }
// }
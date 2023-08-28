import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOfRange(arr,0,arr.length);
        int[] answer2 = {};
        for(int i=0; i<queries.length; i++){
            int[] group = queries[i];
            answer2= Arrays.copyOfRange(answer,0,answer.length);
            answer[group[0]] = answer2[group[1]];
            answer[group[1]] = answer2[group[0]];
        }
        return answer;
    }
}
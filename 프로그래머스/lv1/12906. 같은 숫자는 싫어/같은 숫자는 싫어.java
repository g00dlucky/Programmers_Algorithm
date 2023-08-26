import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(arr[0]); // 추가
        
        for(int i=1; i<arr.length; i++){ //i<arr.length에 부등호 삭제
            if(arr[i-1] != arr[i]){     //이 조건때문에. arr[i]가 outofboundexception이 나타남.
                queue.add(arr[i]);
            }
        }
        
        int[] answer = new int[queue.size()];
        int index = 0;
        
        for(int x : queue){
            answer[index++] = x;
        }

        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Arrays.sort(numbers);
        Set<Integer> set = new HashSet<>();
        int number = 0;
        for(int i=1; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                set.add(numbers[i-1] + numbers[j]);
            }
        }
        answer = new int[set.size()];
        int i = 0;
        for(int x:set){
            answer[i] = x;
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }
}
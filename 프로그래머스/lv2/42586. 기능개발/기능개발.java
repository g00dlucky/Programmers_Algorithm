import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        int[] answer = {};
      
        List<Integer> list = new ArrayList<>();
        int[] days = new int[progresses.length];
        
        for(int i=0; i<progresses.length; i++){
            days[i] = (int)(Math.ceil((100.0 - progresses[i])/ speeds[i]));
        }

        int prevDay = days[0];
        int count = 1;
        for(int j=1; j<days.length; j++){
            // 현재 기능이 이전 기능보다 더 빨리 또는 같은 시간에 완료되면 카운트를 증가.
            if(days[j] <= prevDay) {
                count++;
            } else {
                list.add(count);
                count = 1;
                prevDay = days[j];
            }
        }
        list.add(count);
    
        return list;
    }
}
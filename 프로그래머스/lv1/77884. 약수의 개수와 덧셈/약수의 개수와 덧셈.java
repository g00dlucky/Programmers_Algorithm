import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=left; i<=right; i++){
            list.add(i);
        }
        
        
        for(int i=0; i<list.size(); i++) {
            int index = 0; // index를 안으로 밀어넣어줌. 밖으로 꺼내면 for문을 돌면서 index가 더해지기 때문에.
            for(int j=1; j<=list.get(i); j++) {
                if (list.get(i) % j == 0) {
                    index++;
                }
            }    
            //이 if문도 안쪽 for문 안에서 밖으로 빼줌. 
            //안쪽에 이 for문이 있다면 j값에 의해 계속 반복됨.
            if(index % 2 == 0) {
                answer += list.get(i);
            } else {
                answer -= list.get(i);
            }
            
        }
        
        return answer;
    }
}
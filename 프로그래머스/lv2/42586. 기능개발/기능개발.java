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

// // 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// // 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
// import java.util.*;

// class Solution {
//     public int[] solution(int[] progresses, int[] speeds) {
//         Queue<Integer> q = new LinkedList<>();
//         List<Integer> answerList = new ArrayList<>();

//         for (int i = 0; i < speeds.length; i++) {
//             double remain = (100 - progresses[i]) / (double) speeds[i];
//             int date = (int) Math.ceil(remain);

//             if (!q.isEmpty() && q.peek() < date) {
//                 answerList.add(q.size());
//                 q.clear();
//             }

//             q.offer(date);
//         }

//         answerList.add(q.size());

//         int[] answer = new int[answerList.size()];

//         for (int i = 0; i < answer.length; i++) {
//             answer[i] = answerList.get(i);
//         }

//         return answer;
//     }
// }
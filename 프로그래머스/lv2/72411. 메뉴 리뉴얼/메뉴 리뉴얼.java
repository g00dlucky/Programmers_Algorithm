import java.util.*;

class Solution {
    List<String> list = new ArrayList<>();
    Map<String,Integer> map = new HashMap<>();   
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};

        
        //1. 각 order 오름차순 정렬(조합을 위해)
        for(int i=0; i<orders.length; i++){
            char[] c= orders[i].toCharArray();
            Arrays.sort(c);
            orders[i] = String.valueOf(c);
        }
        
        // 2. 각 order를 기준으로 courselength만큼의 조합 만들기
        for(int courseLength : course) {
            for(String order : orders) {
                Combination("", order, courseLength);
            }
            
        // 3. 가장 많은 조합을 answer에 저장(arraylist로 먼저 담아주기)
            if(!map.isEmpty()) {
                //맵의 밸류들을 countList에 담아줌
                List<Integer> countList = new ArrayList<>(map.values());
                //그 이유는 countList의 최대값을 쉽게 찾으려고
                int max = Collections.max(countList);
                //최소 2명 이상의 손님으로부터 주문된 구성만 코스요리 후보에 들어감
                if(max > 1) {
                    for(String key: map.keySet()){
                        if(map.get(key) == max) {
                            list.add(key);
                        }
                    }
                }
                map.clear();
            }
        }
        answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
    public void Combination(String order, String others, int count) {
        //1. 탈출조건
        if(count == 0) {
            map.put(order, map.getOrDefault(order,0)+1);
            return;
        }
         //2. 동작조건(0부터 length까지 조합)
        for(int i=0; i<others.length(); i++){
            Combination(order + others.charAt(i), 
                        others.substring(i+1), count -1 );
        }
    }
}

        // //메뉴별 총 나온 개수 확인
        // for(String key : orders) {
        //     map.put(key, map.getOrDefault(key,0)+1);
        // }
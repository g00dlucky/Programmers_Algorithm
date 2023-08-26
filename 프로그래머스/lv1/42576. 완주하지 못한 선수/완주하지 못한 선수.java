import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String x : participant) {
            map.put(x, map.getOrDefault(x,0) +1);
        }
        
        for(String x : completion) {
            map.put(x, map.get(x) -1); // -1해주는 이유는 완주 못한 사람만을 남기기 위해. 
        }
        
        for(String key : map.keySet()){
            if(map.get(key) > 0 ) {
                return key;
            }
        }
// participant 배열을 순회하며, 각 이름을 HashMap에 키로 추가하고 해당 이름의 값에 1을 더합니다. 
// 여기서 동일한 이름이 중복될 수 있기 때문에 getOrDefault를 사용하여 기본값을 0으로 설정하고, 기존 값에 1을 더해줍니다.

// completion 배열을 순회하며, 각 이름을 HashMap에서 찾아 해당 이름의 값에 1을 빼줍니다. 
// 이 단계에서 완주한 선수들을 처리하고 남은 이름들의 값은 0 또는 음수가 됩니다.

// HashMap의 모든 키를 순회하며, 값이 1보다 큰 경우(즉, 완주하지 못한 선수의 경우) 해당 이름을 반환합니다.

// 만약 모든 이름이 완주했거나 완주하지 못한 선수가 없는 경우 빈 문자열 ""을 반환합니다.        
        
        
        return "";
    }
}


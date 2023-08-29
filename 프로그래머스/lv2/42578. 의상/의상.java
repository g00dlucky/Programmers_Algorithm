import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> clothesMap = new HashMap<>();
        
        // 의상의 종류별로 의상의 수를 세기
        for (String[] c : clothes) {
            String type = c[1];
            clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
        }
        
        int answer = 1;
        
        // (의상의 수 + 1)을 곱하여 모든 종류의 조합 구하기
        for (int value : clothesMap.values()) {
            answer *= (value + 1);
        }
        
        // 모든 종류의 조합을 곱한 후, 아무 의상도 입지 않는 경우인 1을 빼기
        return answer - 1;
    }
}

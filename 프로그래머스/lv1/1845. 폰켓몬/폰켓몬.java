import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        //선택가능한 최대 종류수 = 마리수
        int maxKinds = nums.length / 2;
        
        //종류마다 몇 마리가 있는지 세기
        //HashSet으로 중복을 없앨수도 있음
        for(int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
// countMap 생성 및 값 카운트:

// num = 3: countMap에 3을 키로 가지는 값이 없으므로 getOrDefault(3, 0)은 0을 반환하고, 여기에 + 1을 하여 1이 됩니다.
// num = 1: countMap에 1을 키로 가지는 값이 없으므로 getOrDefault(1, 0)은 0을 반환하고, 여기에 + 1을 하여 1이 됩니다.
// num = 2: countMap에 2를 키로 가지는 값이 없으므로 getOrDefault(2, 0)은 0을 반환하고, 여기에 + 1을 하여 1이 됩니다.
// num = 3: countMap에 3을 키로 가지는 값이 이미 1로 저장되어 있으므로 getOrDefault(3, 0)은 1을 반환하고, 여기에 + 1을 하여 2가 됩니다.
                    
        //전체 종류 수 확인.(키값의 개수)  = 선택 가능한 실제종류 수          
        int realSize = map.size();
        
        //선택가능한 최대 종류수와, 실제 종류 수 비교
        //선택가능한 최대종류를 넘을 수 없기 때문에 Math.min사용
        answer = Math.min(maxKinds, realSize);
        
        return answer;
    }
}
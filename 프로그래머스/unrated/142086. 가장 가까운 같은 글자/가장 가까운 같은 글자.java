import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        char[] c = s.toCharArray();
        int[] answer = new int[c.length];
        int index = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<c.length; i++){
            if(map.containsKey(c[i])){
                int lastIndex = map.get(c[i]);
                answer[i] = i - lastIndex;
            } else {
                answer[i] = -1;
            }
            
            map.put(c[i],i);
        }
        
        
        return answer;
    }
}
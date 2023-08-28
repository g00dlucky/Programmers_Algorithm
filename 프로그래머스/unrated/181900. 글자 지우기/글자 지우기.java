import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        List<String> list = new ArrayList<>();
        String[] strArr = my_string.split("");
        boolean[] isPresent = new boolean[my_string.length()];
        
        for(int x : indices) {
           isPresent[x] = true;
        }
        
        for(int i=0; i<strArr.length; i++) {
            if(!isPresent[i]) {
                list.add(strArr[i]);
            }
        }
        
        for(String x : list) {
            answer += x;
        }

        return answer;
    }
}
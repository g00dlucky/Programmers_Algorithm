import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] strArr = my_string.split("");
        
        for(int i=0; i<indices.length; i++) {
            strArr[indices[i]] = "";
        }
        
        for(String x : strArr) {
            answer += x;
        }
        
        return answer;
    }
}


//boolean을 이용하는 방법
// import java.util.*;

// class Solution {
//     public String solution(String my_string, int[] indices) {
//         String answer = "";
//         List<String> list = new ArrayList<>();
//         String[] strArr = my_string.split("");
//         boolean[] isPresent = new boolean[my_string.length()];
        
//         for(int x : indices) {
//            isPresent[x] = true;
//         }
        
//         for(int i=0; i<strArr.length; i++) {
//             if(!isPresent[i]) {
//                 list.add(strArr[i]);
//             }
//         }
        
//         for(String x : list) {
//             answer += x;
//         }

//         return answer;
//     }
// }
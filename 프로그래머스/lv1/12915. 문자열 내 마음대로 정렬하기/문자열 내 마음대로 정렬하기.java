import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        List<String> arr = new ArrayList<>();
        
        for(int i=0; i<strings.length; i++){
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(arr);
        
        String[] answer = new String[arr.size()];
        
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i).substring(1,arr.get(i).length());
        }
        
        
        
        return answer;
    }
}

// class Solution {
//     public List<String> solution(String[] strings, int n) {
//         List<String> answer = new ArrayList<>();
//         Map<Character,String> map = new HashMap<>();
//         for(int i=0; i<strings.length; i++){
//             map.put(strings[i].charAt(n), strings[i]);
//         }
//         List<Character> sortedKeys = new ArrayList<>(map.keySet());
//         Collections.sort(sortedKeys);
//         for (char c : sortedKeys) {
//             answer.add(map.get(c));
//         }
//         return answer;
//     }
// }
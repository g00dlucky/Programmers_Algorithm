class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] a = num_str.toCharArray();
        
        for(int i = 0; i < a.length; i++) {
            answer = answer + Character.getNumericValue(a[i]);
        }
        
        return answer;
    }
}




// class Solution {
//     public int solution(String num_str) {
//         int answer = 0;

//         for(String item : num_str.split("")) {
//             answer += Integer.parseInt(item);
//         }
//         return answer;
//     }
// }
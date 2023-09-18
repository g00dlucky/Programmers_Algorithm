class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        
        for(int i = 0; i < k; i++) {
            answer = answer.concat(my_string);
        }

        
        return answer;
    }
}

//String repeated = "abc".repeat(3);



// class Solution {
//     public String solution(String my_string, int k) {
//         StringBuilder sb = new StringBuilder();
//         for (int i=0; i<k; i++) {
//             sb.append(my_string);
//         }
//         return sb.toString();
//     }
// }
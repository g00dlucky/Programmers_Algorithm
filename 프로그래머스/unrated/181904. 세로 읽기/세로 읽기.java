// import java.util.*;

// class Solution {
//     public String solution(String my_string, int m, int c) {
//         String answer = "";
//         StringBuilder sb =new StringBuilder();
        
        
//         String[][] a = new String[(int) Math.ceil((double) my_string.length() / m)][m];
//         String[] b = my_string.split("");
//         int index = 0;
        
//         for(int i=0; i<a.length; i++){
//             for(int j=0; j<m; j++) {
//                 a[i][j] = b[index++];
//             }
//         }
//         for(int k=0; k<a.length; k++) {
//             sb.append(a[k][c-1]);
//         }
        
//         answer = sb.toString();
//         return answer;
//     }
// }


class Solution {

    public String solution(String my_string, int m, int c) {
        String answer = "";

        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] a = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char x : a) {
                if(x == ' ') {
                    x = ' ';
                } else {
                    char base = Character.isLowerCase(x) ? 'a' : 'A';
                    x = (char)(((x - base + n) % 26) + base);
                }
            sb.append(x);

        }
        
        answer = sb.toString();
        return answer;
    }
}


// class Solution {
//     public String solution(String s, int n) {
//         String answer = "";
        
//         char[] a = s.toCharArray();
//         StringBuilder sb = new StringBuilder();
        
//         for(char x : a) {

//                 if(x == 'z'){
//                     x = (char)((int)'a' -1 + n);
//                 } else if(x == ' ') {
//                     x = ' ';

//                 } else {
//                     if((char)((int)x + n) > 'z') {
                        
//                     } else {
//                          x = (char)((int)x + n); //n값 때문에 문자값 밖으로 값이 넘어갈 수 있음.
//                     }


//                 }
//             sb.append(x);

//         }
        
//         answer = sb.toString();
//         return answer;
//     }
// }
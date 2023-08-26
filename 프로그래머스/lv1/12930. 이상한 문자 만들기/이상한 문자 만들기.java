class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        int index = 0;
        for(int i=0; i<str.length; i++){
            if(str[i].equals(" ")){
                index = 0;
            }
            else if(index % 2 == 0){
                str[i]=str[i].toUpperCase();
                index++;
            } else if(index % 2 != 0){
                str[i]=str[i].toLowerCase();
                index++;
            }
            answer += str[i];
        }
        
        return answer;
    }
}

// class Solution {
//     public String solution(String s) {
//         String answer = "";
//         String[] strArr = s.split(" ");
        
//         for(int i=0; i<strArr.length; i++){
//             StringBuilder modifiedWord = new StringBuilder();
//             for(int j=0; j<strArr[i].length(); j++){
//                 char c = strArr[i].charAt(j);
//                 if(j % 2 == 0) {
//                     modifiedWord.append(Character.toUpperCase(c));
//                 } else {
//                     modifiedWord.append(Character.toLowerCase(c));
//                 }
//             }
//             strArr[i] = modifiedWord.toString();
//         }
        
//         answer = String.join(" ", strArr);
//         return answer;
//     }
// }

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        //String[] strArr = s.split("");
        
        char[] charArr = s.toCharArray();
        
        if((s.length() == 4 || s.length() == 6)){
            
            for(char x : charArr) {
                //문자가 숫자가 아닌경우 -1
                if(!(Character.isDigit(x))){
                    answer = false;
                    break;
                } 
            }
        } else {
            answer = false;
        }
        
        
        return answer;
    }
}


// class Solution {
//   public boolean solution(String s) {
//       boolean answer = true;

//       if(s.length() != 4 && s.length() != 6){
//           answer = false;
//           return answer;
//       }
//       for(int i = 0; i < s.length(); i++){
//           if(!('0' <= s.charAt(i) && s.charAt(i) <= '9'))
//               answer = false;
//       }
//       return answer;
//   }
// }
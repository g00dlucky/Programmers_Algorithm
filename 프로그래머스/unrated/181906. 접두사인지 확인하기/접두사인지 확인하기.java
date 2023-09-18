class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        if(my_string.length() <= 100 && is_prefix.length() <=100) {
            //String[] a = my_string.split(is_prefix);
            //if (a[0].equals(is_prefix))  {
            if(my_string.startsWith(is_prefix)) {
                answer = 1;
            } else {
                answer = 0;
            }
        }
        
        return answer;
    }
}

//정석
// class Solution {
//     public int solution(String my_string, String is_prefix) {
//         int answer=0;
//         if (my_string.length()>=is_prefix.length()){
//             String cnt=my_string.substring(0,is_prefix.length());

//             if(cnt.equals(is_prefix)) answer=1;
//         }
//         return answer;
//     }
// }